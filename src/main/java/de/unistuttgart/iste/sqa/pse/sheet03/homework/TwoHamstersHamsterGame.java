package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * Hamster paule and Hamster paula collect all the grains on their area and put them at the meeting point.
 *
 * @author MarvinSpiegel, IsmailRatni
 * @version 07.11.2023
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	void hamsterRun() {
		controller.pickGrainsWhileMoving(paula);
		controller.turnLeftMultipleTimes(paula,1);
		controller.moveMultipleSteps(paula, 2);
		controller.pickAllGrains(paula);
		controller.turnLeftMultipleTimes(paula, 1);
		controller.moveMultipleSteps(paula, 2);
		controller.pickAllGrains(paula);
		controller.moveInHalfCircle(paula);
		controller.moveMultipleSteps(paula, 2);
		controller.turnLeftMultipleTimes(paula, 3);
		controller.moveMultipleSteps(paula, 2);
		controller.putAllGrains(paula);

		controller.pickGrainsWhileMoving(paule);
		controller.pickAllGrains(paule);
		controller.turnLeftMultipleTimes(paule, 3);
		controller.pickGrainsWhileMoving(paule);
		controller.turnLeftMultipleTimes(paule, 3);
		controller.pickGrainsWhileMoving(paule);
		controller.pickAllGrains(paule);
		controller.turnLeftMultipleTimes(paule, 1);
		controller.moveInHalfCircle(paule);
		controller.moveMultipleSteps(paule, 1);
		paule.getLocation();
	}
}
