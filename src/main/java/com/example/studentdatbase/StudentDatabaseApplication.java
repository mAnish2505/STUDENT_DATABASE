package com.example.studentdatbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentDatabaseApplication /*implements CommandLineRunner*/
{
	//@Autowired
 //  private StudentDao studentDao;
	public static void main(String[] args)
	{
		SpringApplication.run(StudentDatabaseApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception
	{
		//this.studentDao.createTable();
		this.studentDao.insertData("Manish Kumar","Lucknow");
		//System.out.println("rows added"+);
	}*/
}
