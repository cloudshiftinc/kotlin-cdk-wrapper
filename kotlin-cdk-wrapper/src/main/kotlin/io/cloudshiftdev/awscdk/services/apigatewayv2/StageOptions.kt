@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * IAccessLogSettings accessLogSettings;
 * DomainName domainName;
 * StageOptions stageOptions = StageOptions.builder()
 * .accessLogSettings(accessLogSettings)
 * .autoDeploy(false)
 * .description("description")
 * .detailedMetricsEnabled(false)
 * .domainMapping(DomainMappingOptions.builder()
 * .domainName(domainName)
 * // the properties below are optional
 * .mappingKey("mappingKey")
 * .build())
 * .stageVariables(Map.of(
 * "stageVariablesKey", "stageVariables"))
 * .throttle(ThrottleSettings.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build())
 * .build();
 * ```
 */
public interface StageOptions {
  /**
   * Settings for access logging.
   *
   * Default: - No access logging
   */
  public fun accessLogSettings(): IAccessLogSettings? =
      unwrap(this).getAccessLogSettings()?.let(IAccessLogSettings::wrap)

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
   * Specifies whether detailed metrics are enabled.
   *
   * Default: false
   */
  public fun detailedMetricsEnabled(): Boolean? = unwrap(this).getDetailedMetricsEnabled()

  /**
   * The options for custom domain and api mapping.
   *
   * Default: - no custom domain and api mapping configuration
   */
  public fun domainMapping(): DomainMappingOptions? =
      unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

  /**
   * Stage variables for the stage. These are key-value pairs that you can define and use in your
   * API routes.
   *
   * The allowed characters for variable names and the required pattern for variable values are
   * specified here:
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/TemplateReference/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
   *
   * Default: - No stage variables
   */
  public fun stageVariables(): Map<String, String> = unwrap(this).getStageVariables() ?: emptyMap()

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
     * @param accessLogSettings Settings for access logging.
     */
    public fun accessLogSettings(accessLogSettings: IAccessLogSettings)

    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * @param description The description for the API stage.
     */
    public fun description(description: String)

    /**
     * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
     */
    public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean)

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
     * @param stageVariables Stage variables for the stage. These are key-value pairs that you can
     * define and use in your API routes.
     * The allowed characters for variable names and the required pattern for variable values are
     * specified here:
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/TemplateReference/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     */
    public fun stageVariables(stageVariables: Map<String, String>)

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
     * @param accessLogSettings Settings for access logging.
     */
    override fun accessLogSettings(accessLogSettings: IAccessLogSettings) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(IAccessLogSettings.Companion::unwrap))
    }

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
     * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
     */
    override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
      cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
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
     * @param stageVariables Stage variables for the stage. These are key-value pairs that you can
     * define and use in your API routes.
     * The allowed characters for variable names and the required pattern for variable values are
     * specified here:
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/TemplateReference/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     */
    override fun stageVariables(stageVariables: Map<String, String>) {
      cdkBuilder.stageVariables(stageVariables)
    }

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
     * Settings for access logging.
     *
     * Default: - No access logging
     */
    override fun accessLogSettings(): IAccessLogSettings? =
        unwrap(this).getAccessLogSettings()?.let(IAccessLogSettings::wrap)

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
     * Specifies whether detailed metrics are enabled.
     *
     * Default: false
     */
    override fun detailedMetricsEnabled(): Boolean? = unwrap(this).getDetailedMetricsEnabled()

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     */
    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    /**
     * Stage variables for the stage. These are key-value pairs that you can define and use in your
     * API routes.
     *
     * The allowed characters for variable names and the required pattern for variable values are
     * specified here:
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/TemplateReference/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables
     *
     * Default: - No stage variables
     */
    override fun stageVariables(): Map<String, String> = unwrap(this).getStageVariables() ?:
        emptyMap()

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
