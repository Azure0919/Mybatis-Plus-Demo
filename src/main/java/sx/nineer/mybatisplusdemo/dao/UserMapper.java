package sx.nineer.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import sx.nineer.mybatisplusdemo.entity.User;


@Repository
public interface UserMapper extends BaseMapper<User> {

}
