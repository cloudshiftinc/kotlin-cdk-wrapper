package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface PublicSubnetAttributes : SubnetAttributes {
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun ipv4CidrBlock(ipv4CidrBlock: String)

    public fun routeTableId(routeTableId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PublicSubnetAttributes.Builder =
        software.amazon.awscdk.services.ec2.PublicSubnetAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.PublicSubnetAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.PublicSubnetAttributes,
  ) : PublicSubnetAttributes {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun ipv4CidrBlock(): String? = unwrap(this).getIpv4CidrBlock()

    override fun routeTableId(): String? = unwrap(this).getRouteTableId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PublicSubnetAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PublicSubnetAttributes):
        PublicSubnetAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicSubnetAttributes):
        software.amazon.awscdk.services.ec2.PublicSubnetAttributes = (wrapped as Wrapper).cdkObject
  }
}
