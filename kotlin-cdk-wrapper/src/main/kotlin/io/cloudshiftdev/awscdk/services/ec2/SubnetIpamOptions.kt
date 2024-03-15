@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface SubnetIpamOptions {
  public fun allocatedSubnets(): List<AllocatedSubnet>

  @CdkDslMarker
  public interface Builder {
    public fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>)

    public fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetIpamOptions.Builder =
        software.amazon.awscdk.services.ec2.SubnetIpamOptions.builder()

    override fun allocatedSubnets(allocatedSubnets: List<AllocatedSubnet>) {
      cdkBuilder.allocatedSubnets(allocatedSubnets.map(AllocatedSubnet::unwrap))
    }

    override fun allocatedSubnets(vararg allocatedSubnets: AllocatedSubnet): Unit =
        allocatedSubnets(allocatedSubnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.SubnetIpamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions,
  ) : CdkObject(cdkObject), SubnetIpamOptions {
    override fun allocatedSubnets(): List<AllocatedSubnet> =
        unwrap(this).getAllocatedSubnets().map(AllocatedSubnet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetIpamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetIpamOptions):
        SubnetIpamOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetIpamOptions):
        software.amazon.awscdk.services.ec2.SubnetIpamOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SubnetIpamOptions
  }
}
