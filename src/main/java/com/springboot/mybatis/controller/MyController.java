package com.springboot.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.mybatis.Mapper.StudentMapper;
import com.springboot.mybatis.domain.Student;

@Controller
public class MyController {
	   @Autowired
	   StudentMapper SM;
	   @RequestMapping("/hello")
	   public String hello(Model m,@RequestParam(value="start",defaultValue="1") int start,@RequestParam(value="size",defaultValue="2")int size) {
	       PageHelper.startPage(start, size, "id desc");
	       List<Student> list=SM.findAll();
	       PageInfo<Student>page=new PageInfo<Student>(list);
	       m.addAttribute("page", page);
	       return "hello";
	    }
}
