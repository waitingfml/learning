package com.huasisoft.d1_extends;

public class Student extends People {

    private String school;
    private String className;

    private String feedback;

    public Student() {
        System.out.println("Student 无参构造器");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void writeFeedback(String content) {
        this.setFeedback(content);
    }
}
