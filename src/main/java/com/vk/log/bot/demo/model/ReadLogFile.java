package com.vk.log.bot.demo.model;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadLogFile {
    public static List<String> getStrings() throws FileNotFoundException {
        List<String> log =new ArrayList<>();
        Scanner scanner = new Scanner(new File("logs/logs.log"));
        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
            log.add(String.valueOf(scanner));
        }
        scanner.close();
        return log;
    }
}
