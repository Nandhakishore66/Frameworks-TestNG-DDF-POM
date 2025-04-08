package com.LAO;

import java.io.File;

public class Download {
    public static void main(String[] args){
        //Step:1---> Download the needed link, using selenium
        //Now we want to check it is downloaded or not--> In downloads folder, so use Java
        File file = new File("C:\\Users\\UC506533\\Downloads");
        File[] totalFile = file.listFiles();
        if(totalFile!=null) {
            for (File allFile : totalFile) {
                if (allFile.getName().equals("xls")) {
                    System.out.println("Got the expected file");
                    break;
                }
            }
        }
    }
}
