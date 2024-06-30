package Service;

import File.WorkingFiles;
import User.User;

public class WorkingFileService {
    Service service = new Service();
    private WorkingFiles workingFiles = new WorkingFiles();

    public void saveToFile(User user) {
        String nameFile = new String(user.getLastName().toLowerCase() + ".txt");
        StringBuilder infoUser = new StringBuilder(user.getLastName() + " "
                + user.getFirstName() + " "
                + user.getPatronymic() + " "
                + service.getParseDate(user) + " "
                + service.getParseTelephone(user)+ " "
                + service.getParseGender(user));
        workingFiles.saveToFile(nameFile, infoUser);
    }
}
