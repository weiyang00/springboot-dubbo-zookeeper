/**
 * 
 */
package com.example.springbootdemo.service;


import java.util.Date;


/**
 * 
 * @author Administrator
 * 
 */
public class Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账户编号
	 */
	private String accountNo;
	/**
	 * 用户编号
	 */
	private String userNo;
	/**
	 * 账户状态
	 */
	private Integer status;
	/**
	 * 账户余额
	 */
	private Double balance = 0D;
	/**
	 * 不可用余额
	 */
	private Double unBalance = 0D;
	/**
	 * 保证金
	 */
	private Double securityMoney = 0D;
	/**
	 * 账户类型
	 */
	private Integer accountType;
	/**
	 * 最后更新时间
	 */
	private Date lastTime = new Date();
	/**
	 * 可结算金额
	 */
	private Double availableSettAmount = 0D;
	/**
	 * 会计科目代码
	 */
	private String accountTitleNo;

	/**
	 * 账户编号
	 * 
	 * @return
	 */
	public String getAccountNo() {
		return accountNo.trim();
	}

	/**
	 * 账户编号
	 * 
	 * @param accountNo
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	/**
	 * 余额
	 * 
	 * @return
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * 余额
	 * 
	 * @return
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * 不可用余额
	 * 
	 * @return
	 */
	public Double getUnBalance() {
		return unBalance;
	}

	/**
	 * 不可用余额
	 * 
	 * @return
	 */
	public void setUnBalance(Double unBalance) {
		this.unBalance = unBalance;
	}

	/**
	 * 保证金
	 * 
	 * @return
	 */
	public Double getSecurityMoney() {
		return securityMoney;
	}

	/**
	 * 保证金
	 * 
	 * @return
	 */
	public void setSecurityMoney(Double securityMoney) {
		this.securityMoney = securityMoney;
	}

	/**
	 * 账户状态
	 * 
	 * @return
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 账户状态
	 * 
	 * @return
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 账户类型
	 * 
	 * @return
	 */

	public Integer getAccountType() {
		return accountType;
	}

	/**
	 * 账户类型
	 * 
	 * @param accountType
	 */
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	/**
	 * 最后更新时间
	 * 
	 * @return
	 */
	public Date getLastTime() {
		return lastTime;
	}

	/**
	 * 最后更新时间
	 * 
	 * @return
	 */
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	/**
	 * 会计科目代码
	 * 
	 * @return
	 */
	public String getAccountTitleNo() {
		return accountTitleNo;
	}

	/**
	 * 会计科目代码
	 * 
	 * @param accountTitleNo
	 */
	public void setAccountTitleNo(String accountTitleNo) {
		this.accountTitleNo = accountTitleNo;
	}

	/**
	 * 可结算金额
	 * 
	 * @return
	 */
	public Double getAvailableSettAmount() {
		return availableSettAmount;
	}

	/**
	 * 可结算金额
	 * 
	 * @return
	 */
	public void setAvailableSettAmount(Double availableSettAmount) {
		this.availableSettAmount = availableSettAmount;
	}

}
