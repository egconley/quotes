/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

  App testApp = new App();
  String expected = testApp.getQuote();

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void testGetQuote() {
    Assert.assertTrue(expected.contains("Author"));
    Assert.assertTrue(expected.contains("Quote"));
  }
}