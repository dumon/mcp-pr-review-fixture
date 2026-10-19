package demo;

/** Calculates receipt totals from an external price source. */
public class ReceiptService {

  /**
   * Returns the receipt total in cents.
   *
   * @param source provider of the current amount
   * @return receipt total in cents
   */
  public long totalCents(PriceSource source) {
    return Math.multiplyExact(source.amount(), 100L);
  }
}
