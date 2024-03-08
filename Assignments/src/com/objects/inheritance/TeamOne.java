package com.objects.inheritance;

public class TeamOne extends Project{
    String teckStack;

    public TeamOne(String projectName, String projectManager, String domain, int durationInMonths, String teckStack) {
        super(projectName, projectManager, domain, durationInMonths);
        this.teckStack = teckStack;
    }

    String[] showTeckStack(){
        String[] skills = {"Java","HTML", "CSS", "JS"};
        return skills;
    }
}
