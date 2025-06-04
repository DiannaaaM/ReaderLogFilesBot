package com.vk.log.bot.demo.model;

import java.util.Timer;
import java.util.TimerTask;


public class HandleLogFile {


    public static void handleStrings(String line){
        if (line.matches(".*ERROR.*")) {
            System.out.println("Обнаружена ошибка: " + line);
        }
    }

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                ReadLogFile.getStrings();
            }
        }, 0, 2000);
    }

}
