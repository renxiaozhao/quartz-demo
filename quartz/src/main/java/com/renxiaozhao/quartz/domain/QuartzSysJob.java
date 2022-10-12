package com.renxiaozhao.quartz.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.renxiaozhao.quartz.constant.ScheduleConstants;
import com.renxiaozhao.quartz.util.CronUtils;
import com.renxiaozhao.quartz.util.StringUtils;

/**
 * 定时任务调度表 sys_job.
 * 
 */
public class QuartzSysJob implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 任务ID. */
    private Long jobId;

    /** 任务名称. */
    private String jobName;

    /** 任务组名. */
    private String jobGroup;

    /** 调用目标字符串. */
    private String invokeTarget;

    /** cron执行表达式. */
    private String cronExpression;

    /** cron计划策略 0=默认,1=立即触发执行,2=触发一次执行,3=不触发立即执行. */
    private String misfirePolicy = ScheduleConstants.MISFIRE_DEFAULT;

    /** 是否并发执行（0允许 1禁止）. */
    private String concurrent;

    /** 任务状态（0正常 1暂停）. */
    private String status;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getInvokeTarget() {
        return invokeTarget;
    }

    public void setInvokeTarget(String invokeTarget) {
        this.invokeTarget = invokeTarget;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Date getNextValidTime() {
        if (StringUtils.isNotEmpty(cronExpression)) {
            return CronUtils.getNextExecution(cronExpression);
        }
        return null;
    }

    public String getMisfirePolicy() {
        return misfirePolicy;
    }

    public void setMisfirePolicy(String misfirePolicy) {
        this.misfirePolicy = misfirePolicy;
    }

    public String getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(String concurrent) {
        this.concurrent = concurrent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("jobId", getJobId()).append("jobName", getJobName()).append("jobGroup", getJobGroup())
                .append("cronExpression", getCronExpression()).append("nextValidTime", getNextValidTime()).append("misfirePolicy", getMisfirePolicy()).append("concurrent", getConcurrent())
                .append("status", getStatus()).toString();
    }
}
