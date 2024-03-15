@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpcSubnetGroup {
  public fun name(): String

  public fun subnets(): List<VpcSubnet>

  public fun type(): VpcSubnetGroupType

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun subnets(subnets: List<VpcSubnet>)

    public fun subnets(vararg subnets: VpcSubnet)

    public fun type(type: VpcSubnetGroupType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.VpcSubnetGroup.Builder =
        software.amazon.awscdk.cxapi.VpcSubnetGroup.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun subnets(subnets: List<VpcSubnet>) {
      cdkBuilder.subnets(subnets.map(VpcSubnet::unwrap))
    }

    override fun subnets(vararg subnets: VpcSubnet): Unit = subnets(subnets.toList())

    override fun type(type: VpcSubnetGroupType) {
      cdkBuilder.type(type.let(VpcSubnetGroupType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.VpcSubnetGroup = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroup,
  ) : CdkObject(cdkObject), VpcSubnetGroup {
    override fun name(): String = unwrap(this).getName()

    override fun subnets(): List<VpcSubnet> = unwrap(this).getSubnets().map(VpcSubnet::wrap)

    override fun type(): VpcSubnetGroupType = unwrap(this).getType().let(VpcSubnetGroupType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcSubnetGroup {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.VpcSubnetGroup): VpcSubnetGroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcSubnetGroup): software.amazon.awscdk.cxapi.VpcSubnetGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cxapi.VpcSubnetGroup
  }
}
