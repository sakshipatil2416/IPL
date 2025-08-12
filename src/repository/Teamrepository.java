package repository;
import entity.Team;

public class Teamrepository {

	//should return MI team details
	
	
	public  static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jayvardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
}
	
//add similar methods for remaining 9 teams
	
	public  static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Channai super king");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setQualified(false);
		team.setnRR(2.4f);
		return team;
	}
	
	public  static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Royal Challengers Bengsluru");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(false);
		team.setnRR(2.5f);
		return team;
	}


public  static Team getKKRTeamDetails() {
	Team team = new Team();
	team.setId(104);
	team.setTeamName("Kolkata Knight Riders");
	team.setCaptainName("Ajinkya Rahane");
	team.setCoachName("AD");
	team.setQualified(false);
	team.setnRR(2.6f);
	return team;
}
public  static Team getDCTeamDetails() {
	Team team = new Team();
	team.setId(105);
	team.setTeamName("Delhi Capitals");
	team.setCaptainName("Axar Patel");
	team.setCoachName("SK");
	team.setQualified(false);
	team.setnRR(2.7f);
	return team;
}

public  static Team getRRTeamDetails() {
	Team team = new Team();
	team.setId(106);
	team.setTeamName("Rajasthan Royals");
	team.setCaptainName("Sanju Samson");
	team.setCoachName("Shantanu");
	team.setQualified(false);
	team.setnRR(2.8f);
	return team;
}

public  static Team getSRHTeamDetails() {
	Team team = new Team();
	team.setId(107);
	team.setTeamName("Sunriser Hyderabad");
	team.setCaptainName("Pat Cummins");
	team.setCoachName("Daniel Vettori");
	team.setQualified(false);
	team.setnRR(2.9f);
	return team;
}

public  static Team getGTTeamDetails() {
	Team team = new Team();
	team.setId(108);
	team.setTeamName("Gujarat Titans");
	team.setCaptainName("Shubhamn Gill");
	team.setCoachName("DK");
	team.setQualified(false);
	team.setnRR(2.1f);
	return team;
}

public  static Team getLSGTeamDetails() {
	Team team = new Team();
	team.setId(109);
	team.setTeamName("Lacknow Super Giants");
	team.setCaptainName("Rishabh Pant");
	team.setCoachName("Patil");
	team.setQualified(false);
	team.setnRR(2.5f);
	return team;
}

public  static Team getPBKSTeamDetails() {
	Team team = new Team();
	team.setId(110);
	team.setTeamName("Punjab Kings");
	team.setCaptainName("Shreyas Iyer");
	team.setCoachName("PZ");
	team.setQualified(true);
	team.setnRR(2.0f);
	return team;
}
}



