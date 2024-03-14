package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IHttpApi : IApi {
  public fun addVpcLink(arg0: VpcLinkProps): VpcLink

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
  public fun addVpcLink(arg0: VpcLinkProps.Builder.() -> Unit): VpcLink

  public fun arnForExecuteApi(): String

  public fun arnForExecuteApi(arg0: String): String

  public fun arnForExecuteApi(arg0: String, arg1: String): String

  public fun arnForExecuteApi(
    arg0: String,
    arg1: String,
    arg2: String,
  ): String

  public fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  public fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  public fun metricClientError(): Metric

  public fun metricClientError(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public fun metricClientError(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricCount(): Metric

  public fun metricCount(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public fun metricCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDataProcessed(): Metric

  public fun metricDataProcessed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public fun metricDataProcessed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricIntegrationLatency(): Metric

  public fun metricIntegrationLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public fun metricIntegrationLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricLatency(): Metric

  public fun metricLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public fun metricLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricServerError(): Metric

  public fun metricServerError(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public fun metricServerError(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpApi,
  ) : IHttpApi {
    override fun addVpcLink(arg0: VpcLinkProps): VpcLink =
        unwrap(this).addVpcLink(arg0.let(VpcLinkProps::unwrap)).let(VpcLink::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
    override fun addVpcLink(arg0: VpcLinkProps.Builder.() -> Unit): VpcLink =
        addVpcLink(VpcLinkProps(arg0))

    override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

    override fun apiId(): String = unwrap(this).getApiId()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

    override fun arnForExecuteApi(arg0: String): String = unwrap(this).arnForExecuteApi(arg0)

    override fun arnForExecuteApi(arg0: String, arg1: String): String =
        unwrap(this).arnForExecuteApi(arg0, arg1)

    override fun arnForExecuteApi(
      arg0: String,
      arg1: String,
      arg2: String,
    ): String = unwrap(this).arnForExecuteApi(arg0, arg1, arg2)

    override fun defaultAuthorizationScopes(): List<String> =
        unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

    override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricClientError(): Metric = unwrap(this).metricClientError().let(Metric::wrap)

    override fun metricClientError(arg0: MetricOptions): Metric =
        unwrap(this).metricClientError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
    override fun metricClientError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricClientError(MetricOptions(arg0))

    override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

    override fun metricCount(arg0: MetricOptions): Metric =
        unwrap(this).metricCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
    override fun metricCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricCount(MetricOptions(arg0))

    override fun metricDataProcessed(): Metric =
        unwrap(this).metricDataProcessed().let(Metric::wrap)

    override fun metricDataProcessed(arg0: MetricOptions): Metric =
        unwrap(this).metricDataProcessed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
    override fun metricDataProcessed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDataProcessed(MetricOptions(arg0))

    override fun metricIntegrationLatency(): Metric =
        unwrap(this).metricIntegrationLatency().let(Metric::wrap)

    override fun metricIntegrationLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricIntegrationLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
    override fun metricIntegrationLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricIntegrationLatency(MetricOptions(arg0))

    override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

    override fun metricLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
    override fun metricLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricLatency(MetricOptions(arg0))

    override fun metricServerError(): Metric = unwrap(this).metricServerError().let(Metric::wrap)

    override fun metricServerError(arg0: MetricOptions): Metric =
        unwrap(this).metricServerError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
    override fun metricServerError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricServerError(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpApi): IHttpApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpApi): software.amazon.awscdk.services.apigatewayv2.IHttpApi =
        (wrapped as Wrapper).cdkObject
  }
}
