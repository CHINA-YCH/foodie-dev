package com.imooc.jvm.objectpool.commonspool;

import org.apache.commons.pool2.impl.GenericObjectPool;

/**
 * @author :Administrator
 * @path :CommonsPool2Test
 * @date :2023-08-13 20:39:32
 * @describe :class
 */
public class CommonsPool2Test {
    public static void main(String[] args) throws Exception {

        GenericObjectPool<Money> pool = new GenericObjectPool<>(new MoneyPooledObjectFactory());
        Money money = pool.borrowObject();
        money.setType("RMB");
        pool.returnObject(money);

    }
}
