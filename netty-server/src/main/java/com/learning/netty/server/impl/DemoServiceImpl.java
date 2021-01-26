package com.learning.netty.server.impl;

import com.learning.netty.entity.User;
import com.learning.netty.exception.ErrorParamsException;
import org.springframework.stereotype.Service;
import com.learning.netty.rpc.service.DemoService;

/**
 * 测试Service实现类
 * <p>
 *
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public double division(int numberA, int numberB) throws ErrorParamsException {
        if (numberB == 0) {
            throw new ErrorParamsException("除数不能为0");
        }
        return numberA / numberB;
    }

    @Override
    public User getUserInfo() {
        User leader = new User();
        leader.setId(1);
        leader.setName("上级");
        leader.setSource(100);
        User user = new User();
        user.setSource(80);
        user.setId(0);
        user.setName("基层");
        user.setLeader(leader);
        return user;
    }

    @Override
    public String print() {
        return "这是来自服务器中DemoService接口的print方法打印的消息";
    }

    @Override
    public int sum(int numberA, int numberB) {
        return numberA + numberB;
    }
}
