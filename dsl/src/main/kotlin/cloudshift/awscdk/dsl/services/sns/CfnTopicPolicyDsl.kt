@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.CfnTopicPolicy
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicPolicy cfnTopicPolicy = CfnTopicPolicy.Builder.create(this, "MyCfnTopicPolicy")
 * .policyDocument(policyDocument)
 * .topics(List.of("topics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
 */
@CdkDslMarker
public class CfnTopicPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTopicPolicy.Builder = CfnTopicPolicy.Builder.create(scope, id)

  private val _topics: MutableList<String> = mutableListOf()

  /**
   * A policy document that contains permissions to add to the specified SNS topics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
   * @param policyDocument A policy document that contains permissions to add to the specified SNS
   * topics. 
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

  /**
   * A policy document that contains permissions to add to the specified SNS topics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html#cfn-sns-topicpolicy-policydocument)
   * @param policyDocument A policy document that contains permissions to add to the specified SNS
   * topics. 
   */
  public fun policyDocument(policyDocument: Any) {
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
  public fun topics(vararg topics: String) {
    _topics.addAll(listOf(*topics))
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
  public fun topics(topics: Collection<String>) {
    _topics.addAll(topics)
  }

  public fun build(): CfnTopicPolicy {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
