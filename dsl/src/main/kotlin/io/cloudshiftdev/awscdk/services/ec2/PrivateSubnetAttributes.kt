package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface PrivateSubnetAttributes : SubnetAttributes {
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun ipv4CidrBlock(ipv4CidrBlock: String)

    public fun routeTableId(routeTableId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes.Builder =
        software.amazon.awscdk.services.ec2.PrivateSubnetAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.PrivateSubnetAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes,
  ) : PrivateSubnetAttributes {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun ipv4CidrBlock(): String? = unwrap(this).getIpv4CidrBlock()

    override fun routeTableId(): String? = unwrap(this).getRouteTableId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateSubnetAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrivateSubnetAttributes):
        PrivateSubnetAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateSubnetAttributes):
        software.amazon.awscdk.services.ec2.PrivateSubnetAttributes = (wrapped as Wrapper).cdkObject
  }
}
