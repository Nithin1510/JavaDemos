package com.objects.inheritance;

public class TeamTwo extends Project{
    String [] tools;

    public TeamTwo(String projectName, String projectManager, String domain, int durationInMonths, String[] tools) {
        super(projectName, projectManager, domain, durationInMonths);
        this.tools = tools;
    }

    void showTools(){
        for (String tool: tools) {
            System.out.println(tool);
        }
    }
}
