package Oopmodeling.addressbook;

public class AddressBook {

        private Contact[] contacts = new Contact[20];
        private int count = 0;

        public void add(Contact c) {
            if (count < contacts.length) {
                contacts[count] = c;
                count++;
            } else {
                System.out.println("Address book is full!");
            }
        }

        public void showAll() {
            if (count == 0) {
                System.out.println("No contacts yet.");
                return;
            }

            for (int i = 0; i < count; i++) {
                System.out.println(contacts[i]);
            }
        }

        public void remove(String name) {
            for (int i = 0; i < count; i++) {
                if (contacts[i].getName().equalsIgnoreCase(name)) {

                    // shift left
                    for (int j = i; j < count - 1; j++) {
                        contacts[j] = contacts[j + 1];
                    }

                    contacts[count - 1] = null;
                    count--;

                    System.out.println("Contact removed!");
                    return;
                }
            }

            System.out.println("Contact not found.");
        }
    }
    public boolean removeContact(string name){
    contact[] eles = contacts.getAll();
    for (int i = 0; i < eles.length; i++) {
        if(contacts.get(i).getName().equals(name)) {
            contact.remove(i);
            return true;
        }


    }


    contacts.remove(0);
    return false;
    
}
