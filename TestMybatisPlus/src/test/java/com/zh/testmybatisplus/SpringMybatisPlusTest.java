package com.zh.testmybatisplus;

import com.zh.entity.User;
import com.zh.mapper.UserMapper;
import com.zh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SpringMybatisPlusTest {

    /*
    @Resource
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        long count= userService.count();
        System.out.println(count);
    }

    @Test
    public void testSaveBatch(){
        ArrayList<User> users=new ArrayList<User>();
        for(int i=1;i<=10;i++){
            User user=new User();
            user.setName("Hellen"+i);
            user.setAge(10+i);
            users.add(user);
        }

        userService.saveBatch(users);
    }

    @Test
    public void testSelectAllByName(){
        List<User> users=userMapper.selectAllByName("Hellen");
        users.forEach(System.out::println);
    }

    @Test
    public void testListAllByName(){
        List<User> users=userService.listAllByName("Hellen");
        users.forEach(System.out::println);
    }

    */

}
