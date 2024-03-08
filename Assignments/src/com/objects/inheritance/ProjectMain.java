package com.objects.inheritance;

public class ProjectMain {
    public static void main(String[] args) {

        TeamOne teamOne = new TeamOne(
                "PolicyBazaar",
                "Rahul",
                "Banking",
                12,
                "fullStack");

        String[] teckStack = teamOne.showTeckStack();
        teamOne.getDetails();
        for(String tech: teckStack){
            System.out.println(tech);
        }
        TeamTwo teamTwo = new TeamTwo(
                "PolicyBazaar",
                "Rahul",
                "Banking",
                12,
                new String[] {"Junit", "Maven", "Git", "Docker"});

        teamTwo.showTools();

    }
}
