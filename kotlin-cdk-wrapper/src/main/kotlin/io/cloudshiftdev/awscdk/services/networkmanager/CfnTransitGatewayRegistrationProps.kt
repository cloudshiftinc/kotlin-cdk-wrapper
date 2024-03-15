@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayRegistrationProps {
  public fun globalNetworkId(): String

  public fun transitGatewayArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun globalNetworkId(globalNetworkId: String)

    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.builder()

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRegistrationProps {
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps):
        CfnTransitGatewayRegistrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRegistrationProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps
  }
}
