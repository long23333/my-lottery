package cn.study.lottery.rpc.res;

import cn.study.lottery.common.Result;
import cn.study.lottery.rpc.dto.ActivityDto;

public class ActivityRes {
    private Result result;
    private ActivityDto activity;

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
