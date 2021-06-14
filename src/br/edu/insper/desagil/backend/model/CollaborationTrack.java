package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;
	
	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name,int duration) {
		super(artist, name, duration);
		this.collaborators= collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		List<String> collaList = new ArrayList<>();
		String collaList2;
		for (Artist collaborator:this.collaborators) {
			collaList.add(collaborator.getName());
		}
		collaList2=String.join(",",collaList);
		return artist.getName() + " (feat." + collaList2+ ")";
	}
}
