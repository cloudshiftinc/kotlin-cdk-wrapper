package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class ProcessorMode(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorMode,
) {
    INLINE(software.amazon.awscdk.services.stepfunctions.ProcessorMode.INLINE),
    DISTRIBUTED(software.amazon.awscdk.services.stepfunctions.ProcessorMode.DISTRIBUTED),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorMode
        ): ProcessorMode =
            when (cdkObject) {
                software.amazon.awscdk.services.stepfunctions.ProcessorMode.INLINE ->
                    ProcessorMode.INLINE
                software.amazon.awscdk.services.stepfunctions.ProcessorMode.DISTRIBUTED ->
                    ProcessorMode.DISTRIBUTED
            }

        internal fun unwrap(
            wrapped: ProcessorMode
        ): software.amazon.awscdk.services.stepfunctions.ProcessorMode = wrapped.cdkObject
    }
}
