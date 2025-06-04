package com.vk.log.bot.demo.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLogFile {

    public static void getStrings() {
        Thread thread = new Thread(() -> {
            try (Scanner scanner = new Scanner(new File("D:/GoProjects/LogsVk/logs.log"))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    HandleLogFile.handleStrings(line);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден: " + e.getMessage());
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Поток был прерван");
        }
    }
}
