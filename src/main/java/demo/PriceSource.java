package demo;

/** Supplies an amount in minor currency units. */
@FunctionalInterface
public interface PriceSource {

  /**
   * Returns the current amount.
   *
   * @return amount in cents; 345 represents 3.45 monetary units
   */
  long amount();
}
