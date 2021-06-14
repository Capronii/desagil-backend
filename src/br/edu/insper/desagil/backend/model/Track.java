package br.edu.insper.desagil.backend.model;

public class Track {
	protected Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist,String name,int duration) {
		this.artist=artist;
		this.name=name;
		this.duration=duration;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public String getName() {
		return this.name;
	}

	public int getDuracao() {
		return this.duration;
	}
	
	
	public String getDurationString() {
		boolean oneminmore =true;
		int minutes=0;
		int seconds=this.duration;
		String convertedString="";
		
		while (oneminmore) {
			if (seconds>=60) {
				minutes++;
				seconds-=60;
			} else {
				oneminmore=false;
				if (seconds<10) {
					convertedString=Integer.toString(minutes)+":0"+Integer.toString(seconds);
				}
				else {
					convertedString=Integer.toString(minutes)+":"+Integer.toString(seconds);
				}
			}
		}
		return convertedString;
	}
	
	public String getFullArtistName() {
		return artist.getName();
	}
	
}
