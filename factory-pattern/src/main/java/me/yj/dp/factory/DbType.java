package me.yj.dp.factory;

/**
 * Created by MeYJ on 2017/12/7.
 * Db Type list
 */
public enum DbType {

    MYSQL("me.yj.dp.factory.MysqlConnection"), ORACLE("me.yj.dp.factory.OracleConnection"), SQL_SERVER("me.yj.dp.factory.SqlServerConnection");

    private String dbTypeClassName;

    DbType(String dbTypeClassName) {
        this.dbTypeClassName = dbTypeClassName;
    }

    public String getDbTypeClassName() {
        return dbTypeClassName;
    }

}
