package sx.nineer.mybatisplusdemo.control;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sx.nineer.mybatisplusdemo.bpo.UserBpo;
import sx.nineer.mybatisplusdemo.entity.User;
import sx.nineer.mybatisplusdemo.util.PageUtil;
import sx.nineer.mybatisplusdemo.util.PageVo;
import sx.nineer.mybatisplusdemo.util.Result;
import sx.nineer.mybatisplusdemo.util.ResultUtil;

import java.util.List;

/**
 * @Author Shaoxia Peng
 * @Date 2020/9/3 10:13
 * @Description: TODO
 * @Version: V1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    //自动注入注解
    @Autowired
    private UserBpo userBpo;

    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return  userBpo.getAll();
    }

    /**
     * 分页获取所有用户
     * @param page 分页参数
     * @param age  查询条件
     * @return
     */
    @RequestMapping(value = "/selectPageVo", method = RequestMethod.GET)
    public IPage<User> selectPageVo(Page<User> page, Integer age){
        //设置页面大小
        page.setSize(1);
        return userBpo.selectUserPage(page,age);
    }

    /**
     * 分页获取所有数据
     * 添加了Result封装结果集
     * @param user
     * @param page
     * @return
     */
    @RequestMapping(value = "/getAllByPage", method = RequestMethod.GET)
    public Result<IPage<User>> getUserByPage(User user,  PageVo page) {
        //生成分页容器
        IPage<User> data = null;
        //查询条件封装对象
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        //结果集分页
        data = userBpo.page(PageUtil.initMpPage(page), userQueryWrapper);
        return new ResultUtil<IPage<User>>().setData(data);
    }

    /**
     * 新增用户
     * @return
     */
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public Result<User> saveUser(@Validated User user){
        boolean flag = userBpo.save(user);
        if(flag){
           return ResultUtil.success("添加成功");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }

    /**
     * 删除用户
     * @return
     */
    @RequestMapping(value = "/delUser",method = RequestMethod.DELETE)
    public Result<User> delUser(Integer id){
        boolean flag = userBpo.removeById(id);
        if(flag){
            return ResultUtil.success("删除成功");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }

}
