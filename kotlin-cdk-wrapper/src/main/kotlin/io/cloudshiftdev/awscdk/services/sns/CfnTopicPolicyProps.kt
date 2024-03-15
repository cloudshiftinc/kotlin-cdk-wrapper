@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTopicPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicPolicyProps cfnTopicPolicyProps = CfnTopicPolicyProps.builder()
 * .policyDocument(policyDocument)
 * .topics(List.of("topics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
 */
public interface CfnTopicPolicyProps {
  /**
   * A policy document that contains permissions to add to the specified SNS topics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * The Amazon Resource Names (ARN) of the topics to which you want to add the policy.
   *
   * You can use the
   * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
   * function to specify an
   * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-topics)
   */
  public fun topics(): List<String>

  /**
   * A builder for [CfnTopicPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     * topics. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     * resource.
     */
    public fun topics(topics: List<String>)

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     * resource.
     */
    public fun topics(vararg topics: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicPolicyProps.builder()

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     * topics. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     * resource.
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     * resource.
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicyProps,
  ) : CdkObject(cdkObject), CfnTopicPolicyProps {
    /**
     * A policy document that contains permissions to add to the specified SNS topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    /**
     * The Amazon Resource Names (ARN) of the topics to which you want to add the policy.
     *
     * You can use the
     * `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     * function to specify an
     * `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-topics)
     */
    override fun topics(): List<String> = unwrap(this).getTopics()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicyProps):
        CfnTopicPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicPolicyProps):
        software.amazon.awscdk.services.sns.CfnTopicPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sns.CfnTopicPolicyProps
  }
}
