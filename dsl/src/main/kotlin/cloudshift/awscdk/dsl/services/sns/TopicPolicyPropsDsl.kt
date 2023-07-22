@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicPolicyProps

@CdkDslMarker
public class TopicPolicyPropsDsl {
  private val cdkBuilder: TopicPolicyProps.Builder = TopicPolicyProps.builder()

  private val _topics: MutableList<ITopic> = mutableListOf()

  /**
   * @param policyDocument IAM policy document to apply to topic(s).
   */
  public fun policyDocument(policyDocument: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.build())
  }

  /**
   * @param policyDocument IAM policy document to apply to topic(s).
   */
  public fun policyDocument(policyDocument: PolicyDocument) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * @param topics The set of topics this policy applies to. 
   */
  public fun topics(vararg topics: ITopic) {
    _topics.addAll(listOf(*topics))
  }

  /**
   * @param topics The set of topics this policy applies to. 
   */
  public fun topics(topics: Collection<ITopic>) {
    _topics.addAll(topics)
  }

  public fun build(): TopicPolicyProps {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
