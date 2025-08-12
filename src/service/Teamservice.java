package service;

import entity.Team;
import repository.Teamrepository;

public class Teamservice {
    public void printTeamDetails() {
        Team team = Teamrepository.getMITeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void GetTeamDetails() {
        Team team = Teamrepository.getCSKTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void SetTeamDetails() {
        Team team = Teamrepository.getRCBTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void CalTeamDetails() {
        Team team = Teamrepository.getKKRTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void SumTeamDetails() {
        Team team = Teamrepository.getDCTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void AddTeamDetails() {
        Team team = Teamrepository.getRRTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void Get1TeamDetails() {
        Team team = Teamrepository.getSRHTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void Set1TeamDetails() {
        Team team = Teamrepository.getGTTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }
    
    public void Print1TeamDetails() {
        Team team = Teamrepository.getLSGTeamDetails();

        System.out.println("Team ID: " + team.getId());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Captain Name: " + team.getCaptainName());
        System.out.println("Coach Name: " + team.getCoachName());
        System.out.println("Net Run Rate: " + team.getnRR());
        System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
    }

public void Add1TeamDetails() {
    Team team = Teamrepository.getPBKSTeamDetails();

    System.out.println("Team ID: " + team.getId());
    System.out.println("Team Name: " + team.getTeamName());
    System.out.println("Captain Name: " + team.getCaptainName());
    System.out.println("Coach Name: " + team.getCoachName());
    System.out.println("Net Run Rate: " + team.getnRR());
    System.out.println("Qualified: " + (team.isQualified() ? "Yes" : "No"));
}

}