package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CommonNetworkAclEntryOptions {
  /**
   * The CIDR range to allow or deny.
   */
  public fun cidr(): AclCidr

  /**
   * Traffic direction, with respect to the subnet, this rule applies to.
   *
   * Default: TrafficDirection.INGRESS
   */
  public fun direction(): TrafficDirection? =
      unwrap(this).getDirection()?.let(TrafficDirection::wrap)

  /**
   * The name of the NetworkAclEntry.
   *
   * It is not recommended to use an explicit group name.
   *
   * Default: If you don't specify a NetworkAclName, AWS CloudFormation generates a
   * unique physical ID and uses that ID for the group name.
   */
  public fun networkAclEntryName(): String? = unwrap(this).getNetworkAclEntryName()

  /**
   * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny".
   *
   * Any traffic that is not explicitly allowed is automatically denied in a custom
   * ACL, all traffic is automatically allowed in a default ACL.
   *
   * Default: ALLOW
   */
  public fun ruleAction(): Action? = unwrap(this).getRuleAction()?.let(Action::wrap)

  /**
   * Rule number to assign to the entry, such as 100.
   *
   * ACL entries are processed in ascending order by rule number.
   * Entries can't use the same rule number unless one is an egress rule and the other is an ingress
   * rule.
   */
  public fun ruleNumber(): Number

  /**
   * What kind of traffic this ACL rule applies to.
   */
  public fun traffic(): AclTraffic

  /**
   * A builder for [CommonNetworkAclEntryOptions]
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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.Builder
        = software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions,
  ) : CommonNetworkAclEntryOptions {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonNetworkAclEntryOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions):
        CommonNetworkAclEntryOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonNetworkAclEntryOptions):
        software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions = (wrapped as
        Wrapper).cdkObject
  }
}
