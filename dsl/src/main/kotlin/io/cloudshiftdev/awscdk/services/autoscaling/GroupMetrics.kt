package io.cloudshiftdev.awscdk.services.autoscaling

public open class GroupMetrics internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics,
) {
  public companion object {
    public open fun all(): GroupMetrics =
        software.amazon.awscdk.services.autoscaling.GroupMetrics.all().let(GroupMetrics::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.GroupMetrics):
        GroupMetrics = GroupMetrics(cdkObject)

    internal fun unwrap(wrapped: GroupMetrics):
        software.amazon.awscdk.services.autoscaling.GroupMetrics = wrapped.cdkObject
  }
}
