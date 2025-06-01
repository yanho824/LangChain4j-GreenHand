package com.syh.javaailangchain4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.syh.javaailangchain4j.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {

    // 这里可以添加自定义查询方法
    // 例如：List<Appointment> findAppointmentsByUserId(Long userId);
}
