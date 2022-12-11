package com.anyless.coworkerscore;

public class CoWorkerDatabaseConfig {

    private CoWorkerDatabaseSettings settings = CoWorkerDatabaseSettings.H2;

    public CoWorkerDatabaseConfig(){

    }

    public CoWorkerDatabaseConfig(CoWorkerDatabaseSettings settings) {

        this.settings = settings;
    }


}
