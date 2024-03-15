@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface VpcSubnet {
  public fun availabilityZone(): String

  public fun cidr(): String? = unwrap(this).getCidr()

  public fun routeTableId(): String

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun cidr(cidr: String)

    public fun routeTableId(routeTableId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcSubnet.Builder =
        software.amazon.awscdk.cxapi.VpcSubnet.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcSubnet = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcSubnet,
  ) : CdkObject(cdkObject), VpcSubnet {
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun cidr(): String? = unwrap(this).getCidr()

    override fun routeTableId(): String = unwrap(this).getRouteTableId()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcSubnet {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcSubnet): VpcSubnet =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcSubnet): software.amazon.awscdk.cxapi.VpcSubnet = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.VpcSubnet
  }
}
