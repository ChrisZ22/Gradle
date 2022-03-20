package com.github.chrisz22.gradle.services

import com.intellij.openapi.project.Project
import com.github.chrisz22.gradle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
