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
 * Represents a Stage.
 */
public interface IStage : IResource {
  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this HTTP Api Gateway Stage.
   *
   * Default: - average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The name of the stage;
   *
   * its primary identifier.
   */
  public fun stageName(): String

  /**
   * The URL to this stage.
   */
  public fun url(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IStage): IStage =
        CdkObjectWrappers.wrap(cdkObject) as IStage

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.apigatewayv2.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IStage
  }
}
