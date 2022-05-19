package demoSpring;

public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("In Default constructor : CricketCoach");
	}
	private FortuneService fortuneService;
	private String emailAddress,team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Prcactise 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In Seter constructor : CricketCoach");
		this.fortuneService = fortuneService;
	}

}
