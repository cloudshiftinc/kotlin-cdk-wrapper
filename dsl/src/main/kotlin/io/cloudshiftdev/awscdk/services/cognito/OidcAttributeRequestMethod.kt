package io.cloudshiftdev.awscdk.services.cognito

public enum class OidcAttributeRequestMethod(
    private val cdkObject: software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod,
) {
    GET(software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod.GET),
    POST(software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod.POST),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod
        ): OidcAttributeRequestMethod =
            when (cdkObject) {
                software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod.GET ->
                    OidcAttributeRequestMethod.GET
                software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod.POST ->
                    OidcAttributeRequestMethod.POST
            }

        internal fun unwrap(
            wrapped: OidcAttributeRequestMethod
        ): software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod = wrapped.cdkObject
    }
}
