package com.springboot.mybatis.Mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.springboot.mybatis.domain.Student;
@Mapper
public interface StudentMapper {
	@Select("select*from Student")
	List<Student>findAll();
	@Insert("insert into Student(id,name)values(#{id},#{name})")
	int insert(@Param("id")int id,@Param("name")String name);
	@Select("select*from Student where id=${id}")
	public Student get(int id);
}
