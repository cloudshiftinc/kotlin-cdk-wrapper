package io.cloudshiftdev.awscdk.services.appconfig

public enum class ConfigurationSourceType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSourceType,
) {
    S3(software.amazon.awscdk.services.appconfig.ConfigurationSourceType.S3),
    SECRETS_MANAGER(
        software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SECRETS_MANAGER
    ),
    SSM_PARAMETER(software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SSM_PARAMETER),
    SSM_DOCUMENT(software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SSM_DOCUMENT),
    CODE_PIPELINE(software.amazon.awscdk.services.appconfig.ConfigurationSourceType.CODE_PIPELINE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSourceType
        ): ConfigurationSourceType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.ConfigurationSourceType.S3 ->
                    ConfigurationSourceType.S3
                software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SECRETS_MANAGER ->
                    ConfigurationSourceType.SECRETS_MANAGER
                software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SSM_PARAMETER ->
                    ConfigurationSourceType.SSM_PARAMETER
                software.amazon.awscdk.services.appconfig.ConfigurationSourceType.SSM_DOCUMENT ->
                    ConfigurationSourceType.SSM_DOCUMENT
                software.amazon.awscdk.services.appconfig.ConfigurationSourceType.CODE_PIPELINE ->
                    ConfigurationSourceType.CODE_PIPELINE
            }

        internal fun unwrap(
            wrapped: ConfigurationSourceType
        ): software.amazon.awscdk.services.appconfig.ConfigurationSourceType = wrapped.cdkObject
    }
}
