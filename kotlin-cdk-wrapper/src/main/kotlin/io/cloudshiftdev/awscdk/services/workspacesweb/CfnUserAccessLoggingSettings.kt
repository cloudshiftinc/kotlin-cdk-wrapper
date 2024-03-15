@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * This resource specifies user access logging settings that can be associated with a web portal.
 *
 * In order to receive logs from WorkSpaces Web, you must have an Amazon Kinesis Data Stream that
 * starts with "amazon-workspaces-web-*". Your Amazon Kinesis data stream must either have server-side
 * encryption turned off, or must use AWS managed keys for server-side encryption.
 *
 * For more information about setting server-side encryption in Amazon Kinesis , see [How Do I Get
 * Started with Server-Side
 * Encryption?](https://docs.aws.amazon.com/streams/latest/dev/getting-started-with-sse.html) .
 *
 * For more information about setting up user access logging, see [Set up user access
 * logging](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/user-logging.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnUserAccessLoggingSettings cfnUserAccessLoggingSettings =
 * CfnUserAccessLoggingSettings.Builder.create(this, "MyCfnUserAccessLoggingSettings")
 * .kinesisStreamArn("kinesisStreamArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html)
 */
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings.CFN_RESOURCE_TYPE_NAME

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
