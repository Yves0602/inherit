package com.xiedaimala.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNews extends News{
    public FileNews(String title ,String content){
        super(title,content);
    }
    public void readFromeFile(String url){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            title = reader.readLine();
            reader.readLine();
            content = reader.readLine();
        }catch(IOException e){
            System.out.println("新闻读取出错");
        }
    }
    @Override
    public String display(){
        return title+":"+content;
    }
}
