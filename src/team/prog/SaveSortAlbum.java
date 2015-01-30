package team.prog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class SaveSortAlbum{
	
	public static void main (String args[]) throws JsonParseException, JsonMappingException, IOException{
		
		int i = 0;
		int ii = 0;
		int iii = 0;
		StringBuilder s =new StringBuilder();
		List<String> sortNot = new ArrayList<String>();
		List<String> sortSinger = new ArrayList<String>();
		List<String> sortTitle = new ArrayList<String>();	
		Scanner input = new Scanner(System.in);		
		
		Album album = ALbumJacksonUse.albumUse("src/team/prog/Album.json");
		Trek [] treks = album.getTreks();		
		
		System.out.println("++++++Sort by Title++++++");		
		System.out.println("Album: "+ album.getAlbum());
		Arrays.sort(treks, new SortTitle());	
		for(Trek trek : treks){	
			System.out.println("Treck¹ " + (ii+1));
			sortTitle.add(s.append("\t Title: ").append(trek.getTitle()).append(", Singer: ").
					append(trek.getSinger()).append(", Time: ").append(trek.getTime().getMinute())
					.append(":").append(trek.getTime().getSecond()).toString());
			s.delete(0, s.length());
			System.out.println(sortTitle.get(ii));
			ii=ii+1;
		}
		System.out.println(" ");
		System.out.println("If you want to sort album by singers, enter 1");
		System.out.println("If you don't want sort album, enter 2");
		System.out.println("If you are satisfied, enter any other number");
			
		try{				
		
			switch(input.nextInt()){		
		case 1:
		System.out.println(" ");
		System.out.println("++++++Sort by Singer++++++");
		System.out.println("Album: "+ album.getAlbum());	
		Arrays.sort(treks, new SortSinger());	
		for(Trek trek : treks){	
			System.out.println("Treck¹ " + (iii+1));
			sortSinger.add(s.append("\t Singer: ").append(trek.getSinger()).append(", Title: ").
					append(trek.getTitle()).append(", Time: ").append(trek.getTime().getMinute())
					.append(":").append(trek.getTime().getSecond()).toString());
			s.delete(0, s.length());
			System.out.println(sortSinger.get(iii));
			iii=iii+1;
		}			
				break;		
		case 2:
		System.out.println(" ");
		System.out.println("++++++Not Sort++++++");		
		System.out.println("Album: "+ album.getAlbum());		
		for(Trek trek : treks){
			System.out.println("Treck¹ " + (i+1));
			sortNot.add(s.append("\t Title: ").append(trek.getTitle()).append(", Singer: ").
					append(trek.getSinger()).append(", Time: ").append(trek.getTime().getMinute())
					.append(":").append(trek.getTime().getSecond()).toString());			
			s.delete(0, s.length());						
			System.out.println(sortNot.get(i));
			i=i+1;			
			}	
				break;
		default:
			System.out.println("Good listening album");
			break;
		
		}			
		}catch(Exception e){			
		System.out.println("Ups!");
		System.out.println("Try again");		
		}finally{input.close();}		
	}	
}
