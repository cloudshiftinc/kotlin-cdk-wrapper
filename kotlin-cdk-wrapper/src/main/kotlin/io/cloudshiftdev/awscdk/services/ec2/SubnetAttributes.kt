@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SubnetAttributes {
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun ipv4CidrBlock(): String? = unwrap(this).getIpv4CidrBlock()

  public fun routeTableId(): String? = unwrap(this).getRouteTableId()

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun ipv4CidrBlock(ipv4CidrBlock: String)

    public fun routeTableId(routeTableId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetAttributes.Builder =
        software.amazon.awscdk.services.ec2.SubnetAttributes.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun ipv4CidrBlock(ipv4CidrBlock: String) {
      cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetAttributes,
  ) : CdkObject(cdkObject), SubnetAttributes {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun ipv4CidrBlock(): String? = unwrap(this).getIpv4CidrBlock()

    override fun routeTableId(): String? = unwrap(this).getRouteTableId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetAttributes):
        SubnetAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetAttributes):
        software.amazon.awscdk.services.ec2.SubnetAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SubnetAttributes
  }
}
