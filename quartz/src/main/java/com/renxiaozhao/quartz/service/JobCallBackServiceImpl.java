package com.renxiaozhao.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.renxiaozhao.quartz.domain.QuartzSysJob;
import com.renxiaozhao.quartz.domain.QuartzSysJobLog;

/**
 * 定时任务调度日志信息 服务层.
 * 
 */
@Service
public class JobCallBackServiceImpl implements IQuartzSysJobService {
    private static final Logger log = LoggerFactory.getLogger(JobCallBackServiceImpl.class);
    
    /**.
     * 更新作业执行结果
     */
    @Override
    public void addJobLog(QuartzSysJobLog jobLog) {
        //TODO 根据jobLog获取作业开始结束时间、执行时间 
    }

    @Override
    public void invokeMethod(QuartzSysJob sysJob) {
        //TODO 作业处理逻辑
    }
    
}
