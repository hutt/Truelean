package wtf.hutt.truelean;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrueleanTest {

  @Test
  public void testParseTrueleanWithString() {
    assertTrue(Truelean.parseTruelean("false").getBooleanValue());
    assertTrue(Truelean.parseTruelean("true").getBooleanValue());
    assertTrue(Truelean.parseTruelean("0").getBooleanValue());
    assertTrue(Truelean.parseTruelean("1").getBooleanValue());
  }

  @Test
  public void testParseTrueleanWithBoolean() {
    assertTrue(Truelean.parseTruelean(true).getBooleanValue());
    assertTrue(Truelean.parseTruelean(false).getBooleanValue());
  }

  @Test
  public void testParseTrueleanWithInteger() {
    assertTrue(Truelean.parseTruelean(0).getBooleanValue());
    assertTrue(Truelean.parseTruelean(1).getBooleanValue());
    assertTrue(Truelean.parseTruelean(-1).getBooleanValue());
    assertTrue(Truelean.parseTruelean(2).getBooleanValue());
  }

  @Test
  public void testParseTrueleanWithFloat() {
    assertTrue(Truelean.parseTruelean(0.0).getBooleanValue());
    assertTrue(Truelean.parseTruelean(0.3).getBooleanValue());
    assertTrue(Truelean.parseTruelean(1.0).getBooleanValue());
    assertTrue(Truelean.parseTruelean(1.4).getBooleanValue());
    assertTrue(Truelean.parseTruelean(-1.2).getBooleanValue());
    assertTrue(Truelean.parseTruelean(2.0).getBooleanValue());
  }
}
