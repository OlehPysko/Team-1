package team.prog;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Album {
	private String album;
	private Trek[]  treks;
	
@JsonCreator
public Album(@JsonProperty("album") String album, @JsonProperty("treks") Trek[] treks){
	this.treks = treks;
	this.album = album;
}




public String getAlbum() {
	return album;
}




public void setAlbum(String album) {
	this.album = album;
}




public Trek[] getTreks() {
	return treks;
}

public void setTreks(Trek[] treks) {
	this.treks = treks;
}



}
