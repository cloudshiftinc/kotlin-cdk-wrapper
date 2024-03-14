package io.cloudshiftdev.awscdk.services.lambda

public enum class RuntimeFamily(
    private val cdkObject: software.amazon.awscdk.services.lambda.RuntimeFamily,
) {
    NODEJS(software.amazon.awscdk.services.lambda.RuntimeFamily.NODEJS),
    JAVA(software.amazon.awscdk.services.lambda.RuntimeFamily.JAVA),
    PYTHON(software.amazon.awscdk.services.lambda.RuntimeFamily.PYTHON),
    DOTNET_CORE(software.amazon.awscdk.services.lambda.RuntimeFamily.DOTNET_CORE),
    GO(software.amazon.awscdk.services.lambda.RuntimeFamily.GO),
    RUBY(software.amazon.awscdk.services.lambda.RuntimeFamily.RUBY),
    OTHER(software.amazon.awscdk.services.lambda.RuntimeFamily.OTHER),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.RuntimeFamily
        ): RuntimeFamily =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.RuntimeFamily.NODEJS -> RuntimeFamily.NODEJS
                software.amazon.awscdk.services.lambda.RuntimeFamily.JAVA -> RuntimeFamily.JAVA
                software.amazon.awscdk.services.lambda.RuntimeFamily.PYTHON -> RuntimeFamily.PYTHON
                software.amazon.awscdk.services.lambda.RuntimeFamily.DOTNET_CORE ->
                    RuntimeFamily.DOTNET_CORE
                software.amazon.awscdk.services.lambda.RuntimeFamily.GO -> RuntimeFamily.GO
                software.amazon.awscdk.services.lambda.RuntimeFamily.RUBY -> RuntimeFamily.RUBY
                software.amazon.awscdk.services.lambda.RuntimeFamily.OTHER -> RuntimeFamily.OTHER
            }

        internal fun unwrap(
            wrapped: RuntimeFamily
        ): software.amazon.awscdk.services.lambda.RuntimeFamily = wrapped.cdkObject
    }
}
