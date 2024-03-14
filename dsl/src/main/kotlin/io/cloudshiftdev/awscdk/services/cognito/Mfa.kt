package io.cloudshiftdev.awscdk.services.cognito

public enum class Mfa(
    private val cdkObject: software.amazon.awscdk.services.cognito.Mfa,
) {
    OFF(software.amazon.awscdk.services.cognito.Mfa.OFF),
    OPTIONAL(software.amazon.awscdk.services.cognito.Mfa.OPTIONAL),
    REQUIRED(software.amazon.awscdk.services.cognito.Mfa.REQUIRED),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.Mfa): Mfa =
            when (cdkObject) {
                software.amazon.awscdk.services.cognito.Mfa.OFF -> Mfa.OFF
                software.amazon.awscdk.services.cognito.Mfa.OPTIONAL -> Mfa.OPTIONAL
                software.amazon.awscdk.services.cognito.Mfa.REQUIRED -> Mfa.REQUIRED
            }

        internal fun unwrap(wrapped: Mfa): software.amazon.awscdk.services.cognito.Mfa =
            wrapped.cdkObject
    }
}
