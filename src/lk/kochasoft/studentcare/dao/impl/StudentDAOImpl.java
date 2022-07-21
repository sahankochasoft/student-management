package lk.kochasoft.studentcare.dao.impl;

import lk.kochasoft.studentcare.dao.StudentDAO;
import lk.kochasoft.studentcare.db.DbConnection;
import lk.kochasoft.studentcare.dto.student.CreateStudentDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean createStudent(CreateStudentDTO createStudentDTO) throws SQLException, ClassNotFoundException {

        PreparedStatement preparedStatement = DbConnection.getInstance().getConnection()
                .prepareStatement("INSERT INTO students (`name`, `address`)" +
                " VALUES (?,?)");

        preparedStatement.setObject(1, createStudentDTO.getName());
        preparedStatement.setObject(2, createStudentDTO.getAddress());

        preparedStatement.execute();

        return false;
    }

    @Override
    public boolean getStudents() {
        return false;
    }
}
