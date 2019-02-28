package problem04;

import java.sql.Time;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random Rnumber = new Random() ;
		Time time = new Time(0);
		
		int rnum = 0;
		
		rnum = Rnumber.nextInt(18);
		System.out.println(rnum);
		for (int i = 1; i <= 9; i++) {
			for (int j=1; j<= 9; j++) {
				System.out.println(i + "*" + j );
				
			}
		}
	}
}