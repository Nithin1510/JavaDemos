package com.inter.lam;

public class CoursesLambda {
    public static void main(String[] args) {

        ICourse courses = () -> {
            System.out.println("Full Stack : ");
            String[] web = {"HTML", "CSS", "JS"};
            return web;
        };
        for(String course : courses.showCourses()){
            System.out.println(course);
        }
        System.out.println();

        courses = () -> {
            System.out.println("Cloud : ");
            return new String[] {"aws", "Azure", "gcp"};
        };
        for(String course : courses.showCourses()){
            System.out.println(course);
        }
        System.out.println();

        courses = () -> new String[] {"Java", "spring", "Junit"};
        System.out.println("Testing : ");
        for(String course : courses.showCourses())
            System.out.println(course);

    }
}
