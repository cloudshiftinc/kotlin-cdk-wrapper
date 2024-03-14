package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannelGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the channel group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of the creation of the channel group.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The egress domain of the channel group.
   */
  public open fun attrEgressDomain(): String = unwrap(this).getAttrEgressDomain()

  /**
   * The timestamp of the modification of the channel group.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the channel group.
   */
  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  /**
   * The name of the channel group.
   */
  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  /**
   * The configuration for a MediaPackage V2 channel group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration for a MediaPackage V2 channel group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The tags associated with the channel group.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags associated with the channel group.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the channel group.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackagev2.CfnChannelGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-channelgroupname)
     * @param channelGroupName The name of the channel group. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * The configuration for a MediaPackage V2 channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-description)
     * @param description The configuration for a MediaPackage V2 channel group. 
     */
    public fun description(description: String)

    /**
     * The tags associated with the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
     * @param tags The tags associated with the channel group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
     * @param tags The tags associated with the channel group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup.Builder.create(scope, id)

    /**
     * The name of the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-channelgroupname)
     * @param channelGroupName The name of the channel group. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * The configuration for a MediaPackage V2 channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-description)
     * @param description The configuration for a MediaPackage V2 channel group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The tags associated with the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
     * @param tags The tags associated with the channel group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
     * @param tags The tags associated with the channel group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup):
        CfnChannelGroup = CfnChannelGroup(cdkObject)

    internal fun unwrap(wrapped: CfnChannelGroup):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup = wrapped.cdkObject
  }
}