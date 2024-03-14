package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class TargetType(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetType,
) {
  INSTANCE(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.INSTANCE),
  IP(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.IP),
  LAMBDA(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.LAMBDA),
  ALB(software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.ALB),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetType):
        TargetType = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.INSTANCE ->
          TargetType.INSTANCE
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.IP -> TargetType.IP
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.LAMBDA -> TargetType.LAMBDA
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetType.ALB -> TargetType.ALB
    }

    internal fun unwrap(wrapped: TargetType):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetType = wrapped.cdkObject
  }
}
