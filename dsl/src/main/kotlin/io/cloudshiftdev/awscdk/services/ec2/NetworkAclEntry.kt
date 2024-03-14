package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkAclEntry internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.NetworkAclEntry,
) : Resource(cdkObject), INetworkAclEntry {
  public override fun networkAcl(): INetworkAcl =
      unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  public interface Builder {
    public fun cidr(cidr: AclCidr)

    public fun direction(direction: TrafficDirection)

    public fun networkAcl(networkAcl: INetworkAcl)

    public fun networkAclEntryName(networkAclEntryName: String)

    public fun ruleAction(ruleAction: Action)

    public fun ruleNumber(ruleNumber: Number)

    public fun traffic(traffic: AclTraffic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAclEntry.Builder =
        software.amazon.awscdk.services.ec2.NetworkAclEntry.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAclEntry = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
