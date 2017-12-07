package me.yj.dp.factory;

/**
 * Created by MeYJ on 2017/12/7.
 * SqlServer Connection impl
 */
public class SqlServerConnection implements DbConnection {

    @Override
    public void connect() {
        System.out.println("Connect to sql server...");
    }

}
