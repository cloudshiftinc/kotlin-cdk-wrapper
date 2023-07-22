@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicPolicy
import software.constructs.Construct

/**
 * The policy for an SNS Topic.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called
 * `addToResourcePolicy()`, which will automatically create a new resource
 * policy if one doesn't exist yet, otherwise it will add to the existing
 * policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 *
 * ```
 * Topic topic = new Topic(this, "Topic");
 * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "TopicPolicy")
 * .topics(List.of(topic))
 * .build();
 * topicPolicy.document.addStatements(PolicyStatement.Builder.create()
 * .actions(List.of("sns:Subscribe"))
 * .principals(List.of(new AnyPrincipal()))
 * .resources(List.of(topic.getTopicArn()))
 * .build());
 * ```
 */
@CdkDslMarker
public class TopicPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TopicPolicy.Builder = TopicPolicy.Builder.create(scope, id)

  private val _topics: MutableList<ITopic> = mutableListOf()

  /**
   * IAM policy document to apply to topic(s).
   *
   * Default: empty policy document
   *
   * @param policyDocument IAM policy document to apply to topic(s). 
   */
  public fun policyDocument(policyDocument: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.build())
  }

  /**
   * IAM policy document to apply to topic(s).
   *
   * Default: empty policy document
   *
   * @param policyDocument IAM policy document to apply to topic(s). 
   */
  public fun policyDocument(policyDocument: PolicyDocument) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * The set of topics this policy applies to.
   *
   * @param topics The set of topics this policy applies to. 
   */
  public fun topics(vararg topics: ITopic) {
    _topics.addAll(listOf(*topics))
  }

  /**
   * The set of topics this policy applies to.
   *
   * @param topics The set of topics this policy applies to. 
   */
  public fun topics(topics: Collection<ITopic>) {
    _topics.addAll(topics)
  }

  public fun build(): TopicPolicy {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
