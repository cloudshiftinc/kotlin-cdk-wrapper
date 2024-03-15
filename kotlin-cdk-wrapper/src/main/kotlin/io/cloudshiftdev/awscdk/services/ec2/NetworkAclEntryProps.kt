@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface NetworkAclEntryProps : CommonNetworkAclEntryOptions {
  public fun networkAcl(): INetworkAcl

  @CdkDslMarker
  public interface Builder {
    public fun cidr(cidr: AclCidr)

    public fun direction(direction: TrafficDirection)

    public fun networkAcl(networkAcl: INetworkAcl)

    public fun networkAclEntryName(networkAclEntryName: String)

    public fun ruleAction(ruleAction: Action)

    public fun ruleNumber(ruleNumber: Number)

    public fun traffic(traffic: AclTraffic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAclEntryProps.Builder =
        software.amazon.awscdk.services.ec2.NetworkAclEntryProps.builder()

    override fun cidr(cidr: AclCidr) {
      cdkBuilder.cidr(cidr.let(AclCidr::unwrap))
    }

    override fun direction(direction: TrafficDirection) {
      cdkBuilder.direction(direction.let(TrafficDirection::unwrap))
    }

    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAclEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntryProps,
  ) : CdkObject(cdkObject), NetworkAclEntryProps {
    override fun cidr(): AclCidr = unwrap(this).getCidr().let(AclCidr::wrap)

    override fun direction(): TrafficDirection? =
        unwrap(this).getDirection()?.let(TrafficDirection::wrap)

    override fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

    override fun networkAclEntryName(): String? = unwrap(this).getNetworkAclEntryName()

    override fun ruleAction(): Action? = unwrap(this).getRuleAction()?.let(Action::wrap)

    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()

    override fun traffic(): AclTraffic = unwrap(this).getTraffic().let(AclTraffic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkAclEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntryProps):
        NetworkAclEntryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkAclEntryProps):
        software.amazon.awscdk.services.ec2.NetworkAclEntryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.NetworkAclEntryProps
  }
}
