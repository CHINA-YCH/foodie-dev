package com.imooc.jvm.objectpool.commonspool;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author :Administrator
 * @path :MoneyPooledObjectFactory
 * @date :2023-08-13 20:40:47
 * @describe :class
 */
public class MoneyPooledObjectFactory implements PooledObjectFactory<Money> {

    public static final Logger LOGGER = LoggerFactory.getLogger(MoneyPooledObjectFactory.class);

    /**
     * 创建一个对象实例并将其包装成一个PooledObject
     *
     * @return
     * @throws Exception
     */
    @Override
    public PooledObject<Money> makeObject() throws Exception {
        DefaultPooledObject<Money> object = new DefaultPooledObject<>(new Money("USD", new BigDecimal("1")));
        LOGGER.info("makeObject..state= {}", object.getState());
        return object;
    }

    @Override
    public void destroyObject(PooledObject<Money> pooledObject) throws Exception {
        LOGGER.info("destroyObject..state= {}", pooledObject.getState());

    }

    /**
     * 校验对象 确保对象池返回的对象是ok的
     *
     * @param pooledObject
     * @return
     */
    @Override
    public boolean validateObject(PooledObject<Money> pooledObject) {
        LOGGER.info("validateObject..state= {}", pooledObject.getState());
        return true;
    }

    /**
     * 重新初始化对象
     *
     * @param pooledObject
     * @throws Exception
     */
    @Override
    public void activateObject(PooledObject<Money> pooledObject) throws Exception {
        LOGGER.info("activateObject..state= {}", pooledObject.getState());
    }

    /**
     * 取消初始化对象
     *
     * @param pooledObject
     * @throws Exception
     */
    @Override
    public void passivateObject(PooledObject<Money> pooledObject) throws Exception {
        LOGGER.info("passivateObject..state= {}", pooledObject.getState());
    }
}
