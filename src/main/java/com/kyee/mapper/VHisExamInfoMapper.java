package com.kyee.mapper;

import com.kyee.model.VHisExamInfo;
import java.util.List;

public interface VHisExamInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_EXAM_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String examNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_EXAM_INFO
     *
     * @mbggenerated
     */
    int insert(VHisExamInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_EXAM_INFO
     *
     * @mbggenerated
     */
    VHisExamInfo selectByPrimaryKey(String examNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_EXAM_INFO
     *
     * @mbggenerated
     */
    List<VHisExamInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_EXAM_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VHisExamInfo record);
}