package com.kimjy.spring.ex.jsp.dao;



import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kimjy.spring.ex.jsp.model.User;
@Repository
public interface UserDAO {
	
	
	public int insertUser(
			@Param("name") String name
			, @Param("birthDay") String birthDay
			, @Param("introduce") String introduce
			, @Param("email") String email);
	
	public int inseUserByObject(User user);
	
	public User selectLastUser();

}
