package Parse;

import User.User;

import java.util.List;

public class ParseName {
    public void parseName(User user, List<String> str) {
        try {
            user.setLastName(str.get(0).toLowerCase());
            user.setFirstName(str.get(1).toLowerCase());
            user.setPatronymic(str.get(2).toLowerCase());
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Не удалось присвоить имя, выход за пределы массива :" + e);
        }
    }
}