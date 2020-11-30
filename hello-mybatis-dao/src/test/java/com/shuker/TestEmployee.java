package com.shuker;


import com.github.pagehelper.PageHelper;
import com.shuker.dao.EmployeeDao;
import com.shuker.pojo.Employee;
import com.shuker.pojo.EmployeeVo;
import com.shuker.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestEmployee
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 13:06
 * @Version 1.0
 **/
public class TestEmployee {
    private SqlSession session = MybatisUtils.getSqlSession();

    @Test
    public void testInsert() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Employee employee = new Employee();
        employee.setLastName("qingtian");
        employee.setEmail("qingtian@111.com");
        employee.setGender('0');
        int i = sqlSession.insert("com.shuker.dao.EmployeeDao.insertEmployee", employee);
        sqlSession.commit();
        System.out.println("受影响的行数=" + i);

    }

    @Test
    public void testQueryAll() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        List<Employee> employees = sqlSession.selectList("com.shuker.dao.EmployeeDao.queryEmployees");
        for (Employee emp : employees
        ) {
            System.out.println(emp);
        }
        sqlSession.close();

    }

    @Test
    public void testInsertDao() throws IOException {
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        int hzougeijng = dao.insertEmloyee(new Employee(null, "hzougeijng", '0', "zhougejing@11.com"));
        System.out.println(hzougeijng >= 0 ? "success" : "fail");
    }

    @Test
    public void testQueryAllDao() throws IOException {
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        List<Employee> employees = dao.queryEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }

    @Test
    public void testQueryEmpById() {
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        Employee employee = dao.queryEmpById(1);
        System.out.println("查询的对象" + employee);
    }

    @Test
    public void testQueryEmpParam() {

        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        Employee employee = dao.queryByParam("tom", 1);
        System.out.println("查询的对象" + employee);
    }

    @Test
    public void testQueryEmpByWhere() {

        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        Employee employee = dao.queryEmpByWhere(1, "tom");
        System.out.println("查询的对象" + employee);
    }

    @Test
    public void testQueryByForeach() {

        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        List<Integer> idlist = new ArrayList<>();
        idlist.add(1);
        idlist.add(2);
        idlist.add(3);

        List<Employee> employees = dao.queryEmpByForEach(idlist);
        for (Employee emp :employees){
            System.out.println(emp);
        }
    }

    @Test
    public void testQueryByForeachTwo() {

        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        List<Employee> idlist = new ArrayList<>();
        for (int i = 0 ;i<4;i++){
            Employee employee = new Employee();
            employee.setId(i);
            idlist.add(employee);
        }

        List<Employee> employees = dao.queryEmpByForEachTwo(idlist);
        for (Employee emp :employees){
            System.out.println(emp);
        }
    }

    @Test
    public void testQueryAll1() {

        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        PageHelper.startPage(1, 3);
        List<Employee> employees = dao.queryAll();
        for (Employee emp :employees){
            System.out.println(emp);
        }
    }

    @Test
    public void testFindByEmployee() {
        Employee employee = new Employee();
        employee.setLastName("jack");
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        Employee byEmployee = dao.findByEmployee(employee);
        System.out.println(byEmployee);

    }
    @Test
    public void testLikeFindByEmployeeLastName() {
        Employee employee = new Employee();
        employee.setLastName("%ian%");
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        List<Employee> employees = dao.likeFindByEmployeeLastName(employee);
        System.out.println(employees);
        session.close();

    }

    @Test
    public void testLikeFindByEmployeeVo() {
        EmployeeVo vo = new EmployeeVo();
        vo.setLastName("%ian%");
        List<Integer> ids= new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        vo.setIds(ids);
        EmployeeDao dao = session.getMapper(EmployeeDao.class);
        List<Employee> employees = dao.likeFindByEmployeeVo(vo);
        System.out.println(employees);
        session.close();

    }

}
