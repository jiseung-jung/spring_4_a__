package com.choa.s4.member.memberFile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.s4.MyTestCase;

public class MemberFileDAOTest extends MyTestCase{

	@Autowired
	private MemberFileDAO memberFileDAO;
	

	
	//@Test(expected = RuntimeException.class)
	public void setInsert() throws Exception {
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("aa");
		memberFileDTO.setFileName("main_1.jpg");
		memberFileDTO.setOriName("oriname");
		int result = memberFileDAO.setInsert(memberFileDTO);
		
		assertNotEquals(0, result);
	}

}
