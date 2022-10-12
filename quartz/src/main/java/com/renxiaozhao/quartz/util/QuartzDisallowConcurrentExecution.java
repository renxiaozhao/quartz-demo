package com.renxiaozhao.quartz.util;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

import com.renxiaozhao.quartz.domain.QuartzSysJob;

/**
 * 定时任务处理（禁止并发执行）.
 * 
 *
 */
@DisallowConcurrentExecution
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, QuartzSysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
