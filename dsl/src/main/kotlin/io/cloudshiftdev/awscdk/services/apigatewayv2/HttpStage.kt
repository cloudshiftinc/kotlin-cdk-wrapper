package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpStage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStage,
) : Resource(cdkObject), IHttpStage, IStage {
  public override fun api(): IHttpApi = unwrap(this).getApi().let(IHttpApi::wrap)

  public override fun domainUrl(): String = unwrap(this).getDomainUrl()

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricClientError(): Metric =
      unwrap(this).metricClientError().let(Metric::wrap)

  public override fun metricClientError(props: MetricOptions): Metric =
      unwrap(this).metricClientError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public override fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClientError(MetricOptions(props))

  public override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

  public override fun metricCount(props: MetricOptions): Metric =
      unwrap(this).metricCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public override fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(MetricOptions(props))

  public override fun metricDataProcessed(): Metric =
      unwrap(this).metricDataProcessed().let(Metric::wrap)

  public override fun metricDataProcessed(props: MetricOptions): Metric =
      unwrap(this).metricDataProcessed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public override fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDataProcessed(MetricOptions(props))

  public override fun metricIntegrationLatency(): Metric =
      unwrap(this).metricIntegrationLatency().let(Metric::wrap)

  public override fun metricIntegrationLatency(props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public override fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIntegrationLatency(MetricOptions(props))

  public override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

  public override fun metricLatency(props: MetricOptions): Metric =
      unwrap(this).metricLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public override fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(MetricOptions(props))

  public override fun metricServerError(): Metric =
      unwrap(this).metricServerError().let(Metric::wrap)

  public override fun metricServerError(props: MetricOptions): Metric =
      unwrap(this).metricServerError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public override fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricServerError(MetricOptions(props))

  public override fun stageName(): String = unwrap(this).getStageName()

  public override fun url(): String = unwrap(this).getUrl()

  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean)

    public fun domainMapping(domainMapping: DomainMappingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012aa05ad371a8c93696c5a42e2063c25e41e9c7bfc83ec80d98d1a182a3913d")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun httpApi(httpApi: IHttpApi)

    public fun stageName(stageName: String)

    public fun throttle(throttle: ThrottleSettings)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4afe37dd4eb4b7da6344ea8d7615754d00f98395416584c4dceded0cfd9cf6")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStage.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStage.Builder.create(scope, id)

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012aa05ad371a8c93696c5a42e2063c25e41e9c7bfc83ec80d98d1a182a3913d")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b4afe37dd4eb4b7da6344ea8d7615754d00f98395416584c4dceded0cfd9cf6")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStage = cdkBuilder.build()
  }

  public companion object {
    public open fun fromHttpStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpStageAttributes,
    ): IHttpStage =
        software.amazon.awscdk.services.apigatewayv2.HttpStage.fromHttpStageAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HttpStageAttributes::unwrap)).let(IHttpStage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("575259e563e823f79320eb804445610337a793b8fc45079d0015386ccc1dc845")
    public open fun fromHttpStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpStageAttributes.Builder.() -> Unit,
    ): IHttpStage = fromHttpStageAttributes(scope, id, HttpStageAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStage): HttpStage
        = HttpStage(cdkObject)

    internal fun unwrap(wrapped: HttpStage): software.amazon.awscdk.services.apigatewayv2.HttpStage
        = wrapped.cdkObject
  }
}
