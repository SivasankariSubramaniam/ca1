package sg.edu.nus.iss.club;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FacilityTest.class, MemberTest.class, PersonTest.class, Club.class, Booking.class })

public class AllTests {

}
