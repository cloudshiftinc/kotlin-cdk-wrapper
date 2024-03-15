@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * A set of group metrics.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * // Enable monitoring of all group metrics
 * // Enable monitoring of all group metrics
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .groupMetrics(List.of(GroupMetrics.all()))
 * .build();
 * // Enable monitoring for a subset of group metrics
 * // Enable monitoring for a subset of group metrics
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .groupMetrics(List.of(new GroupMetrics(GroupMetric.MIN_SIZE, GroupMetric.MAX_SIZE)))
 * .build();
 * ```
 */
public open class GroupMetrics internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics,
) : CdkObject(cdkObject) {
  public constructor(metrics: GroupMetric) :
      this(software.amazon.awscdk.services.autoscaling.GroupMetrics(metrics.let(GroupMetric::unwrap))
  )

  public companion object {
    public fun all(): GroupMetrics =
        software.amazon.awscdk.services.autoscaling.GroupMetrics.all().let(GroupMetrics::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics):
        GroupMetrics = GroupMetrics(cdkObject)

    internal fun unwrap(wrapped: GroupMetrics):
        software.amazon.awscdk.services.autoscaling.GroupMetrics = wrapped.cdkObject
  }
}
