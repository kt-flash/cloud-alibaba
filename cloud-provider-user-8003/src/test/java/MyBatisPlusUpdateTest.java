import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.flash.ProviderUserApplication8003;
import com.flash.common.entity.User;
import com.flash.mapper.UserMapper;
import com.flash.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Mybatis Plus测试
 * @Author: LiLiang
 * @Date: 2019/12/5 13:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderUserApplication8003.class)
@WebAppConfiguration
public class MyBatisPlusUpdateTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;


    @Test
    public void insert() {
        User user = new User();
        user.setAge(16);
        user.setEmail("32fdf6fgg465@qq.com");
        user.setName("Sue2");
        userMapper.insert(user);
        System.out.println(user.getId());
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setId(10L);
        user.setAge(17);
        user.setEmail("4764576@qq.com");
        user.setName("Ken2");
        user.setVersion(1);

        int i = userMapper.updateById(user);
        System.out.println(user);
    }

    @Test
    public void updateByWrapper() {
        User user = new User();
        user.setAge(18);
        user.setEmail("4764576@qq.com");
        user.setName("Ken");

        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("name","Ken2").eq("age","17");

        userMapper.update(user, wrapper);
        System.out.println(user);
    }

    @Test
    public void delete() {
        userMapper.deleteById(1);
    }

    @Test
    public void deleteByService() {
        userService.removeById(1);
    }


    @Test
    public void deleteByMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","David");
        map.put("age",12);

        userMapper.deleteByMap(map);
    }
}