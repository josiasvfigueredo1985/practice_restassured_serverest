package com.javarestassured.utils;

import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.Folder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;
import io.restassured.response.Response;

public class GeneralUtils {

    public static String readFileToAString(String path) {
        byte[] encoded = new byte[0];
        try {
            encoded = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(encoded, StandardCharsets.ISO_8859_1);
    }

    public static String getNowDate(String mask) {
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getMethodNameByLevel(int level) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();

        return stackTrace[level].getMethodName();
    }

    public static String getAllStackTrace(ITestResult result) {
        String allStackTrace = "";

        for (StackTraceElement stackTrace : result.getThrowable().getStackTrace()) {
            allStackTrace = allStackTrace + "<br>" + stackTrace.toString();
        }

        return allStackTrace;
    }

    public static String convertObjectToJsonString(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static String formatJson(final String json) {
        final int indent_width = 4;
        final char[] chars = json.toCharArray();
        final String newline = System.lineSeparator();

        String ret = "";
        boolean begin_quotes = false;

        for (int i = 0, indent = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '\"') {
                ret += c;
                begin_quotes = !begin_quotes;
                continue;
            }

            if (!begin_quotes) {
                switch (c) {
                    case '{':
                    case '[':
                        ret += c + newline + String.format("%" + (indent += indent_width) + "s", "");
                        continue;
                    case '}':
                    case ']':
                        ret += newline + ((indent -= indent_width) > 0 ? String.format("%" + indent + "s", "") : "")
                                + c;
                        continue;
                    case ':':
                        ret += c + " ";
                        continue;
                    case ',':
                        ret += c + newline + (indent > 0 ? String.format("%" + indent + "s", "") : "");
                        continue;
                    default:
                        if (Character.isWhitespace(c))
                            continue;
                }
            }

            ret += c + (c == '\\' ? "" + chars[++i] : "");
        }

        return ret;
    }

    public static String  ReturnProjectPath() {
        Path path = Paths.get("GlobalParameters.java");

        String t = path.toAbsolutePath().toString();
        return t; 
    }

    public static void WriteInJsonFile(String folderFilePath, String key, String value) {
        // Example of how to inform parameters to this method
        // GeneralUtils.WriteInJsonFile("/jsons/Ids.json","idProduto","test");

        try {
            String srcPath = GeneralUtils.ReturnProjectPath();
            String jsonBody = GeneralUtils.readFileToAString(srcPath + folderFilePath);

            JSONObject obj = new JSONObject(jsonBody);
            String jsonTxt = obj.put(key, value).toString();

            FileWriter(srcPath + folderFilePath, jsonTxt);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String ReturnJsonValue(String folderFilePath, String key) {
        // Example of how to inform parameters to this method
        // GeneralUtils.WriteInJsonFile("/jsons/Ids.json","idProduto","test");

        String jsonValue = null;
        try {
            String srcPath = GeneralUtils.ReturnProjectPath();
            String jsonBody = GeneralUtils.readFileToAString(srcPath + folderFilePath);

            JSONObject obj = new JSONObject(jsonBody);
            jsonValue = obj.getString(key).toString();

        } catch (Exception e) {
            System.out.println(e);
        }
        return jsonValue;
    }

    public static String ReturnResponseJsonValue(Response json, String key) {
        // Example of how to inform parameters to this method
        String jsonValue = null;
        try {
            String jsonBody = json.getBody().asString();

            JSONObject obj = new JSONObject(jsonBody);
            jsonValue = obj.getString(key).toString();

        } catch (Exception e) {
            System.out.println(e);
        }
        return jsonValue;
    }

    private static void FileWriter(String fullPathfile, String text) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fullPathfile), "utf-8"));
            String newText = GeneralUtils.formatJson(text);
            writer.write(newText);
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
            }
        }
    }
}
