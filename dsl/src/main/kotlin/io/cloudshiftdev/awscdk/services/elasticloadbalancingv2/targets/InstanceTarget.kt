package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

public open class InstanceTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget,
) : InstanceIdTarget(cdkObject) {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget):
        InstanceTarget = InstanceTarget(cdkObject)

    internal fun unwrap(wrapped: InstanceTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget =
        wrapped.cdkObject
  }
}
