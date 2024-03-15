@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PrivateSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnet,
) : Subnet(cdkObject), IPrivateSubnet {
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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnet.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnet.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnet = cdkBuilder.build()
  }

  public companion object {
    public fun fromPrivateSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateSubnetAttributes,
    ): IPrivateSubnet =
        software.amazon.awscdk.services.ec2.PrivateSubnet.fromPrivateSubnetAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PrivateSubnetAttributes::unwrap)).let(IPrivateSubnet::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24d7ca2097dfebaf7ccfe38c8086fab72cd4d0c9e67486c526078a5dfdb71435")
    public fun fromPrivateSubnetAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PrivateSubnetAttributes.Builder.() -> Unit,
    ): IPrivateSubnet = fromPrivateSubnetAttributes(scope, id, PrivateSubnetAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnet): PrivateSubnet =
        PrivateSubnet(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnet): software.amazon.awscdk.services.ec2.PrivateSubnet =
        wrapped.cdkObject
  }
}
