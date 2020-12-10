import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class project {

	public static void main(String[] args)
	{
		HashMap<String, String> teams = new HashMap<String, String>();
		teams.put("Arsenal","ENG");
		teams.put("Astteamsa","KAZ");
		teams.put("Atletico","ESP");
		teams.put("Bate","BLR");
		teams.put("CSKA Moskva","RUS");
		teams.put("Dinamo Zagreb","CRO");
		teams.put("Dynamo Kyiv","UKR");
		teams.put("Galatsaray","TUR");
		teams.put("Gent","BEL");
		teams.put("Leverkusen","GER");
		teams.put("Lyon","FRA");
		teams.put("M. Tel-Aviv","ISR");
		teams.put("Malmo","SWE");
		teams.put("Mteams. City","ENG");
		teams.put("Mteams. United","ENG");
		teams.put("Monchenglaadbach","GER");
		teams.put("Olympiacos","GRE");
		teams.put("Parto","POR");
		teams.put("Real Madrid","ESP");
		teams.put("Roma","ITA");
		teams.put("Sevilla","ESP");
		teams.put("Shakhtar Donetsk","UKR");
		teams.put("Valencia","ESP");
		teams.put("Wolfsburg","GER");
		teams.put("Barcelona","ESP");
		teams.put("Bayern","GER");
		teams.put("Benfica","POR");
		teams.put("Chelsea","ENG");
		teams.put("Juventus","ITA");
		teams.put("Paris","FRA");
		teams.put("PCV","NED");
		teams.put("Zenit","RUS");
		
		
		HashMap<String, Boolean> check = new HashMap<String, Boolean>();
		for (String i : teams.keySet()) 
		{
			check.put(i,true);
		}
		
		
		
		List<String> champ = Arrays.asList(
				"Barcelona",
				"Bayern",
				"Benfica",
				"Chelsea",
				"Juventus",
				"Paris",
				"PCV",
				"Zenit"
				);
		List<String> l = new ArrayList<String>(teams.keySet());
		Collections.shuffle(l);
		Collections.shuffle(champ);
		
		String[] champ1 = new String[9];
		champ1 = champ.toArray(champ1);
		
		
		char ch='A';
		int  grp=0;
		HashMap<String, Boolean> city = new HashMap<String, Boolean>();
		while(grp<8)
		{
			city.clear();
			city.put("ENG",true);
			city.put("KAZ",true);
			city.put("ESP",true);
			city.put("BLR",true);
			city.put("GER",true);
			city.put("POR",true);
			city.put("RUS",true);
			city.put("CRO",true);
			city.put("UKR",true);
			city.put("TUR",true);
			city.put("BEL",true);
			city.put("ITA",true);
			city.put("FRA",true);
			city.put("ISR",true);
			city.put("SWE",true);
			city.put("GRE",true);
			city.put("POR",true);
			city.put("NED",true);
			int temp=0;
			System.out.print("----------------------------------------------------");
			System.out.println("\nGROUP " + ch + " : \n");
			
			System.out.println(champ1[grp]);
			city.replace(teams.get(champ1[grp]),false);
			check.replace(champ1[grp], false);
			ch++;
			grp++;
			for (String i : l) 
			{
				if(city.get(teams.get(i)) == true && check.get(i) == true)
				{
					city.replace(teams.get(i), false);
					check.replace(i, false);
			      System.out.println(i);
					temp++;
			    }
				if(temp==3)
				{
					break;
				}
			}
		
		}
	}
}
