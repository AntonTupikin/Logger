package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger instance = null;

    public void log(String msg) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("[" + formatter.format(date) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }


}