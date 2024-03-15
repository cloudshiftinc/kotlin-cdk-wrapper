@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.networkmanager.CfnConnectAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  public open fun edgeLocation(): String = unwrap(this).getEdgeLocation()

  public open fun edgeLocation(`value`: String) {
    unwrap(this).setEdgeLocation(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any = unwrap(this).getOptions()

  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun options(`value`: ConnectAttachmentOptionsProperty) {
    unwrap(this).setOptions(`value`.let(ConnectAttachmentOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd05dcfd6b8612cf4e07a079bc8a54d5546632d949b72d78e8b43f555a741b17")
  public open fun options(`value`: ConnectAttachmentOptionsProperty.Builder.() -> Unit): Unit =
      options(ConnectAttachmentOptionsProperty(`value`))

  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90e05f0905d1f30f0892ddabcd4903be9f998cd11a5be57fb0505353cf4c0c16")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun transportAttachmentId(): String = unwrap(this).getTransportAttachmentId()

  public open fun transportAttachmentId(`value`: String) {
    unwrap(this).setTransportAttachmentId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun edgeLocation(edgeLocation: String)

    public fun options(options: IResolvable)

    public fun options(options: ConnectAttachmentOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae73d13e23396694990778766a78b86e25f25965f3d2c60218a10f771363aed")
    public fun options(options: ConnectAttachmentOptionsProperty.Builder.() -> Unit)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04ba31d1492cbea1f205c15a8b9770eeb64cee458d708f027c01e0a95a51fd27")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transportAttachmentId(transportAttachmentId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.Builder.create(scope,
        id)

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun edgeLocation(edgeLocation: String) {
      cdkBuilder.edgeLocation(edgeLocation)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: ConnectAttachmentOptionsProperty) {
      cdkBuilder.options(options.let(ConnectAttachmentOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae73d13e23396694990778766a78b86e25f25965f3d2c60218a10f771363aed")
    override fun options(options: ConnectAttachmentOptionsProperty.Builder.() -> Unit): Unit =
        options(ConnectAttachmentOptionsProperty(options))

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04ba31d1492cbea1f205c15a8b9770eeb64cee458d708f027c01e0a95a51fd27")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transportAttachmentId(transportAttachmentId: String) {
      cdkBuilder.transportAttachmentId(transportAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectAttachment):
        CfnConnectAttachment = CfnConnectAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnConnectAttachment):
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachment = wrapped.cdkObject
  }

  public interface ConnectAttachmentOptionsProperty {
    public fun protocol(): String? = unwrap(this).getProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty.builder()

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty,
    ) : CdkObject(cdkObject), ConnectAttachmentOptionsProperty {
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectAttachmentOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty):
          ConnectAttachmentOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectAttachmentOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ConnectAttachmentOptionsProperty
    }
  }

  public interface ProposedSegmentChangeProperty {
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    public fun segmentName(): String? = unwrap(this).getSegmentName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number)

      public fun segmentName(segmentName: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty.builder()

      override fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
      }

      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject), ProposedSegmentChangeProperty {
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      override fun segmentName(): String? = unwrap(this).getSegmentName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnConnectAttachment.ProposedSegmentChangeProperty
    }
  }
}
