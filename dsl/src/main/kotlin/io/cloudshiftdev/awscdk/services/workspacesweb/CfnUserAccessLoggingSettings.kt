package io.cloudshiftdev.awscdk.services.workspacesweb

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

public open class CfnUserAccessLoggingSettings internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * A list of web portal ARNs that this user access logging settings is associated with.
   */
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  /**
   * The ARN of the user access logging settings.
   */
  public open fun attrUserAccessLoggingSettingsArn(): String =
      unwrap(this).getAttrUserAccessLoggingSettingsArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN of the Kinesis stream.
   */
  public open fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

  /**
   * The ARN of the Kinesis stream.
   */
  public open fun kinesisStreamArn(`value`: String) {
    unwrap(this).setKinesisStreamArn(`value`)
  }

  /**
   * The tags to add to the user access logging settings resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the user access logging settings resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the user access logging settings resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-kinesisstreamarn)
     * @param kinesisStreamArn The ARN of the Kinesis stream. 
     */
    public fun kinesisStreamArn(kinesisStreamArn: String)

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     * @param tags The tags to add to the user access logging settings resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     * @param tags The tags to add to the user access logging settings resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings.Builder.create(scope,
        id)

    /**
     * The ARN of the Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-kinesisstreamarn)
     * @param kinesisStreamArn The ARN of the Kinesis stream. 
     */
    override fun kinesisStreamArn(kinesisStreamArn: String) {
      cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     * @param tags The tags to add to the user access logging settings resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the user access logging settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html#cfn-workspacesweb-useraccessloggingsettings-tags)
     * @param tags The tags to add to the user access logging settings resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserAccessLoggingSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserAccessLoggingSettings(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings):
        CfnUserAccessLoggingSettings = CfnUserAccessLoggingSettings(cdkObject)

    internal fun unwrap(wrapped: CfnUserAccessLoggingSettings):
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings =
        wrapped.cdkObject
  }
}
