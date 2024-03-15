@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class AclCidr internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AclCidr,
) : CdkObject(cdkObject) {
  public open fun toCidrConfig(): AclCidrConfig =
      unwrap(this).toCidrConfig().let(AclCidrConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclCidr,
  ) : AclCidr(cdkObject)

  public companion object {
    public fun anyIpv4(): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.anyIpv4().let(AclCidr::wrap)

    public fun anyIpv6(): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.anyIpv6().let(AclCidr::wrap)

    public fun ipv4(ipv4Cidr: String): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.ipv4(ipv4Cidr).let(AclCidr::wrap)

    public fun ipv6(ipv6Cidr: String): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.ipv6(ipv6Cidr).let(AclCidr::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclCidr): AclCidr =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclCidr): software.amazon.awscdk.services.ec2.AclCidr = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclCidr
  }
}
