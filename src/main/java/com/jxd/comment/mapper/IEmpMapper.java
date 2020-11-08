package com.jxd.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.comment.model.EmpJxd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IEmpMapper extends BaseMapper<EmpJxd> {


    /**
     * 查询经理所在部门信息
     * @param empno
     * @return
     */
    int selectManagerDeptno(int empno);

    /**
     * 查找部门全部员工
     * @param deptno
     * @return
     */
    List<Map<String,Object>> selectEmpByDeptno(int deptno);

    /**
     * 根据姓名筛选部门员工
     * @param deptno
     * @param ename
     * @return
     */
    List<Map<String,Object>> selectEmpByDeptnoAndEname(@Param("deptno") int deptno,@Param("ename") String ename);

    /**
     * 根据工号获取员工信息
     * @param empno
     * @return
     */
    Map<String,Object> getMessage(@Param("empno") int empno);

    /**
     * 根据班期选择成员
     * @param class_num
     * @return
     */
    List<Map<String,Object>> selectStudentByCno(@Param("class_num") int class_num);

    List<Map<String,Object>> getStudentByName(@Param("pageStart") int pageStart,
                                              @Param("pageSize")int pageSize,
                                              @Param("ename")String ename,
                                              @Param("class_num") int class_num);

    /**
     * 获取一个班级的老师
     * @param class_num
     * @return
     */
    EmpJxd getTeacher(int class_num);

   /* //根据班级号查询这个班的学生
    List<Map<String,Object>> getClassMemberByCNo(@Param("cNo")int cNo);*/

   //查询待添加的学生
    List<Map<String,Object>> getStudentsToAddListForSelect();

    boolean deleteStudentFromOneClass(@Param("empno") int empno);

    List<Map<String,Object>> selectStudentList();
    List<Map<String,Object>> selectStudentListByClassNumAndEname(@Param("formMap") Map<String,Object> formMap);
    List<Map<String,Object>> selectTeacherList();
    List<Map<String,Object>> selectEmpJxdList();
    List<Map<String,Object>> getOnesScoreByEmpno(@Param("empno")int empno);
    List<Map<String,Object>> getOnesSumCommentByEmpno(@Param("empno")int empno);
}
