package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ApiKeyOptions : ResourceOptions {
  public fun apiKeyName(): String? = unwrap(this).getApiKeyName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun `value`(): String? = unwrap(this).getValue()

  public interface Builder {
    public fun apiKeyName(apiKeyName: String) {
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03cb9ec604cb6161f700e526dd84655ef00e0cc4c52b16f53311236e40965624")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit) {
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f429ef5f253eff4bc064a9a1b552812d1f2de5cb36eb6794b1d4cc417e8084c")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit) {
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9993177f12b3fc337efdc2bffb51474c78c1aa28b17cdd44effd6328ae5e1bf")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKeyOptions.Builder =
        software.amazon.awscdk.services.apigateway.ApiKeyOptions.builder()

    public override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    public override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03cb9ec604cb6161f700e526dd84655ef00e0cc4c52b16f53311236e40965624")
    public override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    public override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f429ef5f253eff4bc064a9a1b552812d1f2de5cb36eb6794b1d4cc417e8084c")
    public override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit
        = defaultIntegration(Integration(defaultIntegration))

    public override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9993177f12b3fc337efdc2bffb51474c78c1aa28b17cdd44effd6328ae5e1bf")
    public override
        fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit =
        defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKeyOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyOptions,
  ) : ApiKeyOptions {
    public override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    public override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    public override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    public override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyOptions):
        ApiKeyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiKeyOptions):
        software.amazon.awscdk.services.apigateway.ApiKeyOptions = (wrapped as Wrapper).cdkObject
  }
}
