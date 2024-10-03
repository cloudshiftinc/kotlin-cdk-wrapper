@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

public enum class LoadBalancerIpAddressType(
  private val cdkObject: software.amazon.awscdk.cxapi.LoadBalancerIpAddressType,
) {
  IPV4(software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.IPV4),
  DUAL_STACK(software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.DUAL_STACK),
  DUAL_STACK_WITHOUT_PUBLIC_IPV4(software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.LoadBalancerIpAddressType):
        LoadBalancerIpAddressType = when (cdkObject) {
      software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.IPV4 -> LoadBalancerIpAddressType.IPV4
      software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.DUAL_STACK ->
          LoadBalancerIpAddressType.DUAL_STACK
      software.amazon.awscdk.cxapi.LoadBalancerIpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4 ->
          LoadBalancerIpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4
    }

    internal fun unwrap(wrapped: LoadBalancerIpAddressType):
        software.amazon.awscdk.cxapi.LoadBalancerIpAddressType = wrapped.cdkObject
  }
}
