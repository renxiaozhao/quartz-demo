package com.renxiaozhao.quartz.service;

import com.renxiaozhao.quartz.domain.QuartzSysJob;
import com.renxiaozhao.quartz.domain.QuartzSysJobLog;

/**
 * 定时任务调度日志信息信息 服务层.
 * 
 */
public interface IQuartzSysJobService {
    /**
     * 任务执行完成后，回调任务日志.
     * 
     * @param jobLog 调度日志信息
     */
    public void addJobLog(QuartzSysJobLog jobLog);

    /**
     * 执行作业.
     * @param sysJob
     */
    public void invokeMethod(QuartzSysJob sysJob);
}
