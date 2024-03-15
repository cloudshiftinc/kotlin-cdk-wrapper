@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface PrivateSubnetProps : SubnetProps {
  @CdkDslMarker
  public interface Builder {
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun cidrBlock(cidrBlock: String)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnetProps.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnetProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetProps,
  ) : CdkObject(cdkObject), PrivateSubnetProps {
    override fun assignIpv6AddressOnCreation(): Boolean? =
        unwrap(this).getAssignIpv6AddressOnCreation()

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun cidrBlock(): String = unwrap(this).getCidrBlock()

    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    override fun mapPublicIpOnLaunch(): Boolean? = unwrap(this).getMapPublicIpOnLaunch()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateSubnetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetProps):
        PrivateSubnetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnetProps):
        software.amazon.awscdk.services.ec2.PrivateSubnetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.PrivateSubnetProps
  }
}
