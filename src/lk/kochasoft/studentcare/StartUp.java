package lk.kochasoft.studentcare;

import lk.kochasoft.studentcare.controller.StudentController;
import lk.kochasoft.studentcare.dto.student.CreateStudentDTO;

import java.sql.SQLException;

public class StartUp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentController studentController = new StudentController();


        CreateStudentDTO createStudentDTO = new CreateStudentDTO("Priyanthan", "Dehiwala");
        studentController.createStudent(createStudentDTO);



    }
}
