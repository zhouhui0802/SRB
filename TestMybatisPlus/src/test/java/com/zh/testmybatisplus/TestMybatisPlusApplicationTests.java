package com.zh.testmybatisplus;

import com.zh.entity.User;
import com.zh.mapper.UserMapper;
import com.zh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class TestMybatisPlusApplicationTests {

    // @Autowired  //按照默认类型装配  是Spring的注解
    @Resource
    private UserMapper userMapper;



    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("Hellen");
        user.setAge(18);

        int result = userMapper.insert(user);
        System.out.println("影响的行数: "+result);
        System.out.println("id: "+user.getId());
    }

    @Test
    public void testSelect(){
        //按照ID查询
        User user=userMapper.selectById(1);
        System.out.println(user);

        //按照ID列表查询
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1,2,3));
        users.forEach(System.out::println);

        //按照条件查询
        Map<String,Object> map=new HashMap<>();
        map.put("name","Hellen");
        map.put("age",18);
        List<User> users1=userMapper.selectByMap(map);
        users1.forEach(System.out::println);

    }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setId(1L);
        user.setAge(28);

        int result = userMapper.updateById(user);
        System.out.println("影响的行数: "+result);
    }

    @Test
    public void testDelete(){
        int result = userMapper.deleteById(5);
        System.out.println("影响的行数: "+result);
    }

}
