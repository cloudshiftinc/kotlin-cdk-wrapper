@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to create NetworkAclEntry.
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
 * NetworkAclEntryProps networkAclEntryProps = NetworkAclEntryProps.builder()
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
public interface NetworkAclEntryProps : CommonNetworkAclEntryOptions {
  /**
   * The network ACL this entry applies to.
   */
  public fun networkAcl(): INetworkAcl

  /**
   * A builder for [NetworkAclEntryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr The CIDR range to allow or deny. 
     */
    public fun cidr(cidr: AclCidr)

    /**
     * @param direction Traffic direction, with respect to the subnet, this rule applies to.
     */
    public fun direction(direction: TrafficDirection)

    /**
     * @param networkAcl The network ACL this entry applies to. 
     */
    public fun networkAcl(networkAcl: INetworkAcl)

    /**
     * @param networkAclEntryName The name of the NetworkAclEntry.
     * It is not recommended to use an explicit group name.
     */
    public fun networkAclEntryName(networkAclEntryName: String)

    /**
     * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
     * "allow" or "deny".
     * Any traffic that is not explicitly allowed is automatically denied in a custom
     * ACL, all traffic is automatically allowed in a default ACL.
     */
    public fun ruleAction(ruleAction: Action)

    /**
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     * ACL entries are processed in ascending order by rule number.
     * Entries can't use the same rule number unless one is an egress rule and the other is an
     * ingress rule.
     */
    public fun ruleNumber(ruleNumber: Number)

    /**
     * @param traffic What kind of traffic this ACL rule applies to. 
     */
    public fun traffic(traffic: AclTraffic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAclEntryProps.Builder =
        software.amazon.awscdk.services.ec2.NetworkAclEntryProps.builder()

    /**
     * @param cidr The CIDR range to allow or deny. 
     */
    override fun cidr(cidr: AclCidr) {
      cdkBuilder.cidr(cidr.let(AclCidr::unwrap))
    }

    /**
     * @param direction Traffic direction, with respect to the subnet, this rule applies to.
     */
    override fun direction(direction: TrafficDirection) {
      cdkBuilder.direction(direction.let(TrafficDirection::unwrap))
    }

    /**
     * @param networkAcl The network ACL this entry applies to. 
     */
    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
    }

    /**
     * @param networkAclEntryName The name of the NetworkAclEntry.
     * It is not recommended to use an explicit group name.
     */
    override fun networkAclEntryName(networkAclEntryName: String) {
      cdkBuilder.networkAclEntryName(networkAclEntryName)
    }

    /**
     * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
     * "allow" or "deny".
     * Any traffic that is not explicitly allowed is automatically denied in a custom
     * ACL, all traffic is automatically allowed in a default ACL.
     */
    override fun ruleAction(ruleAction: Action) {
      cdkBuilder.ruleAction(ruleAction.let(Action::unwrap))
    }

    /**
     * @param ruleNumber Rule number to assign to the entry, such as 100. 
     * ACL entries are processed in ascending order by rule number.
     * Entries can't use the same rule number unless one is an egress rule and the other is an
     * ingress rule.
     */
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    /**
     * @param traffic What kind of traffic this ACL rule applies to. 
     */
    override fun traffic(traffic: AclTraffic) {
      cdkBuilder.traffic(traffic.let(AclTraffic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAclEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntryProps,
  ) : CdkObject(cdkObject), NetworkAclEntryProps {
    /**
     * The CIDR range to allow or deny.
     */
    override fun cidr(): AclCidr = unwrap(this).getCidr().let(AclCidr::wrap)

    /**
     * Traffic direction, with respect to the subnet, this rule applies to.
     *
     * Default: TrafficDirection.INGRESS
     */
    override fun direction(): TrafficDirection? =
        unwrap(this).getDirection()?.let(TrafficDirection::wrap)

    /**
     * The network ACL this entry applies to.
     */
    override fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

    /**
     * The name of the NetworkAclEntry.
     *
     * It is not recommended to use an explicit group name.
     *
     * Default: If you don't specify a NetworkAclName, AWS CloudFormation generates a
     * unique physical ID and uses that ID for the group name.
     */
    override fun networkAclEntryName(): String? = unwrap(this).getNetworkAclEntryName()

    /**
     * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny".
     *
     * Any traffic that is not explicitly allowed is automatically denied in a custom
     * ACL, all traffic is automatically allowed in a default ACL.
     *
     * Default: ALLOW
     */
    override fun ruleAction(): Action? = unwrap(this).getRuleAction()?.let(Action::wrap)

    /**
     * Rule number to assign to the entry, such as 100.
     *
     * ACL entries are processed in ascending order by rule number.
     * Entries can't use the same rule number unless one is an egress rule and the other is an
     * ingress rule.
     */
    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()

    /**
     * What kind of traffic this ACL rule applies to.
     */
    override fun traffic(): AclTraffic = unwrap(this).getTraffic().let(AclTraffic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkAclEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntryProps):
        NetworkAclEntryProps = CdkObjectWrappers.wrap(cdkObject) as NetworkAclEntryProps

    internal fun unwrap(wrapped: NetworkAclEntryProps):
        software.amazon.awscdk.services.ec2.NetworkAclEntryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.NetworkAclEntryProps
  }
}
