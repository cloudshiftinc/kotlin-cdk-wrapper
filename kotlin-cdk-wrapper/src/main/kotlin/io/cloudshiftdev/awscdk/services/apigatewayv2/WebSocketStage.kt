@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a stage where an instance of the API is deployed.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function connectHandler;
 * Function disconnectHandler;
 * Function defaultHandler;
 * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
 * .connectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("ConnectIntegration", connectHandler)).build())
 * .disconnectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DisconnectIntegration", disconnectHandler)).build())
 * .defaultRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DefaultIntegration", defaultHandler)).build())
 * .build();
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * ```
 */
public open class WebSocketStage(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStage,
) : Resource(cdkObject), IWebSocketStage, IStage {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketStageProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketStage(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(WebSocketStageProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketStageProps.Builder.() -> Unit,
  ) : this(scope, id, WebSocketStageProps(props)
  )

  /**
   * The API this stage is associated to.
   */
  public override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

  /**
   * The callback URL to this stage.
   */
  public override fun callbackUrl(): String = unwrap(this).getCallbackUrl()

  /**
   * Grant access to the API Gateway management API for this WebSocket API Stage to an IAM principal
   * (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public open fun grantManagementApiAccess(identity: IGrantable): Grant =
      unwrap(this).grantManagementApiAccess(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The name of the stage;
   *
   * its primary identifier.
   */
  public override fun stageName(): String = unwrap(this).getStageName()

  /**
   * The websocket URL to this stage.
   */
  public override fun url(): String = unwrap(this).getUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketStage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     *
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment. 
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping. 
     */
    public fun domainMapping(domainMapping: DomainMappingOptions)

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e1ea7ecc4ff868f7a8daa92e628e6ab20aa0cb643b7873bde51b041705ca8b9")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * The name of the stage.
     *
     * @param stageName The name of the stage. 
     */
    public fun stageName(stageName: String)

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage. 
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e065974bb2dee52f6d529fde0b2997b9658f6379a4b616e18359056a4f373114")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    /**
     * The WebSocket API to which this stage is associated.
     *
     * @param webSocketApi The WebSocket API to which this stage is associated. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketStage.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage.Builder.create(scope, id)

    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     *
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment. 
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping. 
     */
    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e1ea7ecc4ff868f7a8daa92e628e6ab20aa0cb643b7873bde51b041705ca8b9")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    /**
     * The name of the stage.
     *
     * @param stageName The name of the stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage. 
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e065974bb2dee52f6d529fde0b2997b9658f6379a4b616e18359056a4f373114")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    /**
     * The WebSocket API to which this stage is associated.
     *
     * @param webSocketApi The WebSocket API to which this stage is associated. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStage =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromWebSocketStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketStageAttributes,
    ): IWebSocketStage =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage.fromWebSocketStageAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(WebSocketStageAttributes::unwrap)).let(IWebSocketStage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c320f7b4d1d5bee302dc541be02f23840ba27f0abd2928c85a7bfccdb92aa57d")
    public fun fromWebSocketStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketStageAttributes.Builder.() -> Unit,
    ): IWebSocketStage = fromWebSocketStageAttributes(scope, id, WebSocketStageAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStage):
        WebSocketStage = WebSocketStage(cdkObject)

    internal fun unwrap(wrapped: WebSocketStage):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage
  }
}
