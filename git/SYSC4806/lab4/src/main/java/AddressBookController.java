import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
    public AddressBook a = new AddressBook();

    @RequestMapping("/addressbook")
    public AddressBook addAddressBook() {
        return a;
    }

    @RequestMapping("/add_buddy")
    public AddressBook addBuddyInfo(@RequestParam(value="Buddy Name", defaultValue="N/A") String n,
                             @RequestParam(value="Buddy Address", defaultValue="N/A") String ad,
                             @RequestParam(value="Buddy Phone Number", defaultValue="N/A") String p,
                             @RequestParam(value="Buddy Age", defaultValue="") int ag) {
        a.addBuddy(new BuddyInfo(n,ad,p,ag));
        return a;
    }

    @RequestMapping("/remove_buddy")
    public AddressBook removeBuddyInfo(@RequestParam(value="Buddy Name", defaultValue="World") String n,
                             @RequestParam(value="Buddy Address", defaultValue="World") String ad,
                             @RequestParam(value="Buddy Phone Number", defaultValue="World") String p,
                             @RequestParam(value="Buddy Age", defaultValue="") int ag) {
        a.removeBuddy(new BuddyInfo(n,ad,p,ag));
        return a;
    }
}
