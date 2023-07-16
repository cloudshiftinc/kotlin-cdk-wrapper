@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.sns.ITopic
import software.constructs.Construct

@CdkDslMarker
public class CloudFormationStackNotificationCheckDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CloudFormationStackNotificationCheck.Builder =
      CloudFormationStackNotificationCheck.Builder.create(scope, id)

  private val _topics: MutableList<ITopic> = mutableListOf()

  public fun configRuleName(configRuleName: String) {
    cdkBuilder.configRuleName(configRuleName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun inputParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.inputParameters(builder.map)
  }

  public fun inputParameters(inputParameters: Map<String, *>) {
    cdkBuilder.inputParameters(inputParameters)
  }

  public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun topics(vararg topics: ITopic) {
    _topics.addAll(listOf(*topics))
  }

  public fun topics(topics: Collection<ITopic>) {
    _topics.addAll(topics)
  }

  public fun build(): CloudFormationStackNotificationCheck {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
