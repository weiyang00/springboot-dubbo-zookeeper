package com.example.springbootdemo.service;

import java.util.List;
import java.util.Map;

/**
 * 账户查询
 * 
 * @author healy
 * 
 */
public interface AccountQueryFacade {



	/**
	 * 根据账户编号查询账户信息.
	 * 
	 * @param accountNo
	 *            账户编号.
	 * @return account 查询到的账户信息.
	 * @throws AccountBizException
	 */
	Account getAccountByAccountNo(String accountNo) ;

}
