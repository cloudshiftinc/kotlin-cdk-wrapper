package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class S3DataDistributionType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType,
) {
    FULLY_REPLICATED(
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType.FULLY_REPLICATED
    ),
    SHARDED_BY_S3_KEY(
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType.SHARDED_BY_S3_KEY
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType
        ): S3DataDistributionType =
            when (cdkObject) {
                software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType
                    .FULLY_REPLICATED -> S3DataDistributionType.FULLY_REPLICATED
                software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType
                    .SHARDED_BY_S3_KEY -> S3DataDistributionType.SHARDED_BY_S3_KEY
            }

        internal fun unwrap(
            wrapped: S3DataDistributionType
        ): software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType =
            wrapped.cdkObject
    }
}
