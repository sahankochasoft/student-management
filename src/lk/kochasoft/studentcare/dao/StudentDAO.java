package lk.kochasoft.studentcare.dao;

import lk.kochasoft.studentcare.dto.student.CreateStudentDTO;

import java.sql.SQLException;

public interface StudentDAO {

    boolean createStudent(CreateStudentDTO createStudentDTO) throws SQLException, ClassNotFoundException;

    boolean getStudents();


}
