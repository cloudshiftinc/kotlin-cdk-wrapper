@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLinkAssociationProps {
  public fun deviceId(): String

  public fun globalNetworkId(): String

  public fun linkId(): String

  @CdkDslMarker
  public interface Builder {
    public fun deviceId(deviceId: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun linkId(linkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.builder()

    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun linkId(linkId: String) {
      cdkBuilder.linkId(linkId)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps,
  ) : CdkObject(cdkObject), CfnLinkAssociationProps {
    override fun deviceId(): String = unwrap(this).getDeviceId()

    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun linkId(): String = unwrap(this).getLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps):
        CfnLinkAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkAssociationProps):
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps
  }
}
