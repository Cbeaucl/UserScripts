package com.chris.jobtracker.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserScript {
    public enum ScriptType {
        PYTHON,
        JAVA,
        GROOVY,
        PERL
    }
    @Id
    @GeneratedValue
    private Long scriptID;
    private String user;
    private String name;
    private String description;
    private ScriptType type;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    List<Execution> executions;
    public UserScript() {
    }

    public UserScript(String user, String name, String description, ScriptType type, List<Execution> executions) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.type = type;
        this.executions = executions;
    }
}
