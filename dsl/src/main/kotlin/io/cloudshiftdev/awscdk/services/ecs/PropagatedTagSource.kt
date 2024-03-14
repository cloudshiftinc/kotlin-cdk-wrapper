package io.cloudshiftdev.awscdk.services.ecs

public enum class PropagatedTagSource(
    private val cdkObject: software.amazon.awscdk.services.ecs.PropagatedTagSource,
) {
    SERVICE(software.amazon.awscdk.services.ecs.PropagatedTagSource.SERVICE),
    TASK_DEFINITION(software.amazon.awscdk.services.ecs.PropagatedTagSource.TASK_DEFINITION),
    NONE(software.amazon.awscdk.services.ecs.PropagatedTagSource.NONE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.PropagatedTagSource
        ): PropagatedTagSource =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.PropagatedTagSource.SERVICE ->
                    PropagatedTagSource.SERVICE
                software.amazon.awscdk.services.ecs.PropagatedTagSource.TASK_DEFINITION ->
                    PropagatedTagSource.TASK_DEFINITION
                software.amazon.awscdk.services.ecs.PropagatedTagSource.NONE ->
                    PropagatedTagSource.NONE
            }

        internal fun unwrap(
            wrapped: PropagatedTagSource
        ): software.amazon.awscdk.services.ecs.PropagatedTagSource = wrapped.cdkObject
    }
}
