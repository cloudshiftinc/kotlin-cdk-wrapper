package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnChannelGroupProps {
  /**
   * The name of the channel group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-channelgroupname)
   */
  public fun channelGroupName(): String

  /**
   * The configuration for a MediaPackage V2 channel group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The tags associated with the channel group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelGroupName The name of the channel group. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * @param description The configuration for a MediaPackage V2 channel group.
     */
    public fun description(description: String)

    /**
     * @param tags The tags associated with the channel group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the channel group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps.builder()

    /**
     * @param channelGroupName The name of the channel group. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * @param description The configuration for a MediaPackage V2 channel group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags The tags associated with the channel group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the channel group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps,
  ) : CdkObject(cdkObject), CfnChannelGroupProps {
    /**
     * The name of the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-channelgroupname)
     */
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /**
     * The configuration for a MediaPackage V2 channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The tags associated with the channel group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html#cfn-mediapackagev2-channelgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps):
        CfnChannelGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelGroupProps):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps
  }
}
