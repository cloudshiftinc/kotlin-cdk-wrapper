@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options required to create a new stage.
 *
 * Options that are common between HTTP and Websocket APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * DomainName domainName;
 * StageOptions stageOptions = StageOptions.builder()
 * .autoDeploy(false)
 * .description("description")
 * .domainMapping(DomainMappingOptions.builder()
 * .domainName(domainName)
 * // the properties below are optional
 * .mappingKey("mappingKey")
 * .build())
 * .throttle(ThrottleSettings.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build())
 * .build();
 * ```
 */
public interface StageOptions {
  /**
   * Whether updates to an API automatically trigger a new deployment.
   *
   * Default: false
   */
  public fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

  /**
   * The description for the API stage.
   *
   * Default: - no description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The options for custom domain and api mapping.
   *
   * Default: - no custom domain and api mapping configuration
   */
  public fun domainMapping(): DomainMappingOptions? =
      unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

  /**
   * Throttle settings for the routes of this stage.
   *
   * Default: - no throttling configuration
   */
  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  /**
   * A builder for [StageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * @param description The description for the API stage.
     */
    public fun description(description: String)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    public fun domainMapping(domainMapping: DomainMappingOptions)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca35995823fd1e7d71d17e3e276cc2db56d83031c23094c4aa49cde7fa0393e0")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d19c4f6551050fa730584bd611f48cb522017c021f96731a8b9835a163092a")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.StageOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.StageOptions.builder()

    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * @param description The description for the API stage.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions.Companion::unwrap))
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca35995823fd1e7d71d17e3e276cc2db56d83031c23094c4aa49cde7fa0393e0")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings.Companion::unwrap))
    }

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d19c4f6551050fa730584bd611f48cb522017c021f96731a8b9835a163092a")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.StageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.StageOptions,
  ) : CdkObject(cdkObject),
      StageOptions {
    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     */
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    /**
     * The description for the API stage.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     */
    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     */
    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.StageOptions):
        StageOptions = CdkObjectWrappers.wrap(cdkObject) as? StageOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.apigatewayv2.StageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.StageOptions
  }
}
