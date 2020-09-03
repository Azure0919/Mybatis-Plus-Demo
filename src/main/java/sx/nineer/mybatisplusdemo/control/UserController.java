package sx.nineer.mybatisplusdemo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sx.nineer.mybatisplusdemo.bpo.UserBpo;
import sx.nineer.mybatisplusdemo.entity.User;

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

    @Autowired
    private UserBpo userBpo;

    @RequestMapping("/getAll")
    public List<User> getAll(){
        return  userBpo.getAll();
    }

}
