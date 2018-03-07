package com.subin.kid.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.subin.kid.DAO.TestDAO;
import com.subin.kid.bean.TestBean;



@Service

public class TestServiceImpl implements TestService {
	@Inject
	private TestDAO dao;



	@Override
	public List<TestBean> test()throws Exception {

		// TODO Auto-generated method stub

		return dao.test();

	}



}