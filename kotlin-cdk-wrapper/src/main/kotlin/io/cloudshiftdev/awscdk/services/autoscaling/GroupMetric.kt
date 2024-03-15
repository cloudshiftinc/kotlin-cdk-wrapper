@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class GroupMetric internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetric,
) : CdkObject(cdkObject) {
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val DESIRED_CAPACITY: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.DESIRED_CAPACITY)

    public val IN_SERVICE_INSTANCES: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.IN_SERVICE_INSTANCES)

    public val MAX_SIZE: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.MAX_SIZE)

    public val MIN_SIZE: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.MIN_SIZE)

    public val PENDING_INSTANCES: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.PENDING_INSTANCES)

    public val STANDBY_INSTANCES: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.STANDBY_INSTANCES)

    public val TERMINATING_INSTANCES: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.TERMINATING_INSTANCES)

    public val TOTAL_INSTANCES: GroupMetric =
        GroupMetric.wrap(software.amazon.awscdk.services.autoscaling.GroupMetric.TOTAL_INSTANCES)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetric):
        GroupMetric = GroupMetric(cdkObject)

    internal fun unwrap(wrapped: GroupMetric):
        software.amazon.awscdk.services.autoscaling.GroupMetric = wrapped.cdkObject
  }
}
