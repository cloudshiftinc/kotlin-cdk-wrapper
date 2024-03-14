package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject

public open class GroupMetrics internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics,
) : CdkObject(cdkObject) {
  public companion object {
    public fun all(): GroupMetrics =
        software.amazon.awscdk.services.autoscaling.GroupMetrics.all().let(GroupMetrics::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics):
        GroupMetrics = GroupMetrics(cdkObject)

    internal fun unwrap(wrapped: GroupMetrics):
        software.amazon.awscdk.services.autoscaling.GroupMetrics = wrapped.cdkObject
  }
}
