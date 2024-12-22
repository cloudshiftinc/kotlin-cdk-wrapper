@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMessageTemplateVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnMessageTemplateVersionProps cfnMessageTemplateVersionProps =
 * CfnMessageTemplateVersionProps.builder()
 * .messageTemplateArn("messageTemplateArn")
 * // the properties below are optional
 * .messageTemplateContentSha256("messageTemplateContentSha256")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html)
 */
public interface CfnMessageTemplateVersionProps {
  /**
   * The Amazon Resource Name (ARN) of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatearn)
   */
  public fun messageTemplateArn(): String

  /**
   * The content SHA256 of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatecontentsha256)
   */
  public fun messageTemplateContentSha256(): String? =
      unwrap(this).getMessageTemplateContentSha256()

  /**
   * A builder for [CfnMessageTemplateVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param messageTemplateArn The Amazon Resource Name (ARN) of the message template. 
     */
    public fun messageTemplateArn(messageTemplateArn: String)

    /**
     * @param messageTemplateContentSha256 The content SHA256 of the message template.
     */
    public fun messageTemplateContentSha256(messageTemplateContentSha256: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps.builder()

    /**
     * @param messageTemplateArn The Amazon Resource Name (ARN) of the message template. 
     */
    override fun messageTemplateArn(messageTemplateArn: String) {
      cdkBuilder.messageTemplateArn(messageTemplateArn)
    }

    /**
     * @param messageTemplateContentSha256 The content SHA256 of the message template.
     */
    override fun messageTemplateContentSha256(messageTemplateContentSha256: String) {
      cdkBuilder.messageTemplateContentSha256(messageTemplateContentSha256)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps,
  ) : CdkObject(cdkObject),
      CfnMessageTemplateVersionProps {
    /**
     * The Amazon Resource Name (ARN) of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatearn)
     */
    override fun messageTemplateArn(): String = unwrap(this).getMessageTemplateArn()

    /**
     * The content SHA256 of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplateversion.html#cfn-wisdom-messagetemplateversion-messagetemplatecontentsha256)
     */
    override fun messageTemplateContentSha256(): String? =
        unwrap(this).getMessageTemplateContentSha256()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMessageTemplateVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps):
        CfnMessageTemplateVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMessageTemplateVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMessageTemplateVersionProps):
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateVersionProps
  }
}
