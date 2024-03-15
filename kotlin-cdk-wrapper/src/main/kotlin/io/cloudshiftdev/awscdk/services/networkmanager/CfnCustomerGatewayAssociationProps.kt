@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCustomerGatewayAssociationProps {
  public fun customerGatewayArn(): String

  public fun deviceId(): String

  public fun globalNetworkId(): String

  public fun linkId(): String? = unwrap(this).getLinkId()

  @CdkDslMarker
  public interface Builder {
    public fun customerGatewayArn(customerGatewayArn: String)

    public fun deviceId(deviceId: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun linkId(linkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.builder()

    override fun customerGatewayArn(customerGatewayArn: String) {
      cdkBuilder.customerGatewayArn(customerGatewayArn)
    }

    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun linkId(linkId: String) {
      cdkBuilder.linkId(linkId)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps,
  ) : CdkObject(cdkObject), CfnCustomerGatewayAssociationProps {
    override fun customerGatewayArn(): String = unwrap(this).getCustomerGatewayArn()

    override fun deviceId(): String = unwrap(this).getDeviceId()

    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun linkId(): String? = unwrap(this).getLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomerGatewayAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps):
        CfnCustomerGatewayAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGatewayAssociationProps):
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
  }
}
