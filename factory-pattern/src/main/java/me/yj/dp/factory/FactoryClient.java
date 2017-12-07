package me.yj.dp.factory;

/**
 * Created by MeYJ on 2017/12/7.
 * Factory Client
 */
public class FactoryClient {

    public static void main(String[] args)
            throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        // 使用Enum可以防止传入错误类型
        // 此种方式每次增加新的db类型都需要修改factory
        DbConnectionFactory factory = new DbConnectionFactory();
        DbConnection dbConnection = factory.getDbConnection(DbType.MYSQL);
        dbConnection.connect();

        dbConnection = factory.getDbConnection(DbType.ORACLE);
        dbConnection.connect();

        dbConnection = factory.getDbConnection(DbType.SQL_SERVER);
        dbConnection.connect();

        System.out.println("==========================");

        // 优化：使用反射的方式可以解决新增类型需要修改factory的问题
        dbConnection = factory.getDbConnection(DbType.MYSQL.getDbTypeClassName());
        dbConnection.connect();

        dbConnection = factory.getDbConnection(DbType.ORACLE.getDbTypeClassName());
        dbConnection.connect();

        dbConnection = factory.getDbConnection(DbType.SQL_SERVER.getDbTypeClassName());
        dbConnection.connect();
    }

}
