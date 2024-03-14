package io.cloudshiftdev.awscdk.services.ecs

public enum class ExecuteCommandLogging(
    private val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogging,
) {
    NONE(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.NONE),
    DEFAULT(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.DEFAULT),
    OVERRIDE(software.amazon.awscdk.services.ecs.ExecuteCommandLogging.OVERRIDE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogging
        ): ExecuteCommandLogging =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.ExecuteCommandLogging.NONE ->
                    ExecuteCommandLogging.NONE
                software.amazon.awscdk.services.ecs.ExecuteCommandLogging.DEFAULT ->
                    ExecuteCommandLogging.DEFAULT
                software.amazon.awscdk.services.ecs.ExecuteCommandLogging.OVERRIDE ->
                    ExecuteCommandLogging.OVERRIDE
            }

        internal fun unwrap(
            wrapped: ExecuteCommandLogging
        ): software.amazon.awscdk.services.ecs.ExecuteCommandLogging = wrapped.cdkObject
    }
}
