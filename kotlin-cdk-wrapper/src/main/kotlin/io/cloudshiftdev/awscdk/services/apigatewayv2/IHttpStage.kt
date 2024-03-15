@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IHttpStage : IStage {
  public fun api(): IHttpApi

  public fun domainUrl(): String

  public fun metricClientError(): Metric

  public fun metricClientError(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public fun metricClientError(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricCount(): Metric

  public fun metricCount(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public fun metricCount(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDataProcessed(): Metric

  public fun metricDataProcessed(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public fun metricDataProcessed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricIntegrationLatency(): Metric

  public fun metricIntegrationLatency(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public fun metricIntegrationLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricLatency(): Metric

  public fun metricLatency(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public fun metricLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricServerError(): Metric

  public fun metricServerError(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public fun metricServerError(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpStage,
  ) : CdkObject(cdkObject), IHttpStage {
    override fun api(): IHttpApi = unwrap(this).getApi().let(IHttpApi::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun domainUrl(): String = unwrap(this).getDomainUrl()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricClientError(): Metric = unwrap(this).metricClientError().let(Metric::wrap)

    override fun metricClientError(arg0: MetricOptions): Metric =
        unwrap(this).metricClientError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
    override fun metricClientError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricClientError(MetricOptions(arg0))

    override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

    override fun metricCount(arg0: MetricOptions): Metric =
        unwrap(this).metricCount(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
    override fun metricCount(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricCount(MetricOptions(arg0))

    override fun metricDataProcessed(): Metric =
        unwrap(this).metricDataProcessed().let(Metric::wrap)

    override fun metricDataProcessed(arg0: MetricOptions): Metric =
        unwrap(this).metricDataProcessed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
    override fun metricDataProcessed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDataProcessed(MetricOptions(arg0))

    override fun metricIntegrationLatency(): Metric =
        unwrap(this).metricIntegrationLatency().let(Metric::wrap)

    override fun metricIntegrationLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricIntegrationLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
    override fun metricIntegrationLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricIntegrationLatency(MetricOptions(arg0))

    override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

    override fun metricLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
    override fun metricLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricLatency(MetricOptions(arg0))

    override fun metricServerError(): Metric = unwrap(this).metricServerError().let(Metric::wrap)

    override fun metricServerError(arg0: MetricOptions): Metric =
        unwrap(this).metricServerError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
    override fun metricServerError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricServerError(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun stageName(): String = unwrap(this).getStageName()

    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpStage):
        IHttpStage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpStage):
        software.amazon.awscdk.services.apigatewayv2.IHttpStage = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IHttpStage
  }
}