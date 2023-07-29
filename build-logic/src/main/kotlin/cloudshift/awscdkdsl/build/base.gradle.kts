package cloudshift.awscdkdsl.build

plugins { base }

val precommit by
    tasks.registering {
        group = "verification"
        dependsOn(tasks.named("check"))
    }
