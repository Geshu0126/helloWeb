import com.shuker.dao.IAccountDao;
import com.shuker.domain.Account;
import com.shuker.domain.AccountUser;
import com.shuker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestAccount
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 20:02
 * @Version 1.0
 **/
public class TestAccount {

    @Test
    public void testAccount(){
        SqlSession session = MybatisUtils.getSqlSession();
        IAccountDao mapper = session.getMapper(IAccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account account : all)
        {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAllAccountUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        IAccountDao mapper = session.getMapper(IAccountDao.class);
        List<AccountUser> all = mapper.findAllAccountUser();
        for (AccountUser account : all)
        {
            System.out.println(account);
        }
    }
}
