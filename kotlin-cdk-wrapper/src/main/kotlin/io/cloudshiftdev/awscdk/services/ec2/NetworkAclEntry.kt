@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an entry in a Network ACL table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AclCidr aclCidr;
 * AclTraffic aclTraffic;
 * NetworkAcl networkAcl;
 * NetworkAclEntry networkAclEntry = NetworkAclEntry.Builder.create(this, "MyNetworkAclEntry")
 * .cidr(aclCidr)
 * .networkAcl(networkAcl)
 * .ruleNumber(123)
 * .traffic(aclTraffic)
 * // the properties below are optional
 * .direction(TrafficDirection.EGRESS)
 * .networkAclEntryName("networkAclEntryName")
 * .ruleAction(Action.ALLOW)
 * .build();
 * ```
 */
public open class NetworkAclEntry internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntry,
) : Resource(cdkObject), INetworkAclEntry {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkAclEntryProps,
  ) :
      this(software.amazon.awscdk.services.ec2.NetworkAclEntry(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(NetworkAclEntryProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkAclEntryProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkAclEntryProps(props)
  )

  /**
   * The network ACL.
   */
  public override fun networkAcl(): INetworkAcl =
      unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.NetworkAclEntry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CIDR range to allow or deny.
     *
     * @param cidr The CIDR range to allow or deny. 
     */
    public fun cidr(cidr: AclCidr)

    /**
     * Traffic direction, with respect to the subnet, this rule applies to.
     *
     * Default: TrafficDirection.INGRESS
     *
     * @param direction Traffic direction, with respect to the subnet, this rule applies to. 
     */
    public fun direction(direction: TrafficDirection)

    /**
     * The network ACL this entry applies to.
     *
     * @param networkAcl The network ACL this entry applies to. 
     */
    public fun networkAcl(networkAcl: INetworkAcl)

    /**
     * The name of the NetworkAclEntry.
     *
     * It is not recommended to use an explicit group name.
     *
     * Default: If you don't specify a NetworkAclName, AWS CloudFormation generates a
     * unique physical ID and uses that ID for the group name.
     *
     * @param networkAclEntryName The name of the NetworkAclEntry. 
     */
    public fun networkAclEntryName(networkAclEntryName: String)

    /**
     * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny".
     *
     * Any traffic that is not explicitly allowed is automatically denied in a custom
     * ACL, all traffic is automatically allowed in a default ACL.
     *
     * Default: ALLOW
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
     * "allow" or "deny". 
     */
    public fun ruleAction(ruleAction: Action)

    /**
     * Rule number to assign to the entry, such as 100.
     *
     * ACL entries are processed in ascending order by rule number.
     * Entries can't use the same rule number unless one is an egress rule and the other is an
     * ingress rule.
     *
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     */
    public fun ruleNumber(ruleNumber: Number)

    /**
     * What kind of traffic this ACL rule applies to.
     *
     * @param traffic What kind of traffic this ACL rule applies to. 
     */
    public fun traffic(traffic: AclTraffic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAclEntry.Builder =
        software.amazon.awscdk.services.ec2.NetworkAclEntry.Builder.create(scope, id)

    /**
     * The CIDR range to allow or deny.
     *
     * @param cidr The CIDR range to allow or deny. 
     */
    override fun cidr(cidr: AclCidr) {
      cdkBuilder.cidr(cidr.let(AclCidr::unwrap))
    }

    /**
     * Traffic direction, with respect to the subnet, this rule applies to.
     *
     * Default: TrafficDirection.INGRESS
     *
     * @param direction Traffic direction, with respect to the subnet, this rule applies to. 
     */
    override fun direction(direction: TrafficDirection) {
      cdkBuilder.direction(direction.let(TrafficDirection::unwrap))
    }

    /**
     * The network ACL this entry applies to.
     *
     * @param networkAcl The network ACL this entry applies to. 
     */
    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
    }

    /**
     * The name of the NetworkAclEntry.
     *
     * It is not recommended to use an explicit group name.
     *
     * Default: If you don't specify a NetworkAclName, AWS CloudFormation generates a
     * unique physical ID and uses that ID for the group name.
     *
     * @param networkAclEntryName The name of the NetworkAclEntry. 
     */
    override fun networkAclEntryName(networkAclEntryName: String) {
      cdkBuilder.networkAclEntryName(networkAclEntryName)
    }

    /**
     * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny".
     *
     * Any traffic that is not explicitly allowed is automatically denied in a custom
     * ACL, all traffic is automatically allowed in a default ACL.
     *
     * Default: ALLOW
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
     * "allow" or "deny". 
     */
    override fun ruleAction(ruleAction: Action) {
      cdkBuilder.ruleAction(ruleAction.let(Action::unwrap))
    }

    /**
     * Rule number to assign to the entry, such as 100.
     *
     * ACL entries are processed in ascending order by rule number.
     * Entries can't use the same rule number unless one is an egress rule and the other is an
     * ingress rule.
     *
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     */
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    /**
     * What kind of traffic this ACL rule applies to.
     *
     * @param traffic What kind of traffic this ACL rule applies to. 
     */
    override fun traffic(traffic: AclTraffic) {
      cdkBuilder.traffic(traffic.let(AclTraffic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAclEntry = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkAclEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkAclEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntry):
        NetworkAclEntry = NetworkAclEntry(cdkObject)

    internal fun unwrap(wrapped: NetworkAclEntry):
        software.amazon.awscdk.services.ec2.NetworkAclEntry = wrapped.cdkObject
  }
}
