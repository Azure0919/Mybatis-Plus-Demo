package sx.nineer.mybatisplusdemo.util;

/**
 * @Author Shaoxia Peng
 * @Date 2020/9/3 15:04
 * @Description: TODO
 * @Version: V1.0
 **/
public class ExceptionUtil extends RuntimeException {
    private String msg;

    public ExceptionUtil(String msg){
        super(msg);
        this.msg = msg;
    }
}
