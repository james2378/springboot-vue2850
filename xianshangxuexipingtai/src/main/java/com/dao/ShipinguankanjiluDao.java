package com.dao;

import com.entity.ShipinguankanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinguankanjiluView;

/**
 * 视频观看记录 Dao 接口
 *
 * @author 
 */
public interface ShipinguankanjiluDao extends BaseMapper<ShipinguankanjiluEntity> {

   List<ShipinguankanjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
