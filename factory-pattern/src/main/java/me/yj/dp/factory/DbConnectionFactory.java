package me.yj.dp.factory;

/**
 * Created by MeYJ on 2017/12/7.
 * DB Connection Factory
 */
public class DbConnectionFactory {

    public DbConnection getDbConnection(DbType dbType) {
        switch (dbType) {
            case MYSQL:
                return new MysqlConnection();
            case ORACLE:
                return new OracleConnection();
            case SQL_SERVER:
                return new SqlServerConnection();
            default:
                return null;
        }
    }

    public DbConnection getDbConnection(String dbTypeClassName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (DbConnection) Class.forName(dbTypeClassName).newInstance();
    }

}
