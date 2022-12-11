package com.anyless.coworkerscore;

public enum CoWorkerDatabaseSettings {

    H2("org.h2.Driver", "org.hibernate.dialect.H2Dialect");
//    MYSQL();

    private String driver;
    private String dialect;

    CoWorkerDatabaseSettings(String driver, String dialect) {
    }
}
