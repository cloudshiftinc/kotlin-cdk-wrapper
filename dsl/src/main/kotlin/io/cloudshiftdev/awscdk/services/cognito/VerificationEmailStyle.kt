package io.cloudshiftdev.awscdk.services.cognito

public enum class VerificationEmailStyle(
    private val cdkObject: software.amazon.awscdk.services.cognito.VerificationEmailStyle,
) {
    CODE(software.amazon.awscdk.services.cognito.VerificationEmailStyle.CODE),
    LINK(software.amazon.awscdk.services.cognito.VerificationEmailStyle.LINK),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.VerificationEmailStyle
        ): VerificationEmailStyle =
            when (cdkObject) {
                software.amazon.awscdk.services.cognito.VerificationEmailStyle.CODE ->
                    VerificationEmailStyle.CODE
                software.amazon.awscdk.services.cognito.VerificationEmailStyle.LINK ->
                    VerificationEmailStyle.LINK
            }

        internal fun unwrap(
            wrapped: VerificationEmailStyle
        ): software.amazon.awscdk.services.cognito.VerificationEmailStyle = wrapped.cdkObject
    }
}
