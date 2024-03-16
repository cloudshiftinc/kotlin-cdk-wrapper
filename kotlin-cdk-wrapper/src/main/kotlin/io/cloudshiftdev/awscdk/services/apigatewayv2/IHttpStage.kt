@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the HttpStage.
 */
public interface IHttpStage : IStage {
  /**
   * The API this stage is associated to.
   */
  public fun api(): IHttpApi

  /**
   * The custom domain URL to this stage.
   */
  public fun domainUrl(): String

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricClientError(): Metric

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricClientError(props: MetricOptions): Metric

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  public fun metricCount(): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  public fun metricCount(props: MetricOptions): Metric

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - SampleCount over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDataProcessed(): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricDataProcessed(props: MetricOptions): Metric

  /**
   * Metric for the amount of data processed in bytes.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricIntegrationLatency(): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricIntegrationLatency(props: MetricOptions): Metric

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - no statistic
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricLatency(): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  public fun metricLatency(props: MetricOptions): Metric

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - no statistic
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricServerError(): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public fun metricServerError(props: MetricOptions): Metric

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpStage):
        IHttpStage = CdkObjectWrappers.wrap(cdkObject) as IHttpStage

    internal fun unwrap(wrapped: IHttpStage):
        software.amazon.awscdk.services.apigatewayv2.IHttpStage = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IHttpStage
  }
}
