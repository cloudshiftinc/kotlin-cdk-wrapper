@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class TargetGroupLoadBalancingAlgorithmType(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType,
) {
  ROUND_ROBIN(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN),
  LEAST_OUTSTANDING_REQUESTS(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.LEAST_OUTSTANDING_REQUESTS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType):
        TargetGroupLoadBalancingAlgorithmType = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN ->
          TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType.LEAST_OUTSTANDING_REQUESTS ->
          TargetGroupLoadBalancingAlgorithmType.LEAST_OUTSTANDING_REQUESTS
    }

    internal fun unwrap(wrapped: TargetGroupLoadBalancingAlgorithmType):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType
        = wrapped.cdkObject
  }
}
