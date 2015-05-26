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

  public static Truelean parseTruelean(Boolean value) {
    return TRUE;
  }

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

  public Truelean(Boolean value) {
    this.value = value;
  }

  /**
  * @return true
  */
  public Boolean getBooleanValue() {
    return value;
  }

  /**
  * @return 1
  */
  public Integer getIntegerValue() {
    return 1;
  }

  @Override
  public String toString() {
    return "true";
  }
}
