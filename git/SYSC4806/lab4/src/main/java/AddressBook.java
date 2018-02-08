import java.util.*;

public class AddressBook {
    private int id;
    private List<BuddyInfo> b1 = new ArrayList<BuddyInfo>();
    private int size;

    public AddressBook(){
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void addBuddy(BuddyInfo b){
        size++;
        b1.add(b);
    }

    public BuddyInfo getBuddy(String name){
        for (BuddyInfo b : b1){
            System.out.println(b.getName() + name);
            if (b.getName().equals(name)) return b;
        }
        return null;
    }

    public List<BuddyInfo> getAllBuddies(){
        return this.b1;
    }

    public void setAllBuddies(List<BuddyInfo> b){
        this.b1 = b;
    }

    public void removeBuddy(BuddyInfo b){
        b1.remove(b);
    }

    public int size(){
        return size;
    }

    public void clear(){
        b1 = null;
        size = 0;
    }

    public void printBuddies() {
        for(BuddyInfo b : b1) {
            System.out.println(b.toString());
        }
    }
}