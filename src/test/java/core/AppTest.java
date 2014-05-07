package core;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class AppTest {

@BeforeClass
public static void BeforeClass() throws Exception {}
@AfterClass
public static void AfterClass() throws Exception {}
@Before
public void Before() throws Exception {}
@After
public void After() throws Exception {}

@Test
public void Test_01_AssertEquals_Positive() {assertEquals("String not the same", "Testing JUnit 4", App.s);}

@Test
public void Test_02_AssertEquals_Negative() {assertEquals("String not the same.", "Testing TestNG 6", App.s);}

@Ignore

@Test
public void Test_03_AssertEquals_Ignored() {assertEquals("String not the same.", "Testing JUnit 3", App.s);}

@Test
public void Test_04_AssertSame_Positive() {assertSame("Integer not the same.", 55,App.i);}

@Test
public void Test_05_AssertSame_Negative() {assertSame("Integer not the same.", 54,App.i);}

@Ignore

@Test
public void Test_06_AssertSame_Ignored() {assertSame("Integer not the same.", 56,App.i);}

@Test
public void Test_07_AssertFalse_Positive() {assertFalse("Boolean should be false", App.f);}

@Test
public void Test_08_AssertFalse_Negative() {assertFalse("Boolean should be false", App.t);}

@Test
public void Test_09_AssertTrue_Positive() {assertTrue("Boolean should be true", App.t);}

@Test
public void Test_10_AssertTrue_Negative() {assertTrue("Boolean should be true", App.f);}
}
