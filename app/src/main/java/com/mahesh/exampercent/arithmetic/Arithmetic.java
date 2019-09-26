package com.mahesh.exampercent.arithmetic;

public class Arithmetic {
    private int android;
    private int iot;
    private int webapi;
    int total_marks = 300;


    public Arithmetic(int android, int iot, int webapi) {
        this.android = android;
        this.iot = iot;
        this.webapi = webapi;

    }

    public int percent(){
    return  ((android + iot + webapi)*100)/total_marks;
    }

    public int getAndroid() {
        return android;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public int getIot() {
        return iot;
    }

    public void setIot(int iot) {
        this.iot = iot;
    }

    public int getWebapi() {
        return webapi;
    }

    public void setWebapi(int webapi) {
        this.webapi = webapi;
    }


}
