import java.util.*;

public class AddressBook {
    private List<BuddyInfo> thePals;

    public static void main(String[] args){
        System.out.println("Fuck");
    }

    AddressBook(){

    }
    public void addBuddy(BuddyInfo newPal){
        thePals.add(newPal);
    }
    public void removeBuddy(BuddyInfo oldPal){
        thePals.remove(thePals.indexOf(oldPal));
    }
}
