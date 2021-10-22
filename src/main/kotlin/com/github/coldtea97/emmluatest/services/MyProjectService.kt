package com.github.coldtea97.emmluatest.services

import com.intellij.openapi.project.Project
import com.github.coldtea97.emmluatest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
