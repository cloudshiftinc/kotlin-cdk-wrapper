@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CreateIpv6CidrBlocksRequest {
  public fun ipv6SelectedCidr(): String

  public fun sizeMask(): String? = unwrap(this).getSizeMask()

  public fun subnetCount(): Number

  @CdkDslMarker
  public interface Builder {
    public fun ipv6SelectedCidr(ipv6SelectedCidr: String)

    public fun sizeMask(sizeMask: String)

    public fun subnetCount(subnetCount: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest.Builder
        = software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest.builder()

    override fun ipv6SelectedCidr(ipv6SelectedCidr: String) {
      cdkBuilder.ipv6SelectedCidr(ipv6SelectedCidr)
    }

    override fun sizeMask(sizeMask: String) {
      cdkBuilder.sizeMask(sizeMask)
    }

    override fun subnetCount(subnetCount: Number) {
      cdkBuilder.subnetCount(subnetCount)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest,
  ) : CdkObject(cdkObject), CreateIpv6CidrBlocksRequest {
    override fun ipv6SelectedCidr(): String = unwrap(this).getIpv6SelectedCidr()

    override fun sizeMask(): String? = unwrap(this).getSizeMask()

    override fun subnetCount(): Number = unwrap(this).getSubnetCount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CreateIpv6CidrBlocksRequest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest):
        CreateIpv6CidrBlocksRequest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CreateIpv6CidrBlocksRequest):
        software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest
  }
}
