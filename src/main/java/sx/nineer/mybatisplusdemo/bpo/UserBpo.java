package sx.nineer.mybatisplusdemo.bpo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import sx.nineer.mybatisplusdemo.entity.User;

import java.util.List;

public interface UserBpo extends IService<User> {

    /**
     * 获取所有用户数据
     * @return
     */
    List<User> getAll();

    /**
     * 分页获取所有数据
     * @param page
     * @param age
     * @return
     */
    IPage<User> selectUserPage(Page<User> page, Integer age);
}
