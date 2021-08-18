package com.github.zlgorithmy.aswz.services

import com.github.zlgorithmy.aswz.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
