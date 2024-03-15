@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTransitGatewayPeeringProps {
  public fun coreNetworkId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps.builder()

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayPeeringProps {
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayPeeringProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps):
        CfnTransitGatewayPeeringProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
  }
}
