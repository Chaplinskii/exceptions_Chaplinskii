package Parse;

import User.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ParseDate {
    public void parseDate(User user, List<String> list) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(list.get(3), dtf);
            user.setDateOfBirth(date);
        } catch (RuntimeException e) {
            throw new RuntimeException("Не удалось присвоить дату : " + e);
        }
    }
}
