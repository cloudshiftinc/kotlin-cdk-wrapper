package io.cloudshiftdev.awscdk.services.lambda

public enum class ParamsAndSecretsLogLevel(
    private val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel,
) {
    DEBUG(software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.DEBUG),
    INFO(software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.INFO),
    WARN(software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.WARN),
    ERROR(software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.ERROR),
    NONE(software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.NONE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel
        ): ParamsAndSecretsLogLevel =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.DEBUG ->
                    ParamsAndSecretsLogLevel.DEBUG
                software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.INFO ->
                    ParamsAndSecretsLogLevel.INFO
                software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.WARN ->
                    ParamsAndSecretsLogLevel.WARN
                software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.ERROR ->
                    ParamsAndSecretsLogLevel.ERROR
                software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel.NONE ->
                    ParamsAndSecretsLogLevel.NONE
            }

        internal fun unwrap(
            wrapped: ParamsAndSecretsLogLevel
        ): software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel = wrapped.cdkObject
    }
}
