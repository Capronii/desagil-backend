package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String,Integer> ratings;

	
	public Playlist(int id) {
		this.id= id;
		this.tracks= new ArrayList<>();
		this.ratings= new HashMap<>();
	}


	public int getId() {
		return this.id;
	}


	public List<Track> getTracks() {
		return this.tracks;
	}


	public Map<String, Integer> getRatings() {
		return this.ratings;
	
	}
	
	public List<Track> AddTracks(Track tracks) {
		return this.tracks;
	}
	
	public void putRating(String name,Integer rating) {
		this.ratings.put(name, rating);
	}
	
	public double averageRatings() {
		double avarage;
		int soma=0;
		int i=0;
		for(Integer rating:this.ratings.values()) {
			soma+=rating;
			i++;
		}
		avarage= (double)soma/i;
		
		int j= (int) avarage;
		double x=avarage-j;
		
		if (x<0.26) {
			return (double) j;
		}else if (x>=0.74) {
			return (double) j+1;
		}else {
			return (double) j+0.5;
		}
	}
}
	

