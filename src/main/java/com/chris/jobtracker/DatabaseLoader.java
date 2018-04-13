package com.chris.jobtracker;

import com.chris.jobtracker.model.Execution;
import com.chris.jobtracker.model.UserScript;
import com.chris.jobtracker.repository.UserScriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private UserScriptRepository repo;
    @Override
    public void run(String... args) throws Exception {
        UserScript script = new UserScript("Bob", "TheBestScriptEver","See Title", UserScript.ScriptType.GROOVY,new ArrayList<Execution>());
        List<Execution> executions = new ArrayList<>();
        executions.add(new Execution(script, Execution.ExecutionStatus.QUEUED));
        script.setExecutions(executions);
        repo.saveAndFlush(script);



    }
}
