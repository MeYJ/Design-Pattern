package me.yj.dp.factory;

/**
 * Created by MeYJ on 2017/12/7.
 * Oracle Connection impl
 */
public class OracleConnection implements DbConnection {

    @Override
    public void connect() {
        System.out.println("Connect to oracle...");
    }

}
