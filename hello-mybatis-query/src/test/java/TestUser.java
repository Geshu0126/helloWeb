import com.shuker.dao.IUserDao;
import com.shuker.domain.User;
import com.shuker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 21:26
 * @Version 1.0
 **/
public class TestUser {
    @Test
    public void testFindAllUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        List<User> userList = mapper.findAll();
        for (User user: userList){
            System.out.println(user);
        }
    }
}
