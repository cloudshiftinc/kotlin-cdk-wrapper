package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Peer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Peer,
) : CdkObject(cdkObject) {
  public companion object {
    public fun anyIpv4(): IPeer =
        software.amazon.awscdk.services.ec2.Peer.anyIpv4().let(IPeer::wrap)

    public fun anyIpv6(): IPeer =
        software.amazon.awscdk.services.ec2.Peer.anyIpv6().let(IPeer::wrap)

    public fun ipv4(cidrIp: String): IPeer =
        software.amazon.awscdk.services.ec2.Peer.ipv4(cidrIp).let(IPeer::wrap)

    public fun ipv6(cidrIp: String): IPeer =
        software.amazon.awscdk.services.ec2.Peer.ipv6(cidrIp).let(IPeer::wrap)

    public fun prefixList(prefixListId: String): IPeer =
        software.amazon.awscdk.services.ec2.Peer.prefixList(prefixListId).let(IPeer::wrap)

    public fun securityGroupId(securityGroupId: String): IPeer =
        software.amazon.awscdk.services.ec2.Peer.securityGroupId(securityGroupId).let(IPeer::wrap)

    public fun securityGroupId(securityGroupId: String, sourceSecurityGroupOwnerId: String): IPeer =
        software.amazon.awscdk.services.ec2.Peer.securityGroupId(securityGroupId,
        sourceSecurityGroupOwnerId).let(IPeer::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Peer): Peer = Peer(cdkObject)

    internal fun unwrap(wrapped: Peer): software.amazon.awscdk.services.ec2.Peer = wrapped.cdkObject
  }
}
