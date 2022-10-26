package com.javarestassured.utils;

import java.util.Random;

public class NameGenerator {

    public static String fullNameGenerator() {
        String name = null;
        String lastName = null;
        try {
           String filePath = GeneralUtils.ReturnProjectPath() + "/utils/names.txt";
           String line = GeneralUtils.readFileToAString(filePath);
           String[] names = line.split(",");

            Random r = new Random();
             name = names[r.nextInt(4945)];
             lastName = names[r.nextInt(4945)];
        } catch (Exception e) {
            System.out.println(e);
        }
        return name +" "+lastName;
    }
}
