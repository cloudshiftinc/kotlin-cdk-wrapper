@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPrivateGraphEndpointProps {
  public fun graphIdentifier(): String

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun graphIdentifier(graphIdentifier: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps.builder()

    override fun graphIdentifier(graphIdentifier: String) {
      cdkBuilder.graphIdentifier(graphIdentifier)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps,
  ) : CdkObject(cdkObject), CfnPrivateGraphEndpointProps {
    override fun graphIdentifier(): String = unwrap(this).getGraphIdentifier()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrivateGraphEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps):
        CfnPrivateGraphEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrivateGraphEndpointProps):
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps
  }
}
