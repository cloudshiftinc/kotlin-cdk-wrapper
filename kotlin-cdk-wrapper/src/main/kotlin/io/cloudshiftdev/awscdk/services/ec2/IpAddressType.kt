@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class IpAddressType(
  private val cdkObject: software.amazon.awscdk.services.ec2.IpAddressType,
) {
  IPV4(software.amazon.awscdk.services.ec2.IpAddressType.IPV4),
  IPV6(software.amazon.awscdk.services.ec2.IpAddressType.IPV6),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IpAddressType): IpAddressType =
        when (cdkObject) {
      software.amazon.awscdk.services.ec2.IpAddressType.IPV4 -> IpAddressType.IPV4
      software.amazon.awscdk.services.ec2.IpAddressType.IPV6 -> IpAddressType.IPV6
    }

    internal fun unwrap(wrapped: IpAddressType): software.amazon.awscdk.services.ec2.IpAddressType =
        wrapped.cdkObject
  }
}
