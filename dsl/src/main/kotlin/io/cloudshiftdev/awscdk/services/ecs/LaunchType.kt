package io.cloudshiftdev.awscdk.services.ecs

public enum class LaunchType(
    private val cdkObject: software.amazon.awscdk.services.ecs.LaunchType,
) {
    EC2(software.amazon.awscdk.services.ecs.LaunchType.EC2),
    FARGATE(software.amazon.awscdk.services.ecs.LaunchType.FARGATE),
    EXTERNAL(software.amazon.awscdk.services.ecs.LaunchType.EXTERNAL),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LaunchType): LaunchType =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.LaunchType.EC2 -> LaunchType.EC2
                software.amazon.awscdk.services.ecs.LaunchType.FARGATE -> LaunchType.FARGATE
                software.amazon.awscdk.services.ecs.LaunchType.EXTERNAL -> LaunchType.EXTERNAL
            }

        internal fun unwrap(wrapped: LaunchType): software.amazon.awscdk.services.ecs.LaunchType =
            wrapped.cdkObject
    }
}
