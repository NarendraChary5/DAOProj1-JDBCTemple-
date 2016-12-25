package dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationsDAO implements DBOperations{
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	private static final String INSERT_QUY="INSERT INTO EMP(NO,NAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String GET_DETAILS_BY_NO="SELECT NO,NAME,JOB,SAL FROM EMP WHERE NO=?";
	private static final String UPDATE_BY_NO="UPDATE EMP SET SAL=? WHERE NO=?";
	private static final String GET_ALL_DETAILS="SELECT NO,NAME,JOB,SAL FROM EMP";
	private static final String DELETE_BY_NO="DELETE FROM EMP WHERE NO=?";
	
	@Override
	public int insert(int no, String name, String job, int sal) {
		int result=jt.update(INSERT_QUY,no,name,job,sal);
		return result;
	}
	
	@Override
	public Map<String, Object> listEmpDetails(int no) {
		Map<String, Object> map=jt.queryForMap(GET_DETAILS_BY_NO,no);
		System.out.println("dao");
		return map;
	}
	
	@Override
	public List<Map<String, Object>> listAllEmpDetail() {
		List<Map<String, Object>> list=jt.queryForList(GET_ALL_DETAILS);
		return list;
	}
	
	@Override
	public int updateByNo(int sal,int no) {
		int result=jt.update(UPDATE_BY_NO,sal,no);
		return result;
	}
	
	@Override
	public int deleteByNo(int no) {
		int result=jt.update(DELETE_BY_NO,no);
		return result;
	}
}