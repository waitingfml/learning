package com.huasisoft.example;

public class Test {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("肖申克的救赎");
        movie.setDirector("弗兰克·德拉邦特");
        movie.setActor("蒂姆·罗宾斯");
        movie.setType("剧情");
        movie.setCountry("美国");
        movie.setLanguage("英语");
        movie.setReleaseDate("1994-09-10");
        movie.setDuration("142分钟");
        movie.setIntroduction("lala");
        movie.info();
        System.out.println(movie.getName());

    }
}
