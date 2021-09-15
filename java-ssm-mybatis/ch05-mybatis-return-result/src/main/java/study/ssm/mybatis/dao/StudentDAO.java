package study.ssm.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import study.ssm.mybatis.model.MyStudent;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.vo.ViewStudent;

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
     * 统计学生总数
     * @return 学生总数
     */
    int countStudents();

    /**
     * 根据id查询数据
     * @param id
     * @return viewStudent对象
     */
    public ViewStudent getStudentReturnViewStudent(@Param("sid") Integer id);

    /**
     * 根据id值查询数据库
     * @param id
     * @return map集合
     */
    Map<Object, Object> getStudentMap(@Param("sid") Integer id);

    /**
     * 通过resultMap方式查询学生数据
     * @return 装有student对象的list集合
     */
    List<Student> listStudentsResultMap();

    /**
     * 根据myStudent的属性名查询学生数据
     * @return 装有myStudent对象的list集合
     */
    List<MyStudent> listMyStudent();

    /**
     * 使用别名当做查询结果来匹配对象的属性
     * @return 装有myStudent对象的list集合
     */
    List<MyStudent> listMyStudentUseAs();

    /**
     * 在java对象中定义lika的内容进行模糊查询
     * @param likeName
     * @return 装有student对象的list集合
     */
    List<Student> listStudentsLikeJava(@Param("likeName") String likeName);

    /**
     * 在mapper文件中使用拼接的方式进行模糊查询
     * @param name
     * @return 装有student对象的list集合
     */
    List<Student> listStudentsLikeJoin(@Param("name") String name);
}
