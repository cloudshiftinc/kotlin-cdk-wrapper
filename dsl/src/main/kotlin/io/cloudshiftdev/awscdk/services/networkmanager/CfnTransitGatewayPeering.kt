package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayPeering internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun attrPeeringId(): String = unwrap(this).getAttrPeeringId()

  public open fun attrPeeringType(): String = unwrap(this).getAttrPeeringType()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrTransitGatewayPeeringAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayPeeringAttachmentId()

  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()

  public open fun transitGatewayArn(`value`: String) {
    unwrap(this).setTransitGatewayArn(`value`)
  }

  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun tags(tags: List<CfnTag>)

    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering.Builder.create(scope,
        id)

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayPeering {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayPeering(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering):
        CfnTransitGatewayPeering = CfnTransitGatewayPeering(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeering):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering = wrapped.cdkObject
  }
}
