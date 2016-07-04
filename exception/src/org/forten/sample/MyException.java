package org.forten.sample;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/4.
 */
public class MyException extends RuntimeException {
    private Date errorTime;
    public MyException() {
        super();
        this.errorTime = new Date();
    }

    public MyException(String message) {
        super(message);
        this.errorTime = new Date();
    }

    public Date getErrorTime() {
        return errorTime;
    }
}
