@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class VpcEndpointIpAddressType(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType,
) {
  IPV4(software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.IPV4),
  IPV6(software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.IPV6),
  DUALSTACK(software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.DUALSTACK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType):
        VpcEndpointIpAddressType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.IPV4 ->
          VpcEndpointIpAddressType.IPV4
      software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.IPV6 ->
          VpcEndpointIpAddressType.IPV6
      software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType.DUALSTACK ->
          VpcEndpointIpAddressType.DUALSTACK
    }

    internal fun unwrap(wrapped: VpcEndpointIpAddressType):
        software.amazon.awscdk.services.ec2.VpcEndpointIpAddressType = wrapped.cdkObject
  }
}
