package study.ssm.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.vo.QueryParam;

import java.util.List;
import java.util.Map;

/**
 * 对数据库student表中的数据进行操作
 *
 * @author dhl
 * @datetime 2021/7/22  10:01
 */
public interface StudentDAO {
    /**
     * 根据id查询student的数据
     * @param id
     * @return student对象
     */
    public Student getStudentById(Integer id);

    /**
     * 通过多个参数来查找相关的数据
     * @param name 名字
     * @param age 年龄
     * @return 装有student对象的list集合
     */
    public List<Student> listMultiStudents(@Param("name") String name,
                                           @Param("age") Integer age);

    /**
     * 通过自定义的对象中的属性来查找数据库中的数据
     * @param param 自定义的对象
     * @return 装有student对象的list集合
     */
    public List<Student> listMultiObjects(QueryParam param);

    /**
     * 根据位置传递参数
     * @param name 名字
     * @param age 年龄
     * @return 装有student对象的list集合
     */
    public List<Student> listMultiPosition(String name, Integer age);

    /**
     * 根据Map集合传递参数
     * @param map map集合
     * @return 装有student对象的list集合
     */
    public List<Student> listMultiMap(Map<String, Object> map);

    /**
     * 使用$来进行字符串的拼接查询我们的信息
     * @param column 列名
     * @param name 名字
     * @param age 年龄
     * @param param 排序的参照
     * @param collation 排序规则
     * @return 装有student对象的list集合
     */
    public List<Student> listStudentsUse$(@Param("columnName") String column,
                                          @Param("name") String name,
                                          @Param("age") Integer age,
                                          @Param("param") String param,
                                          @Param("collation") String collation);
}
