package cn.study.lottery.rpc;

import cn.study.lottery.rpc.req.ActivityReq;
import cn.study.lottery.rpc.res.ActivityRes;

public interface IActivityBooth {

    //TODO 创建活动

    //TODO 更新活动

    //查询活动
    ActivityRes queryActivityById(ActivityReq req);
}
