package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserAccessLoggingSettingsProps {
  /**
   * The ARN of the Kinesis stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-kinesisstreamarn)
   */
  public fun kinesisStreamArn(): String

  /**
   * The tags to add to the user access logging settings resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnUserAccessLoggingSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param kinesisStreamArn The ARN of the Kinesis stream. 
     */
    public fun kinesisStreamArn(kinesisStreamArn: String)

    /**
     * @param tags The tags to add to the user access logging settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the user access logging settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps.builder()

    /**
     * @param kinesisStreamArn The ARN of the Kinesis stream. 
     */
    override fun kinesisStreamArn(kinesisStreamArn: String) {
      cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    /**
     * @param tags The tags to add to the user access logging settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to add to the user access logging settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps,
  ) : CdkObject(cdkObject), CfnUserAccessLoggingSettingsProps {
    /**
     * The ARN of the Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-kinesisstreamarn)
     */
    override fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserAccessLoggingSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps):
        CfnUserAccessLoggingSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserAccessLoggingSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps
  }
}
