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

@CdkDslMarker
public class CfnTopicPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTopicPolicy.Builder = CfnTopicPolicy.Builder.create(scope, id)

  private val _topics: MutableList<String> = mutableListOf()

  public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policyDocument(builder.map)
  }

  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  public fun topics(vararg topics: String) {
    _topics.addAll(listOf(*topics))
  }

  public fun topics(topics: Collection<String>) {
    _topics.addAll(topics)
  }

  public fun build(): CfnTopicPolicy {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
