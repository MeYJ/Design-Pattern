package me.yj.dp.factory;

/**
 * Created by Yang Jun on 2017/12/7.
 * Mysql Connection impl
 */
public class MysqlConnection implements DbConnection {

    @Override
    public void connect() {
        System.out.println("Connect to mysql...");
    }

}
