import com.alex.context.Container;
import com.alex.entity.UserEntity;
import com.alex.service.UserService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author alex
 * @Title: Fun
 * @ProjectName spring
 * @Description: 测试入口类
 * @date 2019/1/5  13:59
 */
public class Fun {
    
    @Test
    public void echo(){
        ClassPathXmlApplicationContext context = Container.getContextFromClassPathXmlApplicationContext();
        UserService userSerice = context.getBean("userSerice", UserService.class);
        UserEntity userEntity = userSerice.queryUserById(1);
        String json = JSON.toJSONString(userEntity);
        System.out.println(json);
    }
}
