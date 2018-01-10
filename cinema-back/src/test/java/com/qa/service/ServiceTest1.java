package com.qa.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.model.Movie;

public class ServiceTest1 {

	@Test
	public void test() {
		Service service = new Service();

		Movie m1 = new Movie("T1", "G1", "R1");
		Movie m2 = new Movie("T2", "G2", "R2");
		Movie m3 = new Movie("T3", "G2", "R3");
		Movie m4 = new Movie("T4", "G3", "R4");
		Movie m5 = new Movie("T5", "G3", "R5");
		Movie m6 = new Movie("T6", "G3", "R6");
		Movie m7 = new Movie("T7", "G4", "R7");
		Movie m8 = new Movie("T8", "G4", "R8");
		Movie m9 = new Movie("T9", "G4", "R9");
		Movie m10 = new Movie("T10", "G4", "R10");

		service.addMovie(m1);
		service.addMovie(m2);
		service.addMovie(m3);
		service.addMovie(m4);
		service.addMovie(m5);
		service.addMovie(m6);
		service.addMovie(m7);
		service.addMovie(m8);
		service.addMovie(m9);
		service.addMovie(m10);

		assertEquals(3, service.countGenre("G3"));
	}

}
