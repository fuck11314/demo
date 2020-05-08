package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectwvf0 {

        Projectwvf0Delegate projectwvf0Delegate = new Projectwvf0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectwvf0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}