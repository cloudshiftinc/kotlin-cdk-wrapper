@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayMulticastGroupMember internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrGroupMember(): IResolvable =
      unwrap(this).getAttrGroupMember().let(IResolvable::wrap)

  public open fun attrGroupSource(): IResolvable =
      unwrap(this).getAttrGroupSource().let(IResolvable::wrap)

  public open fun attrMemberType(): String = unwrap(this).getAttrMemberType()

  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  public open fun attrSourceType(): String = unwrap(this).getAttrSourceType()

  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  public open fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

  public open fun groupIpAddress(`value`: String) {
    unwrap(this).setGroupIpAddress(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun transitGatewayMulticastDomainId(): String =
      unwrap(this).getTransitGatewayMulticastDomainId()

  public open fun transitGatewayMulticastDomainId(`value`: String) {
    unwrap(this).setTransitGatewayMulticastDomainId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun groupIpAddress(groupIpAddress: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.Builder.create(scope,
        id)

    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupMember {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastGroupMember(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember):
        CfnTransitGatewayMulticastGroupMember = CfnTransitGatewayMulticastGroupMember(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupMember):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember =
        wrapped.cdkObject
  }
}
