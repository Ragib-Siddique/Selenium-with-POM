package com.parabank.parasoft.util;

public class General {
    public static final int WAIT_TIME=30;
    public static final String LOGIN_TITTLE="ParaBank | Welcome | Online Banking";




    public void waitForObserveText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
