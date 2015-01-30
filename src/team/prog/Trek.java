package team.prog;




import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Trek {
	private String title;
	private String singer;
	private Time time;
	
	@JsonCreator
	public Trek(@JsonProperty("title") String title, @JsonProperty("singer") String singer, 
			@JsonProperty("time") Time time){
		this.title = title;
		this.time = time;
		this.singer = singer;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}	

	
	}
