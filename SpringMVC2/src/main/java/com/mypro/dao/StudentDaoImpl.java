package com.mypro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mypro.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveStudent(Student student) {
		String sql ="insert into student values(?,?,?,?)";
		return jdbcTemplate.update(sql,student.getRollno(),student.getName(),student.getHQual(),student.getExp());
	}

	@Override
	public void delete(int rollno) {
 
		String sql = "delete from student where rollno = ?";
		
		Object[] args = new Object[] {rollno};
 
		jdbcTemplate.update(sql,args);
		
	}


	
	@Override
	public List<Student> fetchall() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student s = new Student();
				s.setRollno(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setHQual(rs.getString(3));
				s.setExp(rs.getInt(4));				
				return s;
			}
			
		});
	}

	@Override
	public int update(Student student) {

		String sql = "update student set name =?,HQual =?,exp =? where rollno =?";
		Object[] arg = new Object[] {student.getName(),student.getHQual(),student.getExp(),student.getRollno()};
        
		return jdbcTemplate.update(sql, arg);
	}

	
	@Override
	public Student getStudent(int rollno) {

		String sql ="select * from student where rollno =?";
		
		return jdbcTemplate.queryForObject(sql, new Object[] {rollno}, new StudentRowMapper());			
		
		}

	public class StudentRowMapper implements RowMapper<Student>
	{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
         
			Student stu = new Student();
			stu.setRollno(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setHQual(rs.getString(3));
			stu.setExp(rs.getInt(4));

			return stu;
		}
		
	}
	
}
