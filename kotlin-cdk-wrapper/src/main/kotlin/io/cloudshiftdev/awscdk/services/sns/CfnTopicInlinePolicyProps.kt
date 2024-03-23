@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTopicInlinePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicInlinePolicyProps cfnTopicInlinePolicyProps = CfnTopicInlinePolicyProps.builder()
 * .policyDocument(policyDocument)
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html)
 */
public interface CfnTopicInlinePolicyProps {
  /**
   * A policy document that contains permissions to add to the specified Amazon SNS topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-topicarn)
   */
  public fun topicArn(): String

  /**
   * A builder for [CfnTopicInlinePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument A policy document that contains permissions to add to the specified
     * Amazon SNS topic. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the topic to which you want to add the
     * policy. 
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps.builder()

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified
     * Amazon SNS topic. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the topic to which you want to add the
     * policy. 
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps,
  ) : CdkObject(cdkObject), CfnTopicInlinePolicyProps {
    /**
     * A policy document that contains permissions to add to the specified Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    /**
     * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-topicarn)
     */
    override fun topicArn(): String = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicInlinePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps):
        CfnTopicInlinePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTopicInlinePolicyProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicInlinePolicyProps):
        software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps
  }
}
