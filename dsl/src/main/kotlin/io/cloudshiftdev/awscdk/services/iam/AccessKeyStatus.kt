package io.cloudshiftdev.awscdk.services.iam

public enum class AccessKeyStatus(
    private val cdkObject: software.amazon.awscdk.services.iam.AccessKeyStatus,
) {
    ACTIVE(software.amazon.awscdk.services.iam.AccessKeyStatus.ACTIVE),
    INACTIVE(software.amazon.awscdk.services.iam.AccessKeyStatus.INACTIVE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iam.AccessKeyStatus
        ): AccessKeyStatus =
            when (cdkObject) {
                software.amazon.awscdk.services.iam.AccessKeyStatus.ACTIVE -> AccessKeyStatus.ACTIVE
                software.amazon.awscdk.services.iam.AccessKeyStatus.INACTIVE ->
                    AccessKeyStatus.INACTIVE
            }

        internal fun unwrap(
            wrapped: AccessKeyStatus
        ): software.amazon.awscdk.services.iam.AccessKeyStatus = wrapped.cdkObject
    }
}
