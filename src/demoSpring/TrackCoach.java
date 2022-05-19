package demoSpring;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	public TrackCoach(FortuneService theforFortuneService) {
		fortuneService=theforFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "trackCoach:"+fortuneService.getFortune() ;
	}

}
