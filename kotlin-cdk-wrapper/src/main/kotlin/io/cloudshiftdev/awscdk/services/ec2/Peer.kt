@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Peer object factories (to be used in Security Group management).
 *
 * The static methods on this object can be used to create peer objects
 * which represent a connection partner in Security Group rules.
 *
 * Use this object if you need to represent connection partners using plain IP
 * addresses, or a prefix list ID.
 *
 * If you want to address a connection partner by Security Group, you can just
 * use the Security Group (or the construct that contains a Security Group)
 * directly, as it already implements `IPeer`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .clusterName("myCluster")
 * .kafkaVersion(KafkaVersion.V2_8_1)
 * .vpc(vpc)
 * .build();
 * cluster.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.tcp(2181));
 * cluster.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.tcp(9094));
 * ```
 */
public open class Peer(
  cdkObject: software.amazon.awscdk.services.ec2.Peer,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.Peer()
  )

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
        as software.amazon.awscdk.services.ec2.Peer
  }
}
