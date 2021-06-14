package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;

	@BeforeEach
	void setUp() {
		playlist=new Playlist(1);
		
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Hashi",1);
		playlist.putRating("Fabio", 2);
		playlist.putRating("Corsi", 3);
		playlist.putRating("Pelicano",3);
		
		double avarage=playlist.averageRatings();
		
		assertEquals(2.0,avarage,DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Hashi",1);
		playlist.putRating("Fabio", 2);
		playlist.putRating("Corsi", 1);
		
		double avarage=playlist.averageRatings();
		
		assertEquals(1.5,avarage,DELTA);

	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Hashi",1);
		playlist.putRating("Fabio", 2);
		playlist.putRating("Corsi", 2);
		
		double avarage=playlist.averageRatings();
		
		assertEquals(1.5,avarage,DELTA);

	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Hashi",1);
		playlist.putRating("Fabio", 2);
		playlist.putRating("Corsi", 1);
		playlist.putRating("Pelicano", 3);
		
		double avarage=playlist.averageRatings();
		
		assertEquals(2.0,avarage,DELTA);
	}
}
