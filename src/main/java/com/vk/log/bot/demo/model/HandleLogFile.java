package com.vk.log.bot.demo.model;
import com.vk.log.bot.demo.model.ReadLogFile;

import java.io.FileNotFoundException;


public class HandleLogFile {


    public void handleStrings() throws FileNotFoundException {
        int counter = 0;
        for (int i = 0; i < ReadLogFile.getStrings().size(); i++) {
            if (ReadLogFile.getStrings().get(i).contains("[ERROR]") ) {
                System.out.println(ReadLogFile.getStrings().get(i) + "<----" + counter++);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        HandleLogFile handleLogFile = new HandleLogFile();
        handleLogFile.handleStrings();
    }

}
