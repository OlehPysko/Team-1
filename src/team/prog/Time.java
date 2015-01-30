package team.prog;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Time {
	
	private int minute;
	private int second;

	
	@JsonCreator
	public Time(@JsonProperty("minute") int minute, @JsonProperty("second") int second){
		this.minute = minute;
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	
}
