package cloudshift.awscdkdsl.build

import cloudshift.awscdkdsl.build.task.CopyTemplates

plugins {
}


val templatePropertyMap = mapOf("version" to "$version")

val copyTemplates by tasks.registering(CopyTemplates::class) {
    expand(templatePropertyMap)
    from("gradle/templates")
    into(layout.projectDirectory)
}


