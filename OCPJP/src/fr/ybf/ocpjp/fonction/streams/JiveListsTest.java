package fr.ybf.ocpjp.fonction.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JiveListsTest {

	private static List<String> usersJive;
	private static List<String> usersRtfe;
	private static List<String> usersApi;
	
	public static void main(String[] args) {
		getUsersRtfe();
		getUsersJive();
		getUsersApi();
		
		Instant start = Instant.now();
		usersJive = usersJive.parallelStream().filter(t -> !usersApi.contains(t)).collect(Collectors.toList());
		usersJive = usersJive.parallelStream().filter(t -> !usersRtfe.contains(t)).collect(Collectors.toList());
		
//		usersJive.removeAll(usersRtfe);
//		usersJive.removeAll(usersApi);
		System.out.println("End : " + Duration.between(start, Instant.now()).toMillis()/1_000 + "Secondes");
		System.out.println(usersJive.size());
		
	}

	public static List<String> getUsersJive() {
		usersJive = new ArrayList<>();
		for (int i = 100_000; i < 300_000; i+=2) {
			usersJive.add("user" + i);
		}
		return usersJive;
	}

	public static List<String> getUsersRtfe() {
		usersRtfe = new ArrayList<>();
		for (int i = 0; i < 233_000; i++) {
			usersRtfe.add("user" + i);
		}
		return usersRtfe;
	}

	public static List<String> getUsersApi() {
		usersApi = new ArrayList<>();
		usersApi.addAll(Arrays.asList("user279002", "user279004", "user279010", "user279020", "user279022", "user279026"));
		return usersApi;
	}

}
