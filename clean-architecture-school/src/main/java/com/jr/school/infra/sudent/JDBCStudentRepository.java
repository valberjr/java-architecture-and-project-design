package com.jr.school.infra.sudent;

import com.jr.school.domain.student.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCStudentRepository implements StudentRepository {

    private final Connection connection;

    public JDBCStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES(?,?,?)";

            var ps = connection.prepareStatement(sql);
            ps.setString(1, student.getCpf());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO PHONE VALUES(?,?)";

            ps = connection.prepareStatement(sql);
            for (Phone phone : student.getPhones()) {
                ps.setString(1, phone.getAreaCode());
                ps.setString(2, phone.getNumber());
                ps.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByCPF(CPF cpf) {
        try {
            String sql = "SELECT id, name, email FROM STUDENT WHERE cpf = ?";

            var ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getNumber());

            var rs = ps.executeQuery();
            var found = rs.next();
            if (!found) {
                throw new StudentNotFound(cpf);
            }

            var name = rs.getString("name");
            var email = new Email(rs.getString("email"));
            var studentFound = new Student(cpf, name, email);

            var id = rs.getLong("id");

            sql = "SELECT area_code, number FROM PHONE WHERE student_id = ?";

            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);

            rs = ps.executeQuery();
            while (rs.next()) {
                var number = rs.getString("number");
                var areaCode = rs.getString("area_code");
                studentFound.addPhone(areaCode, number);
            }

            return studentFound;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> listAllEnrolledStudents() {
        return null;
    }
}
