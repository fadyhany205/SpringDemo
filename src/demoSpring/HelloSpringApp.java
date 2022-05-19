package demoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Coach theCoach=context.getBean("myCoach",Coach.class);
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
//		Coach trackCoach=context.getBean("myCoach2",Coach.class);
//		System.out.println(trackCoach.getDailyFortune());
		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		context.close();
	}

}
