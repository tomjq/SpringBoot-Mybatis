package com.springboot.mybatis.Test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.springboot.mybatis.Mapper.StudentMapper;
import com.springboot.mybatis.domain.Student;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {
	@Autowired
	private StudentMapper Sm;
	@Test
	public void test(){
		Sm.insert(8, "sun");
		List<Student> ls=Sm.findAll();
		for(Student m:ls){
			System.out.println(m);
		}
	}
}
