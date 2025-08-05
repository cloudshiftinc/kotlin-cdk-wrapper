@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class IpAddressType(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.IpAddressType,
) {
  IPV4(software.amazon.awscdk.services.apigatewayv2.IpAddressType.IPV4),
  DUAL_STACK(software.amazon.awscdk.services.apigatewayv2.IpAddressType.DUAL_STACK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IpAddressType):
        IpAddressType = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.IpAddressType.IPV4 -> IpAddressType.IPV4
      software.amazon.awscdk.services.apigatewayv2.IpAddressType.DUAL_STACK ->
          IpAddressType.DUAL_STACK
    }

    internal fun unwrap(wrapped: IpAddressType):
        software.amazon.awscdk.services.apigatewayv2.IpAddressType = wrapped.cdkObject
  }
}
