/**
 * 
 */
package sg.edu.nus.iss.club;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author SIVASANKARI
 *
 */
public class Booking {
	private Member member;
	private Facility facility;
	private String startDate;
	private String endDate;
	
	/**
	 * @param member
	 * @param facility
	 * @param startDate
	 * @param endDate
	 */
	public Booking(Member member, Facility facility, String startDate, String endDate) {
		super();
		this.member = member;
		this.facility = facility;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public boolean overlap(Booking bookingToCompare) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.format(new Date(getStartDate()));
		boolean isOverlap = false;
		if((this.getFacility().equals(bookingToCompare.getFacility())) && 
				((this.getEndDate().after(bookingToCompare.getStartDate()) && this.getEndDate().before(bookingToCompare.getEndDate())) 
						|| (bookingToCompare.getEndDate().after(this.getStartDate()) && bookingToCompare.getEndDate().before(this.getEndDate())))) {
			isOverlap = true;
		}
		return isOverlap;
	}
	
	/**
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}
	/**
	 * @return the facility
	 */
	public Facility getFacility() {
		return facility;
	}
	/**
	 * @param facility the facility to set
	 */
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Booking [member=" + member.toString() + ", facility=" + facility.toString() + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
}
