package com.mycompany.testrestful;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Run {

    private BigDecimal runId;
    private String jobName;
    private Date startTime;

    public Run() {
    }

    public void setRunId(BigDecimal runId) {
        this.runId = runId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Run(BigDecimal runId, String jobName, Date startTime) {
        this.runId = runId;
        this.jobName = jobName;
        this.startTime = startTime;
    }

    public BigDecimal getRunId() {
        return runId;
    }

    public String getJobName() {
        return jobName;
    }

    public Date getStartTime() {
        return startTime;
    }
}
