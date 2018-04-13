package com.chris.jobtracker.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Execution {
    public enum ExecutionStatus {
        RUNNING,
        FAILED,
        COMPLETE,
        QUEUED
    }
    @ManyToOne
    @JoinColumn
    private UserScript userScript;
    private ExecutionStatus status;
    @Id
    @GeneratedValue
    private Long id;

    public Execution(UserScript userScript, ExecutionStatus status) {
        this.userScript = userScript;
        this.status = status;
    }
}
