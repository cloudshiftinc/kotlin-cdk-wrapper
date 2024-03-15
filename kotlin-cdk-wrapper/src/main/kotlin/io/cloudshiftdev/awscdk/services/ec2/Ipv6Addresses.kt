@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * An abstract Provider of Ipv6Addresses.
 *
 * Note this is specific to the IPv6 CIDR.
 */
public open class Ipv6Addresses internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Ipv6Addresses,
) : CdkObject(cdkObject) {
  public companion object {
    public fun amazonProvided(): IIpv6Addresses =
        software.amazon.awscdk.services.ec2.Ipv6Addresses.amazonProvided().let(IIpv6Addresses::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Ipv6Addresses): Ipv6Addresses =
        Ipv6Addresses(cdkObject)

    internal fun unwrap(wrapped: Ipv6Addresses): software.amazon.awscdk.services.ec2.Ipv6Addresses =
        wrapped.cdkObject
  }
}
