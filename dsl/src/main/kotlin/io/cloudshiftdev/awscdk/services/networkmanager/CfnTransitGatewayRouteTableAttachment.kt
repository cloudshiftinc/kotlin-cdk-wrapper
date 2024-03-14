package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRouteTableAttachment internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun peeringId(): String = unwrap(this).getPeeringId()

  public open fun peeringId(`value`: String) {
    unwrap(this).setPeeringId(`value`)
  }

  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1119ab37be45fcd13819f8543e90599f5ea47b92adf94d468b7fa43dfcc4eb93")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transitGatewayRouteTableArn(): String =
      unwrap(this).getTransitGatewayRouteTableArn()

  public open fun transitGatewayRouteTableArn(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableArn(`value`)
  }

  public interface Builder {
    public fun peeringId(peeringId: String)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d991b34abdf57174eede1ec2d656faad25f64d971bd38f7465659b28918fb763")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.Builder
        =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.Builder.create(scope,
        id)

    override fun peeringId(peeringId: String) {
      cdkBuilder.peeringId(peeringId)
    }

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d991b34abdf57174eede1ec2d656faad25f64d971bd38f7465659b28918fb763")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
      cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRouteTableAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRouteTableAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment):
        CfnTransitGatewayRouteTableAttachment = CfnTransitGatewayRouteTableAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAttachment):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment =
        wrapped.cdkObject
  }

  public interface ProposedSegmentChangeProperty {
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    public fun segmentName(): String? = unwrap(this).getSegmentName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number)

      public fun segmentName(segmentName: String)

      public fun tags(tags: List<CfnTag>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.builder()

      override fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
      }

      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty,
    ) : ProposedSegmentChangeProperty {
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      override fun segmentName(): String? = unwrap(this).getSegmentName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
