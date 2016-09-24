package com.AlyssaMoore;

public class Main {

    public static void main(String[] args) {

        // Getting OS, version, architecture, and user account name and saving to String variables
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArchitecture = System.getProperty("os.arch");
        String userAccountName = System.getProperty("user.name");

        // Printing OS, version, architecture, and user account name
        System.out.println("OS: " + osName + "\r\nVersion: " + osVersion + "\r\nArchitecture: " +
                            osArchitecture + "\r\nUser Account Name: " + userAccountName);

    }
}