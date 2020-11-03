package com.github.antoni-rokitnicki.sampleplugin.services

import com.intellij.openapi.project.Project
import com.github.antoni-rokitnicki.sampleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
