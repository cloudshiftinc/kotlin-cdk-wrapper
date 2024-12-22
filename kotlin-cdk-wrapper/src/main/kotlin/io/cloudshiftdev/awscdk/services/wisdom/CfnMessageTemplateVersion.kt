@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Amazon Q in Connect message template version from the current content and
 * configuration of a message template.
 *
 * Versions are immutable and monotonically increasing. Once a version is created, you can reference
 * a specific version of the message template by passing in
 * `&lt;messageTemplateArn&gt;:&lt;versionNumber&gt;` as the message template identifier. An error is
 * displayed if the supplied `messageTemplateContentSha256` is different from the
 * `messageTemplateContentSha256` of the message template with `$LATEST` qualifier. If multiple
 * `CreateMessageTemplateVersion` requests are made while the message template remains the same, only
 * the first invocation creates a new version and the succeeding requests will return the same response
 * as the first invocation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnMessageTemplateVersion cfnMessageTemplateVersion =
 * CfnMessageTemplateVersion.Builder.create(this, "MyCfnMessageTemplateVersion")
 * .messageTemplateArn("messageTemplateArn")
 * // the properties below are optional
 * .messageTemplateContentSha256("messageTemplateContentSha256")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html)
 */
public open class CfnMessageTemplateVersion(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMessageTemplateVersionProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMessageTemplateVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMessageTemplateVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMessageTemplateVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Message Template Version.
   */
  public open fun attrMessageTemplateVersionArn(): String =
      unwrap(this).getAttrMessageTemplateVersionArn()

  /**
   * The version number for this Message Template Version.
   */
  public open fun attrMessageTemplateVersionNumber(): IResolvable =
      unwrap(this).getAttrMessageTemplateVersionNumber().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun messageTemplateArn(): String = unwrap(this).getMessageTemplateArn()

  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun messageTemplateArn(`value`: String) {
    unwrap(this).setMessageTemplateArn(`value`)
  }

  /**
   * The content SHA256 of the message template.
   */
  public open fun messageTemplateContentSha256(): String? =
      unwrap(this).getMessageTemplateContentSha256()

  /**
   * The content SHA256 of the message template.
   */
  public open fun messageTemplateContentSha256(`value`: String) {
    unwrap(this).setMessageTemplateContentSha256(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnMessageTemplateVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatearn)
     * @param messageTemplateArn The Amazon Resource Name (ARN) of the message template. 
     */
    public fun messageTemplateArn(messageTemplateArn: String)

    /**
     * The content SHA256 of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatecontentsha256)
     * @param messageTemplateContentSha256 The content SHA256 of the message template. 
     */
    public fun messageTemplateContentSha256(messageTemplateContentSha256: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion.Builder
        = software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatearn)
     * @param messageTemplateArn The Amazon Resource Name (ARN) of the message template. 
     */
    override fun messageTemplateArn(messageTemplateArn: String) {
      cdkBuilder.messageTemplateArn(messageTemplateArn)
    }

    /**
     * The content SHA256 of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatecontentsha256)
     * @param messageTemplateContentSha256 The content SHA256 of the message template. 
     */
    override fun messageTemplateContentSha256(messageTemplateContentSha256: String) {
      cdkBuilder.messageTemplateContentSha256(messageTemplateContentSha256)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMessageTemplateVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMessageTemplateVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion):
        CfnMessageTemplateVersion = CfnMessageTemplateVersion(cdkObject)

    internal fun unwrap(wrapped: CfnMessageTemplateVersion):
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersion
  }
}
