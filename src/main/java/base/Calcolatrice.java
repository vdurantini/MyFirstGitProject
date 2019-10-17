package base;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Calcolatrice {

	// Previous 1.6 --> not use
	private Date date1;
	private Calendar date2;
	
	// From 1.7 --> ok
	private LocalDate date3;
	
	int somma(int x, int y) {
		return x+y;
	}
}
