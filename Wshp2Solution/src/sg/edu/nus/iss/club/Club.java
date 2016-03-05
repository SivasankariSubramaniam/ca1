package sg.edu.nus.iss.club;

import java.util.ArrayList;

public class Club {

    private static final int ARRAY_SIZE_INCREMENT = 10;

    private int    numMembers = 0;
    private int    count = 0;
    private ArrayList<Member> members = new ArrayList<Member>();

    public Member getMember (int memberNum) {
        if ((memberNum < 0) || (memberNum > numMembers)) {
            return null;
        }
        return members.get(memberNum);
    }

    public ArrayList<Member> getMembers () {
    	ArrayList<Member> arr = new ArrayList<Member>(count);
        int j = 0;
        for (int i = 0; i < numMembers; i++) {
            if (members.get(i) != null) {
                arr.add(j, members.get(i));
            }
        }
        return arr;
    }

    public Member addMember (String surname, String firstName,
                                             String secondName) {
        ensureArraySize ();
        numMembers++;
        Member m = new Member (surname, firstName, secondName,
                                                   numMembers);
        members.add(count, m);
        count++;
        return m;
    }

    public void removeMember (int memberNum) {
        if ((memberNum < 0) || (memberNum > numMembers)) {
            return;
        }
        if (members.get(memberNum) != null) {
            members.remove(memberNum);
            count--;
        }
    }

    public void showMembers () {
    	ArrayList<Member> arr = getMembers();
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).show ();
        }
    }

    private void ensureArraySize () {
        if (numMembers >= members.size()) {
        	ArrayList<Member> newMembers;
            int newSize = numMembers + ARRAY_SIZE_INCREMENT;
            newMembers = new ArrayList<Member>(newSize);
            for (int i = 0; i < numMembers; i++) {
                newMembers.add(i, members.get(i));
            }
            members = newMembers;
        }
    }
}
