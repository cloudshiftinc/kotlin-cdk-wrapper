package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ApiKeyOptions : ResourceOptions {
  /**
   * A name for the API key.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the API key name.
   *
   * Default: automically generated name
   */
  public fun apiKeyName(): String? = unwrap(this).getApiKeyName()

  /**
   * A description of the purpose of the API key.
   *
   * Default: none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The value of the API key.
   *
   * Must be at least 20 characters long.
   *
   * Default: none
   */
  public fun `value`(): String? = unwrap(this).getValue()

  /**
   * A builder for [ApiKeyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    public fun apiKeyName(apiKeyName: String)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03cb9ec604cb6161f700e526dd84655ef00e0cc4c52b16f53311236e40965624")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f429ef5f253eff4bc064a9a1b552812d1f2de5cb36eb6794b1d4cc417e8084c")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9993177f12b3fc337efdc2bffb51474c78c1aa28b17cdd44effd6328ae5e1bf")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param description A description of the purpose of the API key.
     */
    public fun description(description: String)

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKeyOptions.Builder =
        software.amazon.awscdk.services.apigateway.ApiKeyOptions.builder()

    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03cb9ec604cb6161f700e526dd84655ef00e0cc4c52b16f53311236e40965624")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f429ef5f253eff4bc064a9a1b552812d1f2de5cb36eb6794b1d4cc417e8084c")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9993177f12b3fc337efdc2bffb51474c78c1aa28b17cdd44effd6328ae5e1bf")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * @param description A description of the purpose of the API key.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKeyOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyOptions,
  ) : ApiKeyOptions {
    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     *
     * Default: automically generated name
     */
    override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    /**
     * A description of the purpose of the API key.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The value of the API key.
     *
     * Must be at least 20 characters long.
     *
     * Default: none
     */
    override fun `value`(): String? = unwrap(this).getValue()
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
