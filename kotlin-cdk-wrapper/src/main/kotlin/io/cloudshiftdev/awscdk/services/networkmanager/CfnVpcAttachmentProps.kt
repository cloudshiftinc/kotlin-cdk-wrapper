@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVpcAttachmentProps {
  public fun coreNetworkId(): String

  public fun options(): Any? = unwrap(this).getOptions()

  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public fun subnetArns(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun options(options: IResolvable)

    public fun options(options: CfnVpcAttachment.VpcOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757c0f2d355da3d8905624f7e84eb5a2ec2edf3d14c9ccf5c2ed4d293c7071e")
    public fun options(options: CfnVpcAttachment.VpcOptionsProperty.Builder.() -> Unit)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fa792b5bab8929ef8bf38ca43abb6d29804f2238a50e6d7866cc3f18990d1b")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun subnetArns(subnetArns: List<String>)

    public fun subnetArns(vararg subnetArns: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcArn(vpcArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps.builder()

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: CfnVpcAttachment.VpcOptionsProperty) {
      cdkBuilder.options(options.let(CfnVpcAttachment.VpcOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757c0f2d355da3d8905624f7e84eb5a2ec2edf3d14c9ccf5c2ed4d293c7071e")
    override fun options(options: CfnVpcAttachment.VpcOptionsProperty.Builder.() -> Unit): Unit =
        options(CfnVpcAttachment.VpcOptionsProperty(options))

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnVpcAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fa792b5bab8929ef8bf38ca43abb6d29804f2238a50e6d7866cc3f18990d1b")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnVpcAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

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

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps,
  ) : CdkObject(cdkObject), CfnVpcAttachmentProps {
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    override fun options(): Any? = unwrap(this).getOptions()

    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    override fun subnetArns(): List<String> = unwrap(this).getSubnetArns()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcArn(): String = unwrap(this).getVpcArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps):
        CfnVpcAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
  }
}
