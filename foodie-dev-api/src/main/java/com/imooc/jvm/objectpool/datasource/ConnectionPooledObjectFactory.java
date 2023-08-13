package com.imooc.jvm.objectpool.datasource;

import lombok.Data;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.sql.*;

/**
 * @author :Administrator
 * @path :ConnectionPooledObjectFactory
 * @date :2023-08-13 21:23:52
 * @describe :class
 */
@Data
public class ConnectionPooledObjectFactory implements PooledObjectFactory<MyConnection> {
    private ObjectPool<MyConnection> objectPool;
    @Override
    public PooledObject<MyConnection> makeObject() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/foodie-shop-dev?useUnicode=true&characterEncoding=utf-8&autoReconnect=true",
                "root",
                "123123"
        );
        MyConnection myConnection = new MyConnection();
        myConnection.setConnection(connection);

        return new DefaultPooledObject<>(myConnection);
    }

    @Override
    public void destroyObject(PooledObject<MyConnection> pooledObject) throws Exception {
        pooledObject.getObject().close();
    }

    @Override
    public boolean validateObject(PooledObject<MyConnection> pooledObject) {
        Connection connection = pooledObject.getObject();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT 1");
            ResultSet resultSet = preparedStatement.executeQuery();
            int i = resultSet.getInt(1);
            return i == 1;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void activateObject(PooledObject<MyConnection> pooledObject) throws Exception {
// 可以把connection额外的配置放到这里
    }

    @Override
    public void passivateObject(PooledObject<MyConnection> pooledObject) throws Exception {
        // 留空 钝化
        MyConnection myConnection = pooledObject.getObject();
        Statement statement = myConnection.getStatement();
        if (statement != null) {
            statement.close();
        }

    }
}
