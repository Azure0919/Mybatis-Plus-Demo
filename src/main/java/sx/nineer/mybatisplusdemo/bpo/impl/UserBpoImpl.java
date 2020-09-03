package sx.nineer.mybatisplusdemo.bpo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sx.nineer.mybatisplusdemo.bpo.UserBpo;
import sx.nineer.mybatisplusdemo.dao.UserMapper;
import sx.nineer.mybatisplusdemo.entity.User;

import java.util.List;

/**
 * @Author Shaoxia Peng
 * @Date 2020/9/3 10:12
 * @Description: TODO
 * @Version: V1.0
 **/
@Service
public class UserBpoImpl extends ServiceImpl<UserMapper, User> implements UserBpo {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    @Override
    public IPage<User> selectUserPage(Page<User> page, Integer age) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return userMapper.selectPageVo(page, age);
    }
}
