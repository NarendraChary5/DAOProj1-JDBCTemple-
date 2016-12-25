package dao;

import java.util.List;
import java.util.Map;

public interface DBOperations {
	public int insert(int no,String name,String job,int sal);
	public Map<String,Object> listEmpDetails(int no);
	public List<Map<String,Object>> listAllEmpDetail();
	public int updateByNo(int sal,int no);
	public int deleteByNo(int no);
}
