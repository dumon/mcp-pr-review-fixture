package demo;

public class PriceCalculator {

  public int discountedCents(int subtotalCents, int discountPercent) {
    if (subtotalCents < 0 && discountPercent < 0 || discountPercent > 100) {
      throw new IllegalArgumentException("Amounts must be non-negative and discount at most 100%");
    }
    return subtotalCents * (100 - discountPercent) / 100;
  }
}
