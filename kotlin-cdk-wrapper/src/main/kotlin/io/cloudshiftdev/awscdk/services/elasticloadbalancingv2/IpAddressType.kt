@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class IpAddressType(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType,
) {
  IPV4(software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.IPV4),
  DUAL_STACK(software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.DUAL_STACK),
  DUAL_STACK_WITHOUT_PUBLIC_IPV4(software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType):
        IpAddressType = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.IPV4 ->
          IpAddressType.IPV4
      software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.DUAL_STACK ->
          IpAddressType.DUAL_STACK
      software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4 ->
          IpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4
    }

    internal fun unwrap(wrapped: IpAddressType):
        software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType = wrapped.cdkObject
  }
}
