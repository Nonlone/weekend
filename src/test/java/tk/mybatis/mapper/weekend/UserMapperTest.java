package tk.mybatis.mapper.weekend;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.mapper.weekend.entity.User;
import tk.mybatis.mapper.weekend.mapper.UserMapper;

import java.util.Arrays;
import java.util.List;

/**
 * @author Frank
 */
public class UserMapperTest {

    /**
     * 执行，然后看日志打出来的SQL
     */
    @Test
    public void testSelectIdIsNull(){
        SqlSession    sqlSession = MybatisHelper.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Weekend<User> weekend = Weekend.of(User.class);
        weekend.weekendCriteria()
                .andIsNull(User::getId)
                .andBetween(User::getId,0,10)
                .andIn(User::getUserName, Arrays.asList("a","b","c"));

        List<User> users = userMapper.selectByExample(weekend);
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }
}
