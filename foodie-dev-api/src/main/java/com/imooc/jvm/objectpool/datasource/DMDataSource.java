package com.imooc.jvm.objectpool.datasource;

import lombok.Data;
import org.apache.commons.pool2.impl.GenericObjectPool;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author :Administrator
 * @path :DMDataSource
 * @date :2023-08-13 21:29:04
 * @describe :class
 */
@Data
public class DMDataSource implements DataSource {

    private GenericObjectPool<MyConnection> pool;

    public DMDataSource() {
        ConnectionPooledObjectFactory factory = new ConnectionPooledObjectFactory();
        this.pool = new GenericObjectPool<>(factory);
        factory.setObjectPool(pool);
    }

    @Override
    public Connection getConnection() throws SQLException {
        try {
            return this.pool.borrowObject();
        } catch (Exception e) {
            throw new SQLException("获取连接失败！", e);
        }
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return this.getConnection();
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        throw new UnsupportedOperationException("不支持的操作！");
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new UnsupportedOperationException("不支持的操作！");
    }
}
