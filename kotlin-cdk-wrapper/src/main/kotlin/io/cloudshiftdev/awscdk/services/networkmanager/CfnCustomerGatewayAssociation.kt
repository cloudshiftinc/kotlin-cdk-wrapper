@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomerGatewayAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun customerGatewayArn(): String = unwrap(this).getCustomerGatewayArn()

  public open fun customerGatewayArn(`value`: String) {
    unwrap(this).setCustomerGatewayArn(`value`)
  }

  public open fun deviceId(): String = unwrap(this).getDeviceId()

  public open fun deviceId(`value`: String) {
    unwrap(this).setDeviceId(`value`)
  }

  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun linkId(): String? = unwrap(this).getLinkId()

  public open fun linkId(`value`: String) {
    unwrap(this).setLinkId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun customerGatewayArn(customerGatewayArn: String)

    public fun deviceId(deviceId: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun linkId(linkId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomerGatewayAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomerGatewayAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation):
        CfnCustomerGatewayAssociation = CfnCustomerGatewayAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGatewayAssociation):
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation =
        wrapped.cdkObject
  }
}
