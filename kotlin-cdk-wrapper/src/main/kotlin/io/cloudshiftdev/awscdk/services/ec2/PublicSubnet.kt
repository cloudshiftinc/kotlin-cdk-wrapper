@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PublicSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.PublicSubnet,
) : Subnet(cdkObject), IPublicSubnet {
  public open fun addNatGateway(): CfnNatGateway =
      unwrap(this).addNatGateway().let(CfnNatGateway::wrap)

  public open fun addNatGateway(eipAllocationId: String): CfnNatGateway =
      unwrap(this).addNatGateway(eipAllocationId).let(CfnNatGateway::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun cidrBlock(cidrBlock: String)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PublicSubnet.Builder =
        software.amazon.awscdk.services.ec2.PublicSubnet.Builder.create(scope, id)

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PublicSubnet = cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicSubnetAttributes,
    ): IPublicSubnet =
        software.amazon.awscdk.services.ec2.PublicSubnet.fromPublicSubnetAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PublicSubnetAttributes::unwrap)).let(IPublicSubnet::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62d4fc116dffe5100e12879b93f7113e28393ae8f102cf16abe1ca548805c7ef")
    public fun fromPublicSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicSubnetAttributes.Builder.() -> Unit,
    ): IPublicSubnet = fromPublicSubnetAttributes(scope, id, PublicSubnetAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PublicSubnet): PublicSubnet =
        PublicSubnet(cdkObject)

    internal fun unwrap(wrapped: PublicSubnet): software.amazon.awscdk.services.ec2.PublicSubnet =
        wrapped.cdkObject
  }
}
