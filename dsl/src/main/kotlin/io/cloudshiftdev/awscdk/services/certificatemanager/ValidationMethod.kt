package io.cloudshiftdev.awscdk.services.certificatemanager

public enum class ValidationMethod(
    private val cdkObject: software.amazon.awscdk.services.certificatemanager.ValidationMethod,
) {
    EMAIL(software.amazon.awscdk.services.certificatemanager.ValidationMethod.EMAIL),
    DNS(software.amazon.awscdk.services.certificatemanager.ValidationMethod.DNS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.certificatemanager.ValidationMethod
        ): ValidationMethod =
            when (cdkObject) {
                software.amazon.awscdk.services.certificatemanager.ValidationMethod.EMAIL ->
                    ValidationMethod.EMAIL
                software.amazon.awscdk.services.certificatemanager.ValidationMethod.DNS ->
                    ValidationMethod.DNS
            }

        internal fun unwrap(
            wrapped: ValidationMethod
        ): software.amazon.awscdk.services.certificatemanager.ValidationMethod = wrapped.cdkObject
    }
}
