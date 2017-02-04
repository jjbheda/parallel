package com.gordon.rawe

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.gordon.rawe.utils.TimeListener
public class ParallelConfigurePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.gradle.addListener(new TimeListener())
        ParallelSharedOptions options = project.extensions.create(ParallelSharedOptions.optionsName, ParallelSharedOptions.class)
        project.afterEvaluate {
            options.initOptions(project)
        }
    }
}