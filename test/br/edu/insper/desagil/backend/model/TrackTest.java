package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist artist;
	private List<Artist>collaborators;
	
	
	@BeforeEach
	void setUp() {
		artist =new Artist("Annita");
		collaborators =new ArrayList<>();
	}

	@Test
	void testZeroSeconds() {
		Track track=new Track(artist,"Attention",0);
		String convertedString=track.getDurationString();
		assertEquals("0:00", convertedString);
	}

	@Test
	void testFiveSeconds() {
		Track track=new Track(artist,"Attention",5);
		String convertedString=track.getDurationString();
		assertEquals("0:05", convertedString);
	}

	@Test
	void testTwentyFiveSeconds() {
		Track track=new Track(artist,"Attention",25);
		String convertedString=track.getDurationString();
		assertEquals("0:25", convertedString);
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Track track=new Track(artist,"Attention",60);
		String convertedString=track.getDurationString();
		assertEquals("1:00", convertedString);
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Track track=new Track(artist,"Attention",65);
		String convertedString=track.getDurationString();
		assertEquals("1:05", convertedString);

	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track=new Track(artist,"Attention",85);
		String convertedString=track.getDurationString();
		assertEquals("1:25", convertedString);

	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Track track=new Track(artist,"Attention",120);
		String convertedString=track.getDurationString();
		assertEquals("2:00", convertedString);

	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Track track=new Track(artist,"Attention",125);
		String convertedString=track.getDurationString();
		assertEquals("2:05", convertedString);

	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track=new Track(artist,"Attention",145);
		String convertedString=track.getDurationString();
		assertEquals("2:25", convertedString);
	}

	@Test
	void testOneCollaborator() {
		Artist collaborator = new Artist("Becky G");
		collaborators.add(collaborator);
		CollaborationTrack collaborationtrack=new CollaborationTrack(artist,collaborators,"Banana",160);
		String fullname=collaborationtrack.getFullArtistName();
		
		assertEquals("Annita (feat.Becky G)", fullname);
	}

	@Test
	void testTwoCollaborators() {
		Artist collaborator = new Artist("Ludmilla");
		Artist collaboratorr = new Artist("Snoop Dog");
		collaborators.add(collaborator);
		collaborators.add(collaboratorr);
		CollaborationTrack collaborationtrack=new CollaborationTrack(artist,collaborators,"Banana",160);
		String fullname=collaborationtrack.getFullArtistName();
		
		assertEquals("Annita (feat.Ludmilla,Snoop Dog)", fullname);
	}
}
