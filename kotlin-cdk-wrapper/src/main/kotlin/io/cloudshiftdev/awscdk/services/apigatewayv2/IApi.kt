@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a API Gateway HTTP/WebSocket API.
 */
public interface IApi : IResource {
  /**
   * The default endpoint for an API.
   */
  public fun apiEndpoint(): String

  /**
   * The identifier of this API Gateway API.
   */
  public fun apiId(): String

  /**
   * Return the given named metric for this Api Gateway.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this Api Gateway.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Api Gateway.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IApi): IApi =
        CdkObjectWrappers.wrap(cdkObject) as IApi

    internal fun unwrap(wrapped: IApi): software.amazon.awscdk.services.apigatewayv2.IApi = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IApi
  }
}
