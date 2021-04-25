package com.github.sunquanjava.plugintemplete.services

import com.github.sunquanjava.plugintemplete.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
