package com.elpassion.intelijidea

import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskId
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationListener
import org.jetbrains.plugins.gradle.service.task.GradleTaskManagerExtension
import org.jetbrains.plugins.gradle.settings.GradleExecutionSettings

class MFGradleTaskManager : GradleTaskManagerExtension {
    override fun executeTasks(p0: ExternalSystemTaskId, p1: MutableList<String>, p2: String, p3: GradleExecutionSettings?, p4: MutableList<String>, p5: MutableList<String>, p6: String?, p7: ExternalSystemTaskNotificationListener): Boolean {
        //TODO: execute mainframer task
        return true
    }

    override fun cancelTask(p0: ExternalSystemTaskId, p1: ExternalSystemTaskNotificationListener): Boolean {
        return false
    }
}