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

	public Calcolatrice(Date date1, Calendar date2, LocalDate date3) {
		super();
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Calendar getDate2() {
		return date2;
	}

	public void setDate2(Calendar date2) {
		this.date2 = date2;
	}

	public LocalDate getDate3() {
		return date3;
	}

	public void setDate3(LocalDate date3) {
		this.date3 = date3;
	}
}