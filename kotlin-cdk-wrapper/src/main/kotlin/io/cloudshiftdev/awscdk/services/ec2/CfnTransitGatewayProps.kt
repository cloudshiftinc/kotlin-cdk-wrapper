@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTransitGatewayProps {
  public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  public fun associationDefaultRouteTableId(): String? =
      unwrap(this).getAssociationDefaultRouteTableId()

  public fun autoAcceptSharedAttachments(): String? = unwrap(this).getAutoAcceptSharedAttachments()

  public fun defaultRouteTableAssociation(): String? =
      unwrap(this).getDefaultRouteTableAssociation()

  public fun defaultRouteTablePropagation(): String? =
      unwrap(this).getDefaultRouteTablePropagation()

  public fun description(): String? = unwrap(this).getDescription()

  public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

  public fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

  public fun propagationDefaultRouteTableId(): String? =
      unwrap(this).getPropagationDefaultRouteTableId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayCidrBlocks(): List<String> = unwrap(this).getTransitGatewayCidrBlocks()
      ?: emptyList()

  public fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()

  @CdkDslMarker
  public interface Builder {
    public fun amazonSideAsn(amazonSideAsn: Number)

    public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String)

    public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String)

    public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String)

    public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String)

    public fun description(description: String)

    public fun dnsSupport(dnsSupport: String)

    public fun multicastSupport(multicastSupport: String)

    public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>)

    public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String)

    public fun vpnEcmpSupport(vpnEcmpSupport: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayProps.builder()

    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    override fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
      cdkBuilder.associationDefaultRouteTableId(associationDefaultRouteTableId)
    }

    override fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
      cdkBuilder.autoAcceptSharedAttachments(autoAcceptSharedAttachments)
    }

    override fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
      cdkBuilder.defaultRouteTableAssociation(defaultRouteTableAssociation)
    }

    override fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
      cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dnsSupport(dnsSupport: String) {
      cdkBuilder.dnsSupport(dnsSupport)
    }

    override fun multicastSupport(multicastSupport: String) {
      cdkBuilder.multicastSupport(multicastSupport)
    }

    override fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
      cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: List<String>) {
      cdkBuilder.transitGatewayCidrBlocks(transitGatewayCidrBlocks)
    }

    override fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String): Unit =
        transitGatewayCidrBlocks(transitGatewayCidrBlocks.toList())

    override fun vpnEcmpSupport(vpnEcmpSupport: String) {
      cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayProps {
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    override fun associationDefaultRouteTableId(): String? =
        unwrap(this).getAssociationDefaultRouteTableId()

    override fun autoAcceptSharedAttachments(): String? =
        unwrap(this).getAutoAcceptSharedAttachments()

    override fun defaultRouteTableAssociation(): String? =
        unwrap(this).getDefaultRouteTableAssociation()

    override fun defaultRouteTablePropagation(): String? =
        unwrap(this).getDefaultRouteTablePropagation()

    override fun description(): String? = unwrap(this).getDescription()

    override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    override fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

    override fun propagationDefaultRouteTableId(): String? =
        unwrap(this).getPropagationDefaultRouteTableId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayCidrBlocks(): List<String> =
        unwrap(this).getTransitGatewayCidrBlocks() ?: emptyList()

    override fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayProps):
        CfnTransitGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
  }
}
