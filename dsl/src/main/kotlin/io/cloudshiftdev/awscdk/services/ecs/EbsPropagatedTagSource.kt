package io.cloudshiftdev.awscdk.services.ecs

public enum class EbsPropagatedTagSource(
    private val cdkObject: software.amazon.awscdk.services.ecs.EbsPropagatedTagSource,
) {
    SERVICE(software.amazon.awscdk.services.ecs.EbsPropagatedTagSource.SERVICE),
    TASK_DEFINITION(software.amazon.awscdk.services.ecs.EbsPropagatedTagSource.TASK_DEFINITION),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.EbsPropagatedTagSource
        ): EbsPropagatedTagSource =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.EbsPropagatedTagSource.SERVICE ->
                    EbsPropagatedTagSource.SERVICE
                software.amazon.awscdk.services.ecs.EbsPropagatedTagSource.TASK_DEFINITION ->
                    EbsPropagatedTagSource.TASK_DEFINITION
            }

        internal fun unwrap(
            wrapped: EbsPropagatedTagSource
        ): software.amazon.awscdk.services.ecs.EbsPropagatedTagSource = wrapped.cdkObject
    }
}
