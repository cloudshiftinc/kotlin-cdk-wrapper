package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpStageOptions : StageOptions {
  /**
   * The name of the stage.
   *
   * See `StageName` class for more details.
   *
   * Default: '$default' the default stage of the API. This stage will have the URL at the root of
   * the API endpoint.
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [HttpStageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    public fun domainMapping(domainMapping: DomainMappingOptions)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * @param stageName The name of the stage.
     * See `StageName` class for more details.
     */
    public fun stageName(stageName: String)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.builder()

    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    /**
     * @param stageName The name of the stage.
     * See `StageName` class for more details.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions,
  ) : CdkObject(cdkObject), HttpStageOptions {
    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     */
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     */
    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    /**
     * The name of the stage.
     *
     * See `StageName` class for more details.
     *
     * Default: '$default' the default stage of the API. This stage will have the URL at the root of
     * the API endpoint.
     */
    override fun stageName(): String? = unwrap(this).getStageName()

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     */
    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions):
        HttpStageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpStageOptions
  }
}
