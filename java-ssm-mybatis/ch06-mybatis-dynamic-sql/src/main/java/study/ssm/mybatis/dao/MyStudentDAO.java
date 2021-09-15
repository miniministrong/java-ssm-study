package study.ssm.mybatis.dao;

import study.ssm.mybatis.model.MyStudent;

import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/23  16:01
 */
public interface MyStudentDAO {
    /**
     * 查询myStudent对象中的所有数据
     * @return 装有myStudent对象的list集合
     */
    List<MyStudent> listStudents();
}
