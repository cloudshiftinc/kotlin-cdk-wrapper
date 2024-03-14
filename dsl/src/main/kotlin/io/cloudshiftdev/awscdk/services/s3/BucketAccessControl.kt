package io.cloudshiftdev.awscdk.services.s3

public enum class BucketAccessControl(
    private val cdkObject: software.amazon.awscdk.services.s3.BucketAccessControl,
) {
    PRIVATE(software.amazon.awscdk.services.s3.BucketAccessControl.PRIVATE),
    PUBLIC_READ(software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ),
    PUBLIC_READ_WRITE(software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ_WRITE),
    AUTHENTICATED_READ(software.amazon.awscdk.services.s3.BucketAccessControl.AUTHENTICATED_READ),
    LOG_DELIVERY_WRITE(software.amazon.awscdk.services.s3.BucketAccessControl.LOG_DELIVERY_WRITE),
    BUCKET_OWNER_READ(software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_READ),
    BUCKET_OWNER_FULL_CONTROL(
        software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_FULL_CONTROL
    ),
    AWS_EXEC_READ(software.amazon.awscdk.services.s3.BucketAccessControl.AWS_EXEC_READ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.BucketAccessControl
        ): BucketAccessControl =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.BucketAccessControl.PRIVATE ->
                    BucketAccessControl.PRIVATE
                software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ ->
                    BucketAccessControl.PUBLIC_READ
                software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ_WRITE ->
                    BucketAccessControl.PUBLIC_READ_WRITE
                software.amazon.awscdk.services.s3.BucketAccessControl.AUTHENTICATED_READ ->
                    BucketAccessControl.AUTHENTICATED_READ
                software.amazon.awscdk.services.s3.BucketAccessControl.LOG_DELIVERY_WRITE ->
                    BucketAccessControl.LOG_DELIVERY_WRITE
                software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_READ ->
                    BucketAccessControl.BUCKET_OWNER_READ
                software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_FULL_CONTROL ->
                    BucketAccessControl.BUCKET_OWNER_FULL_CONTROL
                software.amazon.awscdk.services.s3.BucketAccessControl.AWS_EXEC_READ ->
                    BucketAccessControl.AWS_EXEC_READ
            }

        internal fun unwrap(
            wrapped: BucketAccessControl
        ): software.amazon.awscdk.services.s3.BucketAccessControl = wrapped.cdkObject
    }
}
