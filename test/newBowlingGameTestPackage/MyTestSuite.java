package newBowlingGameTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses (  {
    GameTest.class, PlayersScoresTest.class
}  )
public class MyTestSuite {
}
