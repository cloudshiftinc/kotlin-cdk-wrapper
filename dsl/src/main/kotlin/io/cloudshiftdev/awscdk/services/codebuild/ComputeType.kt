package io.cloudshiftdev.awscdk.services.codebuild

public enum class ComputeType(
    private val cdkObject: software.amazon.awscdk.services.codebuild.ComputeType,
) {
    SMALL(software.amazon.awscdk.services.codebuild.ComputeType.SMALL),
    MEDIUM(software.amazon.awscdk.services.codebuild.ComputeType.MEDIUM),
    LARGE(software.amazon.awscdk.services.codebuild.ComputeType.LARGE),
    X_LARGE(software.amazon.awscdk.services.codebuild.ComputeType.X_LARGE),
    X2_LARGE(software.amazon.awscdk.services.codebuild.ComputeType.X2_LARGE),
    LAMBDA_1GB(software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_1GB),
    LAMBDA_2GB(software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_2GB),
    LAMBDA_4GB(software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_4GB),
    LAMBDA_8GB(software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_8GB),
    LAMBDA_10GB(software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_10GB),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codebuild.ComputeType
        ): ComputeType =
            when (cdkObject) {
                software.amazon.awscdk.services.codebuild.ComputeType.SMALL -> ComputeType.SMALL
                software.amazon.awscdk.services.codebuild.ComputeType.MEDIUM -> ComputeType.MEDIUM
                software.amazon.awscdk.services.codebuild.ComputeType.LARGE -> ComputeType.LARGE
                software.amazon.awscdk.services.codebuild.ComputeType.X_LARGE -> ComputeType.X_LARGE
                software.amazon.awscdk.services.codebuild.ComputeType.X2_LARGE ->
                    ComputeType.X2_LARGE
                software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_1GB ->
                    ComputeType.LAMBDA_1GB
                software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_2GB ->
                    ComputeType.LAMBDA_2GB
                software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_4GB ->
                    ComputeType.LAMBDA_4GB
                software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_8GB ->
                    ComputeType.LAMBDA_8GB
                software.amazon.awscdk.services.codebuild.ComputeType.LAMBDA_10GB ->
                    ComputeType.LAMBDA_10GB
            }

        internal fun unwrap(
            wrapped: ComputeType
        ): software.amazon.awscdk.services.codebuild.ComputeType = wrapped.cdkObject
    }
}
