package com.learning.netty.rpc.service;


import com.learning.netty.entity.User;
import com.learning.netty.exception.ErrorParamsException;

/**
 * 测试Service
 * <p>
 */
public interface DemoService {

    /**
     * 除法运算
     *
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 结果
     */
    double division(int numberA, int numberB) throws ErrorParamsException;

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    User getUserInfo();

    /**
     * 打印方法
     *
     * @return 一个字符串
     */
    String print();

    /**
     * 求和方法
     *
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 两数之和
     */
    int sum(int numberA, int numberB);
}
