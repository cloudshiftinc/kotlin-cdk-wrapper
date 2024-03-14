package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketStage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStage,
) : Resource(cdkObject), IWebSocketStage, IStage {
  public override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

  public override fun callbackUrl(): String = unwrap(this).getCallbackUrl()

  public open fun grantManagementApiAccess(identity: IGrantable): Grant =
      unwrap(this).grantManagementApiAccess(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun stageName(): String = unwrap(this).getStageName()

  public override fun url(): String = unwrap(this).getUrl()

  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean) {
    }

    public fun domainMapping(domainMapping: DomainMappingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e1ea7ecc4ff868f7a8daa92e628e6ab20aa0cb643b7873bde51b041705ca8b9")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit) {
    }

    public fun stageName(stageName: String) {
    }

    public fun throttle(throttle: ThrottleSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e065974bb2dee52f6d529fde0b2997b9658f6379a4b616e18359056a4f373114")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit) {
    }

    public fun webSocketApi(webSocketApi: IWebSocketApi) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketStage.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage.Builder.create(scope, id)

    public override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    public override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e1ea7ecc4ff868f7a8daa92e628e6ab20aa0cb643b7873bde51b041705ca8b9")
    public override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit
        = domainMapping(DomainMappingOptions(domainMapping))

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e065974bb2dee52f6d529fde0b2997b9658f6379a4b616e18359056a4f373114")
    public override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStage =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromWebSocketStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketStageAttributes,
    ): IWebSocketStage =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage.fromWebSocketStageAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(WebSocketStageAttributes::unwrap)).let(IWebSocketStage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c320f7b4d1d5bee302dc541be02f23840ba27f0abd2928c85a7bfccdb92aa57d")
    public open fun fromWebSocketStageAttributes(
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
        software.amazon.awscdk.services.apigatewayv2.WebSocketStage = wrapped.cdkObject
  }
}
