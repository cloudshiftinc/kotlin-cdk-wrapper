package io.cloudshiftdev.awscdk.services.appconfig

public enum class ConfigurationType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationType,
) {
    FREEFORM(software.amazon.awscdk.services.appconfig.ConfigurationType.FREEFORM),
    FEATURE_FLAGS(software.amazon.awscdk.services.appconfig.ConfigurationType.FEATURE_FLAGS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationType
        ): ConfigurationType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.ConfigurationType.FREEFORM ->
                    ConfigurationType.FREEFORM
                software.amazon.awscdk.services.appconfig.ConfigurationType.FEATURE_FLAGS ->
                    ConfigurationType.FEATURE_FLAGS
            }

        internal fun unwrap(
            wrapped: ConfigurationType
        ): software.amazon.awscdk.services.appconfig.ConfigurationType = wrapped.cdkObject
    }
}
