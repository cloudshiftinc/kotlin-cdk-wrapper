@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * The base class for QueueProcessingEc2Service and QueueProcessingFargateService services.
 */
public abstract class QueueProcessingServiceBase(
  cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase,
) : Construct(cdkObject) {
  /**
   * The cluster where your service will be deployed.
   */
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  /**
   * The dead letter queue for the primary SQS queue.
   */
  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * Environment variables that will include the queue name.
   */
  public open fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The AwsLogDriver to use for logging if logging is enabled.
   */
  public open fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  /**
   * The maximum number of instances for autoscaling to scale up to.
   */
  public open fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

  /**
   * The minimum number of instances for autoscaling to scale down to.
   */
  public open fun minCapacity(): Number = unwrap(this).getMinCapacity()

  /**
   * The scaling interval for autoscaling based off an SQS Queue size.
   */
  public open fun scalingSteps(): List<ScalingInterval> =
      unwrap(this).getScalingSteps().map(ScalingInterval::wrap)

  /**
   * The secret environment variables.
   */
  public open fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * The SQS queue that the service will process from.
   */
  public open fun sqsQueue(): IQueue = unwrap(this).getSqsQueue().let(IQueue::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase,
  ) : QueueProcessingServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase):
        QueueProcessingServiceBase = CdkObjectWrappers.wrap(cdkObject) as?
        QueueProcessingServiceBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingServiceBase):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase
  }
}
