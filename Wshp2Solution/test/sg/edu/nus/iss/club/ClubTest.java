package sg.edu.nus.iss.club;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ClubTest extends TestCase {

	private Club club;
	@Before
	public void setUp() throws Exception {
		club = new Club();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMember() {
		//Get member from the empty club
//		assertNull(club.getMember(-1));
		
		// pass an invalid parameter
		assertNull(club.getMember(-1));
		assertNull(club.getMember(100));
		
		// add a member and ensure that you get the same member 
		Member member = new Member("Tan", "Siew", "Siew", 1);
		club.addMember("Tan", "Siew", "Siew");
		assertEquals (member, club.getMember(0));
		club.addMember("Tay", "May", "Ling");
		club.addMember("Wong", "Siew", "Fong");
		club.addMember("Pang", "Wai", "Hong");
		club.addMember("Chan", "Puay", "Siew");
		Member member3 = new Member("Wong", "Siew", "Fong", 3);
		assertEquals (member3, club.getMember(2));
	}

	@Test
	public void testGetMembers() {
		ArrayList<Member> members = club.getMembers();
		assertTrue(members.size() == 0);
		
		club.addMember("Tan1", "Siew", "Siew");
		club.addMember("Tan2", "Siew", "Siew");
		club.addMember("Tan3", "Siew", "Siew");
		club.addMember("Tan4", "Siew", "Siew");
		club.addMember("Tan5", "Siew", "Siew");
		club.addMember("Tan6", "Siew", "Siew");
		club.addMember("Tan7", "Siew", "Siew");
		club.addMember("Tan8", "Siew", "Siew");
		club.addMember("Tan9", "Siew", "Siew");
		club.addMember("Tan10", "Siew", "Siew");
		club.addMember("Tan11", "Siew", "Siew");
		club.addMember("Tan12", "Siew", "Siew");
		club.addMember("Tan13", "Siew", "Siew");
		
		members = club.getMembers();
		assertTrue(members.size() == 13);
	}

	@Test
	public void testAddMember() {
		Member member = new Member("Tan1", "Siew", "Siew", 1);
		club.addMember("Tan1", "Siew", "Siew");
		assertEquals (member, club.getMember(0));
		
		// add more than 10 members
		club.addMember("Tan2", "Siew", "Siew");
		club.addMember("Tan3", "Siew", "Siew");
		club.addMember("Tan4", "Siew", "Siew");
		club.addMember("Tan5", "Siew", "Siew");
		club.addMember("Tan6", "Siew", "Siew");
		club.addMember("Tan7", "Siew", "Siew");
		club.addMember("Tan8", "Siew", "Siew");
		club.addMember("Tan9", "Siew", "Siew");
		club.addMember("Tan10", "Siew", "Siew");
		club.addMember("Tan11", "Siew", "Siew");
		club.addMember("Tan12", "Siew", "Siew");
		club.addMember("Tan13", "Siew", "Siew");
		
		Member member1 = new Member("Tan1", "Siew", "Siew", 1);
		Member member11 = new Member("Tan11", "Siew", "Siew", 11);
		assertEquals (member1, club.getMember(0));
		assertEquals (member11, club.getMember(10));
		
		
	}

	@Test
	public void testRemoveMember() {
		
		club.removeMember(0);
		
		Member member = new Member("Tan1", "Siew", "Siew", 1);
		club.addMember("Tan1", "Siew", "Siew");
		club.addMember("Tan2", "Siew", "Siew");
		club.addMember("Tan3", "Siew", "Siew");
		club.addMember("Tan4", "Siew", "Siew");
		club.addMember("Tan5", "Siew", "Siew");
		
		club.removeMember(0);
		assertFalse (member.equals(club.getMember(0)));
		Member member2 = new Member("Tan2", "Siew", "Siew", 2);
		assertTrue (member2.equals(club.getMember(1)));
		
		club.removeMember(4);
		Member member5 = new Member("Tan5", "Siew", "Siew", 5);
		assertFalse (member5.equals(club.getMember(3)));
		
		club.removeMember(2);
		Member member3 = new Member("Tan3", "Siew", "Siew", 3);
		assertFalse (member3.equals(club.getMember(2)));
		
	}

	@Test
	public void testShowMembers() {
		assertTrue(true);
	}

}
