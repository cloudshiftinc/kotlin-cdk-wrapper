package io.cloudshiftdev.awscdk.services.codepipeline

public enum class ExecutionMode(
    private val cdkObject: software.amazon.awscdk.services.codepipeline.ExecutionMode,
) {
    QUEUED(software.amazon.awscdk.services.codepipeline.ExecutionMode.QUEUED),
    SUPERSEDED(software.amazon.awscdk.services.codepipeline.ExecutionMode.SUPERSEDED),
    PARALLEL(software.amazon.awscdk.services.codepipeline.ExecutionMode.PARALLEL),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.ExecutionMode
        ): ExecutionMode =
            when (cdkObject) {
                software.amazon.awscdk.services.codepipeline.ExecutionMode.QUEUED ->
                    ExecutionMode.QUEUED
                software.amazon.awscdk.services.codepipeline.ExecutionMode.SUPERSEDED ->
                    ExecutionMode.SUPERSEDED
                software.amazon.awscdk.services.codepipeline.ExecutionMode.PARALLEL ->
                    ExecutionMode.PARALLEL
            }

        internal fun unwrap(
            wrapped: ExecutionMode
        ): software.amazon.awscdk.services.codepipeline.ExecutionMode = wrapped.cdkObject
    }
}
