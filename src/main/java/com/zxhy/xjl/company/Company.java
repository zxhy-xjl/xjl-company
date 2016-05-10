package com.zxhy.xjl.company;
/**
 * 企业信息
 * @author leasonlive
 *
 */
public class Company {
	//企业名称
	private String name;
	//企业代码，统一信用代码
	private String code;
	//企业名称状态
	private CompanyNameStatus companyNameStatus;
	//地址
	private String addr;
	//法人
	private String artificialPerson;
	/**
	 * 企业名称状态列表
	 * @author leasonlive
	 *
	 */
	public static enum CompanyNameStatus {
		/** 申请保护 */
		application,
		/** 正常使用 */
		active,
		/** 保留，如因为注销或者其他原因需要保留一段时间 */
		keep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public CompanyNameStatus getCompanyNameStatus() {
		return companyNameStatus;
	}
	public void setCompanyNameStatus(CompanyNameStatus companyNameStatus) {
		this.companyNameStatus = companyNameStatus;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getArtificialPerson() {
		return artificialPerson;
	}
	public void setArtificialPerson(String artificialPerson) {
		this.artificialPerson = artificialPerson;
	}
	
	
}
