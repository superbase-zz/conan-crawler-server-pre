package com.conan.crawler.server.pre.mapper;

import java.util.List;

import com.conan.crawler.server.pre.entity.AnalysisV;

public interface AnalysisVMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_v
     *
     * @mbg.generated Mon Apr 16 00:50:24 CST 2018
     */
    int insert(AnalysisV record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_v
     *
     * @mbg.generated Mon Apr 16 00:50:24 CST 2018
     */
    int insertSelective(AnalysisV record);
    
    List<AnalysisV> selectAll();
}