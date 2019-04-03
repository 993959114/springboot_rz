package com.qf.mapper;

import com.qf.entity.ScheduleJob;
import com.qf.entity.ScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int countByExample(ScheduleJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int deleteByExample(ScheduleJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int deleteByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int insert(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int insertSelective(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    ScheduleJob selectByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int updateByPrimaryKeySelective(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbggenerated Mon Mar 25 17:19:22 CST 2019
     */
    int updateByPrimaryKey(ScheduleJob record);
}