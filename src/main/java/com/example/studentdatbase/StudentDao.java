//package com.example.studentdatbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Repository
/*public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //create the table
    public void createTable()
    {
        System.out.println("Process started with creating table");
         var query= "CREATE TABLE student(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL, city varchar(255) NOT NULL)";
         System.out.println(this.jdbcTemplate.update(query));
         System.out.println("Process ended with creating table");
    }
    public void insertData(String name, String city)
    {
        String q="insert into student(name,city)values(?,?)";
              int update= this.jdbcTemplate.update(q,name,city);
              System.out.println(update+"rows added");
    }
}
*/

