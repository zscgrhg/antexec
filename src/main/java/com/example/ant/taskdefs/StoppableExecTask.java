package com.example.ant.taskdefs;

import org.apache.tools.ant.taskdefs.ExecTask;

/**
 * Created by THINK on 2016/12/11.
 */
public class StoppableExecTask extends ExecTask {
    public StoppableExecTask() {
        super();
        setTimeout(10000);
    }
}
