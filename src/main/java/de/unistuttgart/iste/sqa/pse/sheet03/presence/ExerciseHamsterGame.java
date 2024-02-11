package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.external.model.Territory;
import java.io.PrintStream;

/**
 * Please describe this class here.
 *
 * @author MarvinSpiegel, IsmailRatni
 * @version 07.11.2023
 */
public final class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	/**
	 * This {@link PrintStream} object is to be used for exercise 2b).
	 */
	protected final PrintStream output = System.out;

	@Override
	protected void hamsterRun() {
		final Territory territory = game.getTerritory();
		paule.write("TotalGrainCount: " + territory.getTotalGrainCount());
		paule.write("TotalHamsterCount: " + territory.getTotalHamsterCount());
		paule.write("Territory Width: " + territory.getTerritorySize().getColumnCount()
				+ " Territory Height: " + territory.getTerritorySize().getRowCount());
		turnRight();
		moveDown();
		paule.write("Grain Count: " + territory.getTotalGrainCount());
	}

	private void moveDown() {
		while (!paule.grainAvailable()) {
			paule.move();
		}
		paule.pickGrain();
	}

	private void turnRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
}
