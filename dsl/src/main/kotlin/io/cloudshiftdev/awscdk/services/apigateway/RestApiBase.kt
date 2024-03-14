package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RestApiBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase,
) : Resource(cdkObject), IRestApi {
  public open fun addApiKey(id: String): IApiKey = unwrap(this).addApiKey(id).let(IApiKey::wrap)

  public open fun addApiKey(id: String, options: ApiKeyOptions): IApiKey =
      unwrap(this).addApiKey(id, options.let(ApiKeyOptions::unwrap)).let(IApiKey::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
  public open fun addApiKey(id: String, options: ApiKeyOptions.Builder.() -> Unit): IApiKey =
      addApiKey(id, ApiKeyOptions(options))

  public open fun addDomainName(id: String, options: DomainNameOptions): DomainName =
      unwrap(this).addDomainName(id, options.let(DomainNameOptions::unwrap)).let(DomainName::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355b6095efa03cb78b744535cc778055b59eeb7900f72c9ec619dede81a091ad")
  public open fun addDomainName(id: String, options: DomainNameOptions.Builder.() -> Unit):
      DomainName = addDomainName(id, DomainNameOptions(options))

  public open fun addGatewayResponse(id: String, options: GatewayResponseOptions): GatewayResponse =
      unwrap(this).addGatewayResponse(id,
      options.let(GatewayResponseOptions::unwrap)).let(GatewayResponse::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0f2cf1c468a1892bb108538ca2249b039d05c47be2b7f79d025fafc156a9d51c")
  public open fun addGatewayResponse(id: String,
      options: GatewayResponseOptions.Builder.() -> Unit): GatewayResponse = addGatewayResponse(id,
      GatewayResponseOptions(options))

  public open fun addUsagePlan(id: String): UsagePlan =
      unwrap(this).addUsagePlan(id).let(UsagePlan::wrap)

  public open fun addUsagePlan(id: String, props: UsagePlanProps): UsagePlan =
      unwrap(this).addUsagePlan(id, props.let(UsagePlanProps::unwrap)).let(UsagePlan::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("382855e9be8cf585fe729726d1adccd689c578505ee3049c6fba5230cbf789d4")
  public open fun addUsagePlan(id: String, props: UsagePlanProps.Builder.() -> Unit): UsagePlan =
      addUsagePlan(id, UsagePlanProps(props))

  public override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

  public override fun arnForExecuteApi(method: String): String =
      unwrap(this).arnForExecuteApi(method)

  public override fun arnForExecuteApi(method: String, path: String): String =
      unwrap(this).arnForExecuteApi(method, path)

  public override fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String = unwrap(this).arnForExecuteApi(method, path, stage)

  public override fun deploymentStage(): Stage = unwrap(this).getDeploymentStage().let(Stage::wrap)

  public override fun deploymentStage(`value`: Stage) {
    unwrap(this).setDeploymentStage(`value`.let(Stage::unwrap))
  }

  public open fun domainName(): DomainName? = unwrap(this).getDomainName()?.let(DomainName::wrap)

  public override fun latestDeployment(): Deployment? =
      unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public open fun metricCacheHitCount(): Metric =
      unwrap(this).metricCacheHitCount().let(Metric::wrap)

  public open fun metricCacheHitCount(props: MetricOptions): Metric =
      unwrap(this).metricCacheHitCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4bad4fa6db6decd2bc6eaa2b85596980df958d75997f43cb09e3eef9290bc242")
  public open fun metricCacheHitCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCacheHitCount(MetricOptions(props))

  public open fun metricCacheMissCount(): Metric =
      unwrap(this).metricCacheMissCount().let(Metric::wrap)

  public open fun metricCacheMissCount(props: MetricOptions): Metric =
      unwrap(this).metricCacheMissCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0871c24c33198a19f6d36e7aa5dbadbb6f0f9f13f8d2d26d1683658718d5e75")
  public open fun metricCacheMissCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCacheMissCount(MetricOptions(props))

  public open fun metricClientError(): Metric = unwrap(this).metricClientError().let(Metric::wrap)

  public open fun metricClientError(props: MetricOptions): Metric =
      unwrap(this).metricClientError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public open fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClientError(MetricOptions(props))

  public open fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

  public open fun metricCount(props: MetricOptions): Metric =
      unwrap(this).metricCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public open fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(MetricOptions(props))

  public open fun metricIntegrationLatency(): Metric =
      unwrap(this).metricIntegrationLatency().let(Metric::wrap)

  public open fun metricIntegrationLatency(props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public open fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIntegrationLatency(MetricOptions(props))

  public open fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

  public open fun metricLatency(props: MetricOptions): Metric =
      unwrap(this).metricLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public open fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(MetricOptions(props))

  public open fun metricServerError(): Metric = unwrap(this).metricServerError().let(Metric::wrap)

  public open fun metricServerError(props: MetricOptions): Metric =
      unwrap(this).metricServerError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public open fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricServerError(MetricOptions(props))

  public override fun restApiId(): String = unwrap(this).getRestApiId()

  public override fun restApiName(): String = unwrap(this).getRestApiName()

  public override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

  public override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

  public open fun url(): String = unwrap(this).getUrl()

  public open fun urlForPath(): String = unwrap(this).urlForPath()

  public open fun urlForPath(path: String): String = unwrap(this).urlForPath(path)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase,
  ) : RestApiBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase):
        RestApiBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiBase):
        software.amazon.awscdk.services.apigateway.RestApiBase = (wrapped as Wrapper).cdkObject
  }
}
