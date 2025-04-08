package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinguankanjiluEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 视频观看记录 服务类
 */
public interface ShipinguankanjiluService extends IService<ShipinguankanjiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}