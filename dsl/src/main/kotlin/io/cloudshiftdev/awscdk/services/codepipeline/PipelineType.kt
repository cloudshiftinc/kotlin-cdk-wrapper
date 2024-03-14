package io.cloudshiftdev.awscdk.services.codepipeline

public enum class PipelineType(
    private val cdkObject: software.amazon.awscdk.services.codepipeline.PipelineType,
) {
    V1(software.amazon.awscdk.services.codepipeline.PipelineType.V1),
    V2(software.amazon.awscdk.services.codepipeline.PipelineType.V2),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.PipelineType
        ): PipelineType =
            when (cdkObject) {
                software.amazon.awscdk.services.codepipeline.PipelineType.V1 -> PipelineType.V1
                software.amazon.awscdk.services.codepipeline.PipelineType.V2 -> PipelineType.V2
            }

        internal fun unwrap(
            wrapped: PipelineType
        ): software.amazon.awscdk.services.codepipeline.PipelineType = wrapped.cdkObject
    }
}
