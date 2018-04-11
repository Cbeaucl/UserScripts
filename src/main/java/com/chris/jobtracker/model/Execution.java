package com.chris.jobtracker.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Execution {
    enum ExectuionStatus {
        RUNNING,
        FAILED,
        COMPLETE,
        QUEUED
    }
    @ManyToOne
    @JoinColumn
    private UserScript userScript;
    private ExectuionStatus status;
    @Id
    @GeneratedValue
    private Long id;


}
