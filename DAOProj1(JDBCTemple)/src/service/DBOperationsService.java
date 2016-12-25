package service;

import java.util.List;
import java.util.Map;

import dao.DBOperationsDAO;

public class DBOperationsService {
	DBOperationsDAO dao;
	public void setDao(DBOperationsDAO dao) {
		this.dao = dao;
	}
	public String registerEmp(int no, String name, String job, int sal)
	{
		int result=dao.insert(no, name, job, sal);
		if(result==0)
		{
			return no+" Emp record not registered";
		}
		else
		{
			return no+" Emp record registered";
		}
	}

	public Map<String, Object> getEmpDetails(int no) throws Exception
	{
		Map<String, Object> map=dao.listEmpDetails(no);
		if (map!=null)
		{
			//			System.out.println("if");
			return map;
		}
		else 
		{
			//			System.out.println("else");
			throw new Exception(no+" Employee is not found ");
		}
	}

	public List<Map<String, Object>> getAllDetails() throws Exception
	{
		List<Map<String, Object>> list=dao.listAllEmpDetail();
		return list;
	}

	public String changeByNo(int sal,int no)
	{
		int result=dao.updateByNo(sal,no);
		if(result==0)
		{
			return no+" Emp record is not updated";
		}
		else
		{
			return no+" Emp record is updated";
		}
	}

	public String removeByNo(int no)
	{
		int result=dao.deleteByNo(no);
		if(result==0)
		{
			return no+" Emp record is not deleted";
		}
		else
		{
			return no+" Emp record is deleted";
		}
	}
}
