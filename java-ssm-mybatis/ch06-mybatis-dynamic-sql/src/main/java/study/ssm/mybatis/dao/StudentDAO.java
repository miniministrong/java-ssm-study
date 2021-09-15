package study.ssm.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import study.ssm.mybatis.model.Student;

import java.util.List;

/**
 * 对数据库student表中的数据进行操作
 *
 * @author dhl
 * @datetime 2021/7/22  10:01
 */
public interface StudentDAO {
    /**
     * 使用if条件判断查询
     * @param student
     * @return 装有符合条件的student对象的list集合
     */
    List<Student> listStudentsUseIf(Student student);

    /**
     * 使用where条件去包裹if进行判断查询
     * @param student
     * @return 装有符合条件的student对象的list集合
     */
    List<Student> listStudentsUseWhere(Student student);

    /**
     * 遍历简单类型的list
     * @param list
     * @return 装有student对象的list集合
     */
    List<Student> listStudentsForSim(List<Integer> list);

    /**
     * 遍历student对象中的数据
     * @param list
     * @return 装有student对象的list集合
     */
    List<Student> listStudentForStudent(List<Student> list);

    /**
     * 使用PageHelper组件来完成我们的数据库的分页
     * @return 装有student对象的List集合
     */
    List<Student> listStudentsUsePageHelper();
}
