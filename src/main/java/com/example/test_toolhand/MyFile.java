package com.example.test_toolhand;

import java.io.*;

public class MyFile {
    private final String nameFile;
    private String text;

    public MyFile(String nameFile) {
        this.nameFile = nameFile;
        createFile(nameFile);
    }

    private void createFile(String nameFile) {
        File file = new File(nameFile);
        try {
            if (file.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        writeFileDefault();
    }

    public String readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                text = line;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return text;
    }

    private void writeFileDefault() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            String text = "Привет, меня зовут Александр! Я буду рад, если вы возьмете меня в команду!";
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
