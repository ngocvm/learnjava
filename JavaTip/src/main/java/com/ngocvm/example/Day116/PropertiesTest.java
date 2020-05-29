package com.ngocvm.example.Day116;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        File configFile = new File("config.properties");
        try {
            FileReader reader = new FileReader(configFile);
            Properties properties = new Properties();
            properties.load(reader);
            String host = properties.getProperty("host");
            System.out.println("Host name is: " + host);
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //---writes value of a property to the config.properties file
        try {
            Properties props = new Properties();
            props.setProperty("new host", "www.codeabs.com");
            FileWriter writer = new FileWriter(configFile);
            props.store(writer, "host settings");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
