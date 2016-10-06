/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
public void run() {
	// Filling in columns and moving to the next one 4 corners down.
	// While the front(horizontally) is clear for Karel, Karel will continue to fill columns.
	while(frontIsClear()) {
		fillColumn();
		moveToNextColumn();
	}
	fillColumn();
}

// Pre-condition: column must be on street 1, 5, 9, etc.
// Post-condition: column will be full with beepers
private void fillColumn() {
	turnLeft();
	while(frontIsClear()) {
		if(noBeepersPresent()) {
			putBeeper();
			move();
		}
		else
			move();
	}
	// Need to take into account if the top corner of the column has a beeper or not. 
	if(noBeepersPresent())
		putBeeper();
	// Heading back down to the bottom of the column and facing East
	turnAround();
	while(frontIsClear())
		move();
	turnLeft();
}

private void moveToNextColumn() {
	move();
	move();
	move();
	move();
}
}
	
	