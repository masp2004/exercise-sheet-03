package de.unistuttgart.iste.sqa.pse.sheet03.presence;

public record LocationVector(int deltaRow, int deltaColumn) {
}

/**
 * The LocationVector class represents a vector in a 2D grid.
 * It contains two integer values, deltaRow and deltaColumn, which represent the change in row and column respectively.
 * This class is immutable, meaning that once an instance is created, its state cannot be changed.
 */

/*

final class LocationVector {

 private final int deltaRow;
 private final int deltaColumn;

 */
/**
  * Constructs a new LocationVector with the specified deltaRow and deltaColumn.
  *
  * @param deltaRow the change in row
  * @param deltaColumn the change in column
  */
/*

 public LocationVector(final int deltaRow, final int deltaColumn) {
  super();
  this.deltaRow = deltaRow;
  this.deltaColumn = deltaColumn;
 }
*/

/**
  * Returns the change in row.
  *
  * @return the deltaRow
  */
/*

 public int getDeltaRow() {
  return deltaRow;
 }

 */
/**
  * Returns the change in column.
  *
  * @return the deltaColumn
  */
/*

 public int getDeltaColumn() {
  return deltaColumn;
 }

 */
/**
  * Returns a hash code value for the object.
  * This method is supported for the benefit of hash tables such as those provided by HashMap.
  *
  * @return a hash code value for this object.
  */
/*

 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + deltaRow;
  result = prime * result + deltaColumn;
  return result;
 }

 */
/**
  * Indicates whether some other object is "equal to" this one.
  * The equals method implements an equivalence relation on non-null object references.
  *
  * @param object the reference object with which to compare.
  * @return true if this object is the same as the object argument; false otherwise.
  */
/*

 @Override
 public boolean equals(final Object object) {
  if (this == object) {
   return true;
  }
  if (object == null) {
   return false;
  }
  if (getClass() != object.getClass()) {
   return false;
  }
  final LocationVector other = (LocationVector) object;
  if (deltaRow != other.deltaRow) {
   return false;
  }
  if (deltaColumn != other.deltaColumn) {
   return false;
  }
  return true;
 }
}
*/