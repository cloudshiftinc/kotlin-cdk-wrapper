@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  public open fun amazonSideAsn(`value`: Number) {
    unwrap(this).setAmazonSideAsn(`value`)
  }

  public open fun associationDefaultRouteTableId(): String? =
      unwrap(this).getAssociationDefaultRouteTableId()

  public open fun associationDefaultRouteTableId(`value`: String) {
    unwrap(this).setAssociationDefaultRouteTableId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrTransitGatewayArn(): String = unwrap(this).getAttrTransitGatewayArn()

  public open fun autoAcceptSharedAttachments(): String? =
      unwrap(this).getAutoAcceptSharedAttachments()

  public open fun autoAcceptSharedAttachments(`value`: String) {
    unwrap(this).setAutoAcceptSharedAttachments(`value`)
  }

  public open fun defaultRouteTableAssociation(): String? =
      unwrap(this).getDefaultRouteTableAssociation()

  public open fun defaultRouteTableAssociation(`value`: String) {
    unwrap(this).setDefaultRouteTableAssociation(`value`)
  }

  public open fun defaultRouteTablePropagation(): String? =
      unwrap(this).getDefaultRouteTablePropagation()

  public open fun defaultRouteTablePropagation(`value`: String) {
    unwrap(this).setDefaultRouteTablePropagation(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun dnsSupport(): String? = unwrap(this).getDnsSupport()

  public open fun dnsSupport(`value`: String) {
    unwrap(this).setDnsSupport(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun multicastSupport(): String? = unwrap(this).getMulticastSupport()

  public open fun multicastSupport(`value`: String) {
    unwrap(this).setMulticastSupport(`value`)
  }

  public open fun propagationDefaultRouteTableId(): String? =
      unwrap(this).getPropagationDefaultRouteTableId()

  public open fun propagationDefaultRouteTableId(`value`: String) {
    unwrap(this).setPropagationDefaultRouteTableId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun transitGatewayCidrBlocks(): List<String> =
      unwrap(this).getTransitGatewayCidrBlocks() ?: emptyList()

  public open fun transitGatewayCidrBlocks(`value`: List<String>) {
    unwrap(this).setTransitGatewayCidrBlocks(`value`)
  }

  public open fun transitGatewayCidrBlocks(vararg `value`: String): Unit =
      transitGatewayCidrBlocks(`value`.toList())

  public open fun vpnEcmpSupport(): String? = unwrap(this).getVpnEcmpSupport()

  public open fun vpnEcmpSupport(`value`: String) {
    unwrap(this).setVpnEcmpSupport(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGateway.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGateway):
        CfnTransitGateway = CfnTransitGateway(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGateway):
        software.amazon.awscdk.services.ec2.CfnTransitGateway = wrapped.cdkObject
  }
}
