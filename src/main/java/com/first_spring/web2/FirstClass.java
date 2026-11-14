package com.first_spring.web2;

public class FirstClass {

    private Integer num;
    @Deprecated 
    public void testMethod(){
        System.out.println("Helllllllllllllllllllllo WOrld!!");
    }

    public FirstClass(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
