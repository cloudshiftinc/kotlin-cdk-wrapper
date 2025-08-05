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
 * Properties to initialize an instance of `HttpStage`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * HttpApi api;
 * LogGroup logGroup;
 * HttpStage stage = HttpStage.Builder.create(this, "Stage")
 * .httpApi(api)
 * .accessLogSettings(Map.of(
 * "destination", new LogGroupLogDestination(logGroup)))
 * .build();
 * ```
 */
public interface HttpStageProps : HttpStageOptions {
  /**
   * The HTTP API to which this stage is associated.
   */
  public fun httpApi(): IHttpApi

  /**
   * A builder for [HttpStageProps]
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
    @JvmName("385ec8b0bea636f706c599561ccaee3a7e0211ebd0de5a8ff7471c2c17f3c7f3")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * @param httpApi The HTTP API to which this stage is associated. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * @param stageName The name of the stage.
     * See `StageName` class for more details.
     */
    public fun stageName(stageName: String)

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
    @JvmName("f3921d028019cc7a6ee859064f6924e15d6b6779dd77bf6f9f79ced4aa069b19")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStageProps.builder()

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
    @JvmName("385ec8b0bea636f706c599561ccaee3a7e0211ebd0de5a8ff7471c2c17f3c7f3")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    /**
     * @param httpApi The HTTP API to which this stage is associated. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi.Companion::unwrap))
    }

    /**
     * @param stageName The name of the stage.
     * See `StageName` class for more details.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

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
    @JvmName("f3921d028019cc7a6ee859064f6924e15d6b6779dd77bf6f9f79ced4aa069b19")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageProps,
  ) : CdkObject(cdkObject),
      HttpStageProps {
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
     * The HTTP API to which this stage is associated.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageProps):
        HttpStageProps = CdkObjectWrappers.wrap(cdkObject) as? HttpStageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageProps):
        software.amazon.awscdk.services.apigatewayv2.HttpStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpStageProps
  }
}
