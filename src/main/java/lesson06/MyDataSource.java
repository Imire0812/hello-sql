package lesson06;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class MyDataSource {

    private static DataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            PGSimpleDataSource pgSimpleDataSource = new PGSimpleDataSource();
            pgSimpleDataSource.setServerName("localhost");
            pgSimpleDataSource.setDatabaseName("cohort26");
            pgSimpleDataSource.setUser("postgres");
            pgSimpleDataSource.setPassword("root");
            dataSource = pgSimpleDataSource;
        }
        return dataSource;
    }
}