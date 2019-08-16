package com.alex.dao;

public enum DataSourceType {
    DATASOURCE1("dataSource1"),DATASOURCE2("dataSource2");
    private String name;
    private DataSourceType(String name){
        this.name=name;
    }
    
    public String getDataSource(){
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
