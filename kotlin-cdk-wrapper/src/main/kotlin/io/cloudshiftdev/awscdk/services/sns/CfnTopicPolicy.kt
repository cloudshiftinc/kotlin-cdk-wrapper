@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SNS::TopicPolicy` resource associates Amazon SNS topics with a policy.
 *
 * For an example snippet, see [Declaring an Amazon SNS
 * policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-sns-policy)
 * in the *AWS CloudFormation User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicPolicy cfnTopicPolicy = CfnTopicPolicy.Builder.create(this, "MyCfnTopicPolicy")
 * .policyDocument(policyDocument)
 * .topics(List.of("topics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
 */
public open class CfnTopicPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The provider-assigned unique ID for this managed resource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A policy document that contains permissions to add to the specified SNS topics.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * A policy document that contains permissions to add to the specified SNS topics.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of the topics to which you want to add the policy.
   */
  public open fun topics(): List<String> = unwrap(this).getTopics()

  /**
   * The Amazon Resource Names (ARN) of the topics to which you want to add the policy.
   */
  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of the topics to which you want to add the policy.
   */
  public open fun topics(vararg `value`: String): Unit = topics(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.CfnTopicPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A policy document that contains permissions to add to the specified SNS topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     * topics. 
     */
    public fun policyDocument(policyDocument: Any)

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
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     */
    public fun topics(topics: List<String>)

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
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     */
    public fun topics(vararg topics: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder =
        software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder.create(scope, id)

    /**
     * A policy document that contains permissions to add to the specified SNS topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     * topics. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

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
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

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
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     * policy. 
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sns.CfnTopicPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy): CfnTopicPolicy
        = CfnTopicPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTopicPolicy): software.amazon.awscdk.services.sns.CfnTopicPolicy
        = wrapped.cdkObject
  }
}
