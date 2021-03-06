package ca.ubc.cs.cpsc210.meetup.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import ca.ubc.cs.cpsc210.meetup.exceptions.IllegalDaysException;
import ca.ubc.cs.cpsc210.meetup.exceptions.IllegalSectionInitialization;
import ca.ubc.cs.cpsc210.meetup.util.CourseTime;

/*
 * Represent a student's schedule consisting of all sections they must attend
 */
public class Schedule {

	// TODO: Implement fields

	/**
	 * Constructor
	 */
	public Schedule() {
		// TODO: Complete implementation of constructor
	}

	/**
	 * Add a section to the student's schedule 
	 * REQUIRES: section is not null
	 * MODIFIES: this 
	 * EFFECTS: if section is not well-formed, throws
	 * IllegalSectionInitialization otherwise, section is remembered in the
	 * schedule
	 */
	public void add(Section section) throws IllegalSectionInitialization {
		// TODO: Complete implementation
	}

	/**
	 * Retrieve the earliest start time in the schedule on a given day 
	 * REQUIRES: dayOfWeek is either "MWF" or "TR" 
	 * EFFECTS: Returns the start and end
	 *    times of the earliest section on that day or null
	 */
	public CourseTime startTime(String dayOfWeek) throws IllegalDaysException {
		// TODO: Complete implementation
		if (!((dayOfWeek.equals("MWF"))||(dayOfWeek.equals("TR"))))
			throw new IllegalDaysException();
	}

	/**
	 * Retrieve the latest start time in the schedule on a given day 
	 * REQUIRES: dayOfWeek is either "MWF" or "TR" 
	 * EFFECTS: Returns the start and end
	 *    times of the latest section on that day or null
	 */
	public CourseTime endTime(String dayOfWeek) throws IllegalDaysExeption {
		// TODO: Complete implementation
		if (!((dayOfWeek.equals("MWF"))||(dayOfWeek.equals("TR"))))
			throw new IllegalDaysException();
	}

	/**
	 * Find the start time of all two hour breaks less than the end time
	 * REQUIRES: dayOfWeek is either "MWF" or "TR" 
	 * EFFECTS: Returns a set of the end time before any 2 hour break. The end time is in HH:MM format.
	 */
	public Set<String> getStartTimesOfBreaks(String dayOfWeek) throws IllegalDaysException {
		// TODO: Complete implementation
		if (!((dayOfWeek.equals("MWF"))||(dayOfWeek.equals("TR"))))
			throw new IllegalDaysException();
	}

	/**
	 * In which building was I before the given timeOfDay on the given dayOfWeek
	 * REQUIRES: dayOfWeek is "MWF or "TR" and timeOfDay is non-null and of
	 * format HH:MM 
	 * EFFECTS: The Building in which the student last was before
	 * timeOfDay on dayOfWeek or null
	 */
	public Building whereAmI(String dayOfWeek, String timeOfDay) throws IllegalDaysException {
	   // TODO: Complete implementation
		if (!((dayOfWeek.equals("MWF"))||(dayOfWeek.equals("TR"))))
			throw new IllegalDaysException();
	}


}
