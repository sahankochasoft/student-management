package lk.kochasoft.studentcare.controller;

import lk.kochasoft.studentcare.business.StudentBusiness;
import lk.kochasoft.studentcare.dto.student.CreateStudentDTO;

import java.sql.SQLException;

public class StudentController {

    private StudentBusiness studentBusiness = new StudentBusiness();

    public void createStudent(CreateStudentDTO createStudentDTO) throws SQLException, ClassNotFoundException {
        System.out.println("Student Controller");
        studentBusiness.createStudent(createStudentDTO);
    }

}
