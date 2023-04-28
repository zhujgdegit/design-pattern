package pattern.create.application.sinleton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author zhujg
 * @date 2023/4/28 21:07
 * @Version 1.0
 *
 *
 * 使用单例模式实现数据库连接池：
 * 在Web应用中，数据库连接是非常频繁地使用的资源，为了提高性能和效率，可以使用数据库连接池来管理数据库连接，而单例模式可以保证只有一个连接池实例，避免了重复创建和销毁连接池对象的开销。
 *
 */
public class DBConnectionPool {
    // 私有静态变量，用于保存唯一实例
    private static DBConnectionPool instance;
    // 数据库连接池
    private List<Connection> pool;

    // 私有构造方法，避免其他类创建对象
    private DBConnectionPool() {
        // 初始化连接池
        pool = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Connection conn = createConnection();
            pool.add(conn);
        }
    }

    // 公有静态方法，获取唯一实例
    public static synchronized DBConnectionPool getInstance() {
        if (instance == null) {
            instance = new DBConnectionPool();
        }
        return instance;
    }

    // 创建数据库连接
    private Connection createConnection() {
        Connection conn = null;
        // TODO: 创建数据库连接
        return conn;
    }

    // 获取连接池中的数据库连接
    public synchronized Connection getConnection() {
        Connection conn = null;
        if (pool.size() > 0) {
            conn = pool.remove(0);
        }
        return conn;
    }

    // 将连接归还连接池
    public synchronized void releaseConnection(Connection conn) {
        if (conn != null) {
            pool.add(conn);
        }
    }
}
