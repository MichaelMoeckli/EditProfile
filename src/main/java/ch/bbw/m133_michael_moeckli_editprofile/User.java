package ch.bbw.m133_michael_moeckli_editprofile;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotNull
	@Size(min = 1, message = "Feld darf nicht leer sein")
	private String vorname;
	@NotNull
	@Size(min = 1, message = "Feld darf nicht leer sein")
	private String nachname;
	@NotNull
	@Min(value = 13, message = "Muss älter als 13 sein")
	private int alter;
	
	boolean receiveNewsletter;
	
	public User(){
		
	}

	public boolean isReceiveNewsletter() {
		return receiveNewsletter;
	}

	public void setReceiveNewsletter(boolean receiveNewsletter) {
		this.receiveNewsletter = receiveNewsletter;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public String getReceiveNewsletter() {
		if(receiveNewsletter==true) {
			return "JA";
		}
		return "NEIN";		
	}
	

}
