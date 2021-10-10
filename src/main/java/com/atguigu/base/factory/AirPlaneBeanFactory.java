package com.atguigu.base.factory;

public class AirPlaneBeanFactory {

    public AirPlane getInstance(String jsyName){
        AirPlane airPlane = new AirPlane();
        airPlane.setName("波音747");
        airPlane.setJsyName(jsyName);
        airPlane.setFdjName("太行");
        return airPlane;
    }
}
