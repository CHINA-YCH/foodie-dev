package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author :Administrator
 * @path :StuServiceImpl
 * @date :2023-06-11 17:28:56
 * @describe :class
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    /**
     * 事务传播 - Propagation
     * REQUIRED：   使用当前的事务，如果当前没有事务，则自己新建一个事务，子方法是必须运行在一个事务中的；
     * 如果当前存在事务，则加入这个事务，成为一个整体
     * 举例：领导没饭吃，我有钱，我会自己买了自己吃；领导有的吃，会分给你一起吃。
     * 适用增删改
     * SUPPORTS：   如果当前有实物，则使用事务；如果当前没有事务，则不使用事务
     * 举例：领导没饭吃，我也没饭吃，领导有饭吃，我也有饭吃
     * 主要用于查询
     * MANDATORY  该传播属性强制必须存在一个事物，如果不存在，则抛出异常
     * 举例：领导必须管饭，不管饭没饭吃，我就不干了（抛出异常）
     * REQUIRES_NEW  如果当前有事务，则挂起该事务，并且自己创建一个新的事物给自己使用；
     * 如果当前没有事务，则同REQUIRED
     * 举例：领导有饭吃，我偏不要，我自己买了自己吃
     * NOT_SUPPORTED 如果当前有事务，则把事务挂起，自己不使用事物去运作数据库操作
     * 举例：领导有饭吃，分一点给你，我太忙了，放一边去，我不吃
     * NEVER          如果当前有事务存在，则抛出异常
     * 举例：领导有饭给你吃，我不想吃，我热爱工作，我抛出异常
     * NESTED         如果当前有事务，则开启子事务（嵌套事务），嵌套事务是独立提交或者回滚；
     * 如果当前没有事务，则同 REQUIRED
     * 但是如果主事务提交，则会携带子事务一起提交
     * 如果主事务回滚， 则子事务会一起回滚。相反，子事务异常，则父事务可以回滚或不会滚
     * 举例：领导决策不对，老板怪罪，领导带着小弟一同受罪、小弟出了差错，领导可以推卸责任
     *
     * @param id -
     * @return -
     */

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {

        return stuMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    @Override
    public void saveStu() {
        Stu stu = new Stu();
        stu.setName("jack");
        stu.setAge(19);
        stuMapper.insert(stu);

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    @Override
    public void updateStu(int id) {
        Stu stu = new Stu();
        stu.setId(id);
        stu.setName("lucy");
        stu.setAge(20);
        stuMapper.updateByPrimaryKey(stu);

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    @Override
    public void deleteStu(int id) {
        stuMapper.deleteByPrimaryKey(id);

    }
}
