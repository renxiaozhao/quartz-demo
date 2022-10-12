package com.renxiaozhao.quartz.util;

import org.quartz.JobExecutionContext;

import com.renxiaozhao.quartz.domain.QuartzSysJob;

/**
 * 定时任务处理（允许并发执行）.
 * 
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, QuartzSysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
