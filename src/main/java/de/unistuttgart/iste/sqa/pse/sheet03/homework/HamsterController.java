package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * A control unit to control hamsters.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * given hamsters act according to those patterns.
 *
 * @author Sarah Stieß
 */
public class HamsterController {

 /**
  * Pick all grains on the hamster's tile.
  *
  * @param hamster The hamster that picks the grains.
  */
 void pickAllGrains(Hamster hamster) {
  hamster.write("Executing pickAllGrains:");
  Integer counter = 0;
  while (hamster.grainAvailable()) {
   hamster.pickGrain();
   counter++;
  }
  hamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
 }

 /**
  * Put all of the hamster's grain on the current tile.
  *
  * @param hamster The hamster that puts the grains.
  */
 void putAllGrains(Hamster hamster) {
  hamster.write("Executing putAllGrains:");
  Integer counter = 0;
  while (!hamster.mouthEmpty()) {
   hamster.putGrain();
   counter++;
  }
  hamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
 }

 /**
  * Move a half circle.
  * @param hamster The hamster that moves in a half circle.
  */
 void moveInHalfCircle(Hamster hamster) {
  hamster.write("Executing moveInHalfCircle:");
  hamster.turnLeft();
  hamster.move();
  hamster.turnLeft();
  hamster.write("I ran a half circle!");
 }

 /**
  * Hamster moves with all grains.
  * @param hamster The hamster that moves with all grains.
  */
 void pickGrainsWhileMoving(Hamster hamster) {
  hamster.write("Executing pickAllGrainsLoop:");
  while (hamster.frontIsClear()) {
   pickAllGrains(hamster);
   hamster.move();
  }
  hamster.write("I picked all grains, on the tile behind me!");
 }

 /**
  * Hamster turns left a given number of times and writes how often it turned.
  * @param hamster The hamster that turns left.
  * @param turns The number of times the hamster turns left.
  */
 void turnLeftMultipleTimes(Hamster hamster, Integer turns) {
  hamster.write("Executing TurnLeftLoop:");
  for (Integer i = 0; i < turns; i++) {
   hamster.turnLeft();
  }
  hamster.write(String.format("I turned %d times!", turns));
 }

 /**
  * Hamster moves a given number of steps and writes how many steps it moved.
  * @param hamster The hamster that moves.
  * @param steps The number of steps the hamster moves.
  */
 void moveMultipleSteps(Hamster hamster, Integer steps) {
  hamster.write("Executing moveLoop:");
  Integer counter = 0;
  for (; counter < steps && hamster.frontIsClear(); counter++) {
   hamster.move();
  }
  hamster.write(String.format("I moved %d out of %d steps!", counter, steps));
 }
}