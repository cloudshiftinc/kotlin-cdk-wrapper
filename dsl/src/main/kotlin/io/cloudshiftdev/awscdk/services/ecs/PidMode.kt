package io.cloudshiftdev.awscdk.services.ecs

public enum class PidMode(
    private val cdkObject: software.amazon.awscdk.services.ecs.PidMode,
) {
    HOST(software.amazon.awscdk.services.ecs.PidMode.HOST),
    TASK(software.amazon.awscdk.services.ecs.PidMode.TASK),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PidMode): PidMode =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.PidMode.HOST -> PidMode.HOST
                software.amazon.awscdk.services.ecs.PidMode.TASK -> PidMode.TASK
            }

        internal fun unwrap(wrapped: PidMode): software.amazon.awscdk.services.ecs.PidMode =
            wrapped.cdkObject
    }
}
