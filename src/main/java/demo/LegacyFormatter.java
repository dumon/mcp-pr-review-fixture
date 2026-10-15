package demo;

public class LegacyFormatter {

  public String format(String value) {
    return value == null ? null : value.trim();
  }
}
