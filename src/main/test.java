package main;

import service.Teamservice;

public class test {

    public static void main(String[] args) {
        Teamservice service = new Teamservice();
        service.printTeamDetails();
        service.GetTeamDetails();
        service.SetTeamDetails();
        service.CalTeamDetails();
        service.SumTeamDetails();
        service.AddTeamDetails();
        service.Get1TeamDetails();
        service.Set1TeamDetails();
        service.Print1TeamDetails();
        service.Add1TeamDetails();
    }

}