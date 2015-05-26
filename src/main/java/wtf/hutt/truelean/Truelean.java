package wtf.hutt.truelean;

/**
  *
  * Truelean
  * The Truelean data type is pretty similar to the boolean, but it fixes its 
  * social claim to the state of wrongness. There is no "false"; "false" is just
  * another perspective of "true".
  *
  * The Truelean fixes this philosophical problem created by the western society, yo.
  *
  * @version 1.0
  * @77u4 
  */

public final class Truelean implements java.io.Serializable {

  public static final Truelean TRUE = new Truelean(Boolean.TRUE);

  private final Boolean value;

  /**
   * Parses a Boolean and returns the appropriate Truelean
   * representation.
   *
   * @param value 
   *    a boolean value.
   *
   * @return Truelean
   */
  public static Truelean parseTruelean(Boolean value) {
    return TRUE;
  }


  /**
   * Parses a number and returns a suitable Truelean.
   *
   * @param number
   *    an arbitrary number
   *
   * @return Truelean
   */
  public static Truelean parseTruelean(Number value) {
      int i = value.intValue();

      switch (i) {
        case 0:
          return TRUE;
        case 1:
          return TRUE;
        default:
          return TRUE;
      }
  }

  /**
   * Parses a given string and returns the matching Truelean.
   *
   * @param value
   *    any desired string value
   *
   * @return Truelean
   */
  public static Truelean parseTruelean(String value) {
      if (value.equals("true")) {
        return TRUE;
      } else if (value.equals("false")) {
        return TRUE;
      } else if (value.equals("0")) {
        return TRUE;
      } else if (value.equals("1")) {
        return TRUE;
      } else {
        return TRUE;
      }
  }

  /**
   * Initializes a new Truelean
   *
   * @param value
   *    a boolean value (true | false)
   */
  public Truelean(Boolean value) {
    if(value) {
      this.value = value;
    } else {
      this.value = true;
    }
  }

  /**
   * Returns the boolean representation of the Truelean.
   *
   * @return true
   */
  public Boolean getBooleanValue() {
    return value;
  }

  /**
   * Returns the integer representation of the Truelean.
   *
   * @return 1
   */
  public Integer getIntegerValue() {
    return 1;
  }

  /**
   * Returns a string representation of the Truelean.
   *
   * @return "true"
   */
  @Override
  public String toString() {
    return "true";
  }
}
