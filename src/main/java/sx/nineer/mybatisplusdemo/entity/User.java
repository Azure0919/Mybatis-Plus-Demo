package sx.nineer.mybatisplusdemo.entity;

import lombok.Data;

/**
 * @Author Shaoxia Peng
 * @Date 2020/9/3 10:03
 * @Description: TODO
 * @Version: V1.0
 **/

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
