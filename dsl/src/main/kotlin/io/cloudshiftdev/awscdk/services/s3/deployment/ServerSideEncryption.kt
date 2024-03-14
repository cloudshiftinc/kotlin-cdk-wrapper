package io.cloudshiftdev.awscdk.services.s3.deployment

public enum class ServerSideEncryption(
    private val cdkObject: software.amazon.awscdk.services.s3.deployment.ServerSideEncryption,
) {
    AES_256(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AES_256),
    AWS_KMS(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
        ): ServerSideEncryption =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AES_256 ->
                    ServerSideEncryption.AES_256
                software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS ->
                    ServerSideEncryption.AWS_KMS
            }

        internal fun unwrap(
            wrapped: ServerSideEncryption
        ): software.amazon.awscdk.services.s3.deployment.ServerSideEncryption = wrapped.cdkObject
    }
}
