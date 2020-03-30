import com.flash.ProviderUserApplication8003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * redis测试
 * @Author: LiLiang
 * @Date: 2019/12/19 13:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderUserApplication8003.class)
@WebAppConfiguration
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void getCache() {
        //redisTemplate.opsForValue().set("name1","hello2");

        String name2 = stringRedisTemplate.opsForValue().get("name2");
        System.out.println(name2);

    }



}