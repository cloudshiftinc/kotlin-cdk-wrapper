@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class TargetGroupIpAddressType(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType,
) {
  IPV4(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType.IPV4),
  IPV6(software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType.IPV6),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType):
        TargetGroupIpAddressType = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType.IPV4 ->
          TargetGroupIpAddressType.IPV4
      software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType.IPV6 ->
          TargetGroupIpAddressType.IPV6
    }

    internal fun unwrap(wrapped: TargetGroupIpAddressType):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupIpAddressType =
        wrapped.cdkObject
  }
}
