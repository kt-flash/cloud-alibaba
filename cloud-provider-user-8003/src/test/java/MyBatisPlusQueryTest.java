import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mybatis Plus测试
 * @Author: LiLiang
 * @Date: 2019/12/5 13:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderUserApplication8003.class)
@WebAppConfiguration
public class MyBatisPlusQueryTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void selectList() {
        List<User> userList = userMapper.selectList(null);
    }

    @Test
    public void selectById() {
        User user = userMapper.selectById(8);
    }

    @Test
    public void selectByIds() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(4,5,6));
        users.forEach(System.out::println);
    }

    @Test
    public void selectByWrapperEntity() {
        User user = new User();
        user.setAge(12);
        user.setName("David");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        List<User> users = userMapper.selectList(queryWrapper);
    }

    @Test
    public void selectByWrapperAllEq() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        Map<String,Object> map = new HashMap<>();
        map.put("name","David");
        map.put("age",12);
        queryWrapper.allEq(map);

        List<User> users = userMapper.selectList(queryWrapper);
    }

    @Test
    public void selectByWrapper() {
        Page<User> page = new Page<>(1,4);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(1==1, "age", 12);
        queryWrapper.likeRight("name","David");
        queryWrapper.eq("invalid", 0);
        queryWrapper.inSql("id","7,8");

        IPage<User> users = userMapper.selectPage(page, queryWrapper);
    }

    @Test
    public void selectByWrapper2() {
        Page<User> page = new Page<>(1,4);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.apply(1==1, "date_format(ctime, '%Y-%m-%d') = {0}", "2019-11-30");

        IPage<User> users = userMapper.selectPage(page, queryWrapper);
    }

    @Test
    public void selectByWrapper3() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.last("limit 1");

        User user = userMapper.selectOne(queryWrapper);
    }

    @Test
    public void selectMaps() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("avg(age) avg_age");

        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
    }

    @Test
    public void selectLambda() {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.lambdaQuery();
        lambdaQuery.like(User::getName,"David").gt(User::getAge,10);

        List<Map<String, Object>> maps = userMapper.selectMaps(lambdaQuery);
    }

    @Test
    public void selectCount() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age",10);
        Integer count = userMapper.selectCount(queryWrapper);
    }

    @Test
    public void selectPageVoCustom() {
        Page<User> page = new Page<>(1,2);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(1==1, "age", 12);
        queryWrapper.eq("invalid", 0);

        userMapper.selectPageVo(page, queryWrapper);
    }

    @Test
    public void selectByServiceChain() {
        List<User> list = userService.lambdaQuery().gt(User::getAge, 10)
                .eq(User::getManagerId, 2).list();
    }

}