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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcAttachment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any? = unwrap(this).getOptions()

  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun options(`value`: VpcOptionsProperty) {
    unwrap(this).setOptions(`value`.let(VpcOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e12fd0a4faa3aac7d9970559cee1a47349f2ab80c469430c5f6ef126d8686e81")
  public open fun options(`value`: VpcOptionsProperty.Builder.() -> Unit): Unit =
      options(VpcOptionsProperty(`value`))

  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b344db48c3da084c253da648cecffdae52f6ec82521c7dc622e326f934fa6d25")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  public open fun subnetArns(): List<String> = unwrap(this).getSubnetArns()

  public open fun subnetArns(`value`: List<String>) {
    unwrap(this).setSubnetArns(`value`)
  }

  public open fun subnetArns(vararg `value`: String): Unit = subnetArns(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcArn(): String = unwrap(this).getVpcArn()

  public open fun vpcArn(`value`: String) {
    unwrap(this).setVpcArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun options(options: IResolvable)

    public fun options(options: VpcOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    public fun options(options: VpcOptionsProperty.Builder.() -> Unit)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6df3611e86e18a84c20a6d40323432db1b1213cd55e3f7ae0a0b4320a85d6b")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun subnetArns(subnetArns: List<String>)

    public fun subnetArns(vararg subnetArns: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcArn(vpcArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.Builder
        = software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.Builder.create(scope, id)

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: VpcOptionsProperty) {
      cdkBuilder.options(options.let(VpcOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    override fun options(options: VpcOptionsProperty.Builder.() -> Unit): Unit =
        options(VpcOptionsProperty(options))

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6df3611e86e18a84c20a6d40323432db1b1213cd55e3f7ae0a0b4320a85d6b")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcArn(vpcArn: String) {
      cdkBuilder.vpcArn(vpcArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnVpcAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment):
        CfnVpcAttachment = CfnVpcAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnVpcAttachment):
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment = wrapped.cdkObject
  }

  public interface VpcOptionsProperty {
    public fun applianceModeSupport(): Any? = unwrap(this).getApplianceModeSupport()

    public fun ipv6Support(): Any? = unwrap(this).getIpv6Support()

    @CdkDslMarker
    public interface Builder {
      public fun applianceModeSupport(applianceModeSupport: Boolean)

      public fun applianceModeSupport(applianceModeSupport: IResolvable)

      public fun ipv6Support(ipv6Support: Boolean)

      public fun ipv6Support(ipv6Support: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty.builder()

      override fun applianceModeSupport(applianceModeSupport: Boolean) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
      }

      override fun applianceModeSupport(applianceModeSupport: IResolvable) {
        cdkBuilder.applianceModeSupport(applianceModeSupport.let(IResolvable::unwrap))
      }

      override fun ipv6Support(ipv6Support: Boolean) {
        cdkBuilder.ipv6Support(ipv6Support)
      }

      override fun ipv6Support(ipv6Support: IResolvable) {
        cdkBuilder.ipv6Support(ipv6Support.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty,
    ) : CdkObject(cdkObject), VpcOptionsProperty {
      override fun applianceModeSupport(): Any? = unwrap(this).getApplianceModeSupport()

      override fun ipv6Support(): Any? = unwrap(this).getIpv6Support()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty):
          VpcOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty
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
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
    }
  }
}
