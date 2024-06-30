package Controller;

import Service.WorkingFileService;
import User.User;

public class WorkingFileController {
    private WorkingFileService workingFileService= new WorkingFileService();

    public void saveToFile(User infoUser) {
        workingFileService.saveToFile(infoUser);
    }
}
