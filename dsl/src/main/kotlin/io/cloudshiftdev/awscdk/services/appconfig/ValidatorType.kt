package io.cloudshiftdev.awscdk.services.appconfig

public enum class ValidatorType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.ValidatorType,
) {
    JSON_SCHEMA(software.amazon.awscdk.services.appconfig.ValidatorType.JSON_SCHEMA),
    LAMBDA(software.amazon.awscdk.services.appconfig.ValidatorType.LAMBDA),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.ValidatorType
        ): ValidatorType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.ValidatorType.JSON_SCHEMA ->
                    ValidatorType.JSON_SCHEMA
                software.amazon.awscdk.services.appconfig.ValidatorType.LAMBDA ->
                    ValidatorType.LAMBDA
            }

        internal fun unwrap(
            wrapped: ValidatorType
        ): software.amazon.awscdk.services.appconfig.ValidatorType = wrapped.cdkObject
    }
}
