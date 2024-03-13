package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public abstract class AclCidr internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.AclCidr,
) {
  public open fun toCidrConfig(): AclCidrConfig =
      unwrap(this).toCidrConfig().let(AclCidrConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclCidr,
  ) : AclCidr(cdkObject)

  public companion object {
    public open fun anyIpv4(): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.anyIpv4().let(AclCidr::wrap)

    public open fun anyIpv6(): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.anyIpv6().let(AclCidr::wrap)

    public open fun ipv4(ipv4Cidr: String): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.ipv4(ipv4Cidr).let(AclCidr::wrap)

    public open fun ipv6(ipv6Cidr: String): AclCidr =
        software.amazon.awscdk.services.ec2.AclCidr.ipv6(ipv6Cidr).let(AclCidr::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclCidr): AclCidr =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclCidr): software.amazon.awscdk.services.ec2.AclCidr = (wrapped as
        Wrapper).cdkObject
  }
}
