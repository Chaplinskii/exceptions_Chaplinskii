package Parse;

import User.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    public String getParseDate(User user){
        LocalDate localDate = user.getDateOfBirth();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedString = localDate.format(formatter);
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        String data = df.format(user.getDateOfBirth());
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String date = String.(user.getDateOfBirth(), dtf);
        return formattedString;
    }
}
