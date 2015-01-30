package team.prog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ALbumJacksonUse {
	
		
	public static Album  albumUse(String resource) throws JsonParseException, JsonMappingException, IOException {			
				
		BufferedReader input = new BufferedReader( new FileReader(resource));			
		ObjectMapper objectMapper = new ObjectMapper();		
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Album album = objectMapper.readValue(input, Album.class); 
		return album;
		
	}
	}
