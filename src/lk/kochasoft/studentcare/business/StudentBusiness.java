package lk.kochasoft.studentcare.business;

import lk.kochasoft.studentcare.dao.StudentDAO;
import lk.kochasoft.studentcare.dao.impl.StudentDAOImpl;
import lk.kochasoft.studentcare.dto.student.CreateStudentDTO;

import java.sql.SQLException;

public class StudentBusiness {

    private final StudentDAO studentDAO = new StudentDAOImpl();


    public boolean createStudent(CreateStudentDTO createStudentDTO) throws SQLException, ClassNotFoundException {

        // if we need logics
        System.out.println("Student Service");
        return studentDAO.createStudent(createStudentDTO);
    }


}
