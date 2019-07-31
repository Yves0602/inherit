package com.xiedaimala.java;


public class Main {

    public static void main(String[] args) {
	// write your code here
        News news = new News("Yves","blablablabla");
        System.out.println(news.display());

        FileNews fileNews = new FileNews("Yvnnoe","hahahahaha");
        System.out.println(fileNews.display());
    }
}
