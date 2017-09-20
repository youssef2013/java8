package fr.ybf.ocpjp.date.times;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeLocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ZonedDateTime.now());
		System.out.println(ZoneId.getAvailableZoneIds().stream().count());
//		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		System.out.println(Duration.ofDays(1).toString()); 
		
		String	m1	=	Duration.of(1,	ChronoUnit.MINUTES).toString(); 
		String	m2	=	Duration.ofMinutes(1).toString(); 
		String	s	=	Duration.of(60,	ChronoUnit.SECONDS).toString();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(s);
	}

}
