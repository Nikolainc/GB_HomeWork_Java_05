package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> _phoneBook;

    public PhoneBook() {

        this._phoneBook = new HashMap<>();

    }

    public List<String> get(String name) {
      
        return _phoneBook.get(name);

    }

    public void add(String name, String phone) {

        List<String> phoneList = _phoneBook.get(name);
        
        if (phoneList == null) {

            phoneList = new ArrayList();
            phoneList.add(phone);
            _phoneBook.put(name, phoneList);

        } else if (!phoneList.contains(phone)) {

            phoneList.add(phone);
            _phoneBook.put(name, phoneList);

        }

    }

    public void add(String name, String[] phones) {

        for (String phone : phones) {
            
            add(name, phone);

        }

    }
}