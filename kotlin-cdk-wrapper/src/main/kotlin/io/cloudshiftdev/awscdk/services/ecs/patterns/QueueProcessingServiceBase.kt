@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkObject
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

public abstract class QueueProcessingServiceBase internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase,
) : Construct(cdkObject) {
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  public open fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public open fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  public open fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

  public open fun minCapacity(): Number = unwrap(this).getMinCapacity()

  public open fun scalingSteps(): List<ScalingInterval> =
      unwrap(this).getScalingSteps().map(ScalingInterval::wrap)

  public open fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  public open fun sqsQueue(): IQueue = unwrap(this).getSqsQueue().let(IQueue::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase,
  ) : QueueProcessingServiceBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase):
        QueueProcessingServiceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingServiceBase):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBase
  }
}
