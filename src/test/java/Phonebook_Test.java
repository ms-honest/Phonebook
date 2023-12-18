import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    Phonebook phonebook = new Phonebook();
    Person person1 = new Person("zra", "09399912612");
    Person person2 =new Person("mahi","09123456789");
    @Test
    public void getPhoneNumber_Test(){
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals("09399912612", phonebook.getPhoneNumber("zra"));
        assertEquals("09399912612", phonebook.getPhoneNumber("zRa"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber("zraa"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber("sara"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber("zra "));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber(" "));
    }

    @Test
    public void getContact_Test(){
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals(true, phonebook.getContact("zra"));
        assertEquals(true, phonebook.getContact("zRa"));
        assertEquals(false, phonebook.getContact("tina"));
        assertEquals(false, phonebook.getContact(" "));

    }
}
