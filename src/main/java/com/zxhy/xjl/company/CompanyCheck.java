package com.zxhy.xjl.company;

import java.util.List;

/**
 * 企业核对
 * @author leasonlive
 *
 */
public interface CompanyCheck {
	/**
	 * 核对企业名称，如果企业名称已经存在，则返回false
	 * @param companyName 企业名称
	 * @return
	 */
	public boolean checkName(String companyName);
	/**
	 * 核对企业名称被占用情况，返回已经被占用的企业名称列表
	 * @param companyName
	 * @return
	 */
	public List<Company> checkNameUsed(String companyName);
}
