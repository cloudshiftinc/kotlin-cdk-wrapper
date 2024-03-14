package io.cloudshiftdev.awscdk.services.cloudtrail

public enum class DataResourceType(
    private val cdkObject: software.amazon.awscdk.services.cloudtrail.DataResourceType,
) {
    LAMBDA_FUNCTION(software.amazon.awscdk.services.cloudtrail.DataResourceType.LAMBDA_FUNCTION),
    S3_OBJECT(software.amazon.awscdk.services.cloudtrail.DataResourceType.S3_OBJECT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudtrail.DataResourceType
        ): DataResourceType =
            when (cdkObject) {
                software.amazon.awscdk.services.cloudtrail.DataResourceType.LAMBDA_FUNCTION ->
                    DataResourceType.LAMBDA_FUNCTION
                software.amazon.awscdk.services.cloudtrail.DataResourceType.S3_OBJECT ->
                    DataResourceType.S3_OBJECT
            }

        internal fun unwrap(
            wrapped: DataResourceType
        ): software.amazon.awscdk.services.cloudtrail.DataResourceType = wrapped.cdkObject
    }
}
