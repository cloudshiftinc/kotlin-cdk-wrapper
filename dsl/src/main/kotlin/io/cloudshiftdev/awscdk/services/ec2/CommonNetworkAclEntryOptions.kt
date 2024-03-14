package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CommonNetworkAclEntryOptions {
  public fun cidr(): AclCidr

  public fun direction(): TrafficDirection? =
      unwrap(this).getDirection()?.let(TrafficDirection::wrap)

  public fun networkAclEntryName(): String? = unwrap(this).getNetworkAclEntryName()

  public fun ruleAction(): Action? = unwrap(this).getRuleAction()?.let(Action::wrap)

  public fun ruleNumber(): Number

  public fun traffic(): AclTraffic

  public interface Builder {
    public fun cidr(cidr: AclCidr)

    public fun direction(direction: TrafficDirection)

    public fun networkAclEntryName(networkAclEntryName: String)

    public fun ruleAction(ruleAction: Action)

    public fun ruleNumber(ruleNumber: Number)

    public fun traffic(traffic: AclTraffic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.Builder
        = software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.builder()

    override fun cidr(cidr: AclCidr) {
      cdkBuilder.cidr(cidr.let(AclCidr::unwrap))
    }

    override fun direction(direction: TrafficDirection) {
      cdkBuilder.direction(direction.let(TrafficDirection::unwrap))
    }

    override fun networkAclEntryName(networkAclEntryName: String) {
      cdkBuilder.networkAclEntryName(networkAclEntryName)
    }

    override fun ruleAction(ruleAction: Action) {
      cdkBuilder.ruleAction(ruleAction.let(Action::unwrap))
    }

    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    override fun traffic(traffic: AclTraffic) {
      cdkBuilder.traffic(traffic.let(AclTraffic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions,
  ) : CommonNetworkAclEntryOptions {
    override fun cidr(): AclCidr = unwrap(this).getCidr().let(AclCidr::wrap)

    override fun direction(): TrafficDirection? =
        unwrap(this).getDirection()?.let(TrafficDirection::wrap)

    override fun networkAclEntryName(): String? = unwrap(this).getNetworkAclEntryName()

    override fun ruleAction(): Action? = unwrap(this).getRuleAction()?.let(Action::wrap)

    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()

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
