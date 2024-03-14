package io.cloudshiftdev.awscdk.services.ses

public enum class EasyDkimSigningKeyLength(
    private val cdkObject: software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength,
) {
    RSA_1024_BIT(software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength.RSA_1024_BIT),
    RSA_2048_BIT(software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength.RSA_2048_BIT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength
        ): EasyDkimSigningKeyLength =
            when (cdkObject) {
                software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength.RSA_1024_BIT ->
                    EasyDkimSigningKeyLength.RSA_1024_BIT
                software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength.RSA_2048_BIT ->
                    EasyDkimSigningKeyLength.RSA_2048_BIT
            }

        internal fun unwrap(
            wrapped: EasyDkimSigningKeyLength
        ): software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength = wrapped.cdkObject
    }
}
