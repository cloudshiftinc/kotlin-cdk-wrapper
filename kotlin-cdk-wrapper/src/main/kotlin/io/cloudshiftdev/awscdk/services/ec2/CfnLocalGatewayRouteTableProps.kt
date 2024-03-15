@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocalGatewayRouteTableProps {
  public fun localGatewayId(): String

  public fun mode(): String? = unwrap(this).getMode()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun localGatewayId(localGatewayId: String)

    public fun mode(mode: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps.builder()

    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps,
  ) : CdkObject(cdkObject), CfnLocalGatewayRouteTableProps {
    override fun localGatewayId(): String = unwrap(this).getLocalGatewayId()

    override fun mode(): String? = unwrap(this).getMode()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocalGatewayRouteTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps):
        CfnLocalGatewayRouteTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps
  }
}
