package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Student;




//we dont add@repository

//beacoz jparepository interface has a defalut implementation class that is 
//simplejpaRepository of class of repository it is already in that 




//<1st is jpa entity, 2nd type of primary key>
public interface StudentRepository extends JpaRepository<Student, Long>{

}
