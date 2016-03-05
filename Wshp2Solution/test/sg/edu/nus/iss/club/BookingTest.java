/**
 * 
 */
package sg.edu.nus.iss.club;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author SIVASANKARI
 *
 */
public class BookingTest {
	
	private Booking bookingOne;
	private String startDateOne;
	private Calendar endDateOne;
	private Booking bookingTwo;
	private Calendar startDateTwo;
	private Calendar endDateTwo;
	private Member member;
	private Facility facility;
	SimpleDateFormat sdf;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
		member = new Member("Laufeyson", "Loki", "Farbati", 1);
		facility = new Facility("Tatooine", "Kenobi Planet");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOverlapEndOneAfterStartTwo() {
		startDateOne = sdf.format(new GregorianCalendar(2013,10,28,13,24,56).getTime());
		System.out.println(startDateOne);
//		endDateOne = startDateOne.
//		booking = new Booking(member, facility, )
//		fail("Not yet implemented");
	}
}
