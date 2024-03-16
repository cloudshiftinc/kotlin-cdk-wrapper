@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for scalable attributes.
 */
public interface IScalableFunctionAttribute : IConstruct {
  /**
   * Scale out or in based on schedule.
   *
   * @param id 
   * @param actions 
   */
  public fun scaleOnSchedule(id: String, actions: ScalingSchedule)

  /**
   * Scale out or in based on schedule.
   *
   * @param id 
   * @param actions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public fun scaleOnSchedule(id: String, actions: ScalingSchedule.Builder.() -> Unit)

  /**
   * Scale out or in to keep utilization at a given level.
   *
   * The utilization is tracked by the
   * LambdaProvisionedConcurrencyUtilization metric, emitted by lambda. See:
   * https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics.html#monitoring-metrics-concurrency
   *
   * @param options 
   */
  public fun scaleOnUtilization(options: UtilizationScalingOptions)

  /**
   * Scale out or in to keep utilization at a given level.
   *
   * The utilization is tracked by the
   * LambdaProvisionedConcurrencyUtilization metric, emitted by lambda. See:
   * https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics.html#monitoring-metrics-concurrency
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe32b38d4b85bd17fe2b79bbbf0cf909ca5f3e4294d4935b76798b3372d86202")
  public fun scaleOnUtilization(options: UtilizationScalingOptions.Builder.() -> Unit)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IScalableFunctionAttribute):
        IScalableFunctionAttribute = CdkObjectWrappers.wrap(cdkObject) as IScalableFunctionAttribute

    internal fun unwrap(wrapped: IScalableFunctionAttribute):
        software.amazon.awscdk.services.lambda.IScalableFunctionAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IScalableFunctionAttribute
  }
}
