import java.util.*;

public class AddressBook {
    private List<BuddyInfo> thePals;

    public static void main(String[] args){
        System.out.println("Fuck");
        BuddyInfo myPal=new BuddyInfo("Cahhrl","123 st","613");
        AddressBook myBook=new AddressBook();
        myBook.addBuddy(myPal);
        myBook.removeBuddy(myPal);
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
