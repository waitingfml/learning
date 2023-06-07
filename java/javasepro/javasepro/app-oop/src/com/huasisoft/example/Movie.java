package com.huasisoft.example;


/**
 * JavaBean 是一种Java语言写成的可重用组件。
 * 电影
 */
public class Movie {
    private String name;
    private String director;
    private String actor;
    private String type;
    private String country;
    private String language;
    private String releaseDate;
    private String duration;
    private String introduction;

    public Movie() {
    }

    public Movie(String name, String director, String actor, String type, String country, String language, String releaseDate, String duration, String introduction) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.type = type;
        this.country = country;
        this.language = language;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.introduction = introduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void info() {
        System.out.println("电影名称：" + name);
        System.out.println("导演：" + director);
        System.out.println("主演：" + actor);
        System.out.println("类型：" + type);
        System.out.println("国家：" + country);
        System.out.println("语言：" + language);
        System.out.println("上映日期：" + releaseDate);
        System.out.println("片长：" + duration);
        System.out.println("简介：" + introduction);
    }
}
