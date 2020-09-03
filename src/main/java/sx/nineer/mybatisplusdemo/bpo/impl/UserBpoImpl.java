package sx.nineer.mybatisplusdemo.bpo.impl;

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
public class UserBpoImpl implements UserBpo {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userMapper.selectList(null);
    }
}
