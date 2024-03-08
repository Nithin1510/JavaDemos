package com.objects.inheritance;

public class Project {
    String projectName;
    String projectManager;
    String domain;
    int durationInMonths;

    public Project(String projectName, String projectManager, String domain, int durationInMonths) {
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.domain = domain;
        this.durationInMonths = durationInMonths;
    }

    void getDetails(){
        System.out.println("Project Name "+projectName);
        System.out.println("Project duration : "+durationInMonths);
        System.out.println("Domain : "+domain);
        System.out.println("Project Manager : "+projectManager);
    }
}
