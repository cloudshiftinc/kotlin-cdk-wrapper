@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class CloudFormationStackDriftDetectionCheckDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CloudFormationStackDriftDetectionCheck.Builder =
      CloudFormationStackDriftDetectionCheck.Builder.create(scope, id)

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

  public fun ownStackOnly(ownStackOnly: Boolean) {
    cdkBuilder.ownStackOnly(ownStackOnly)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun build(): CloudFormationStackDriftDetectionCheck = cdkBuilder.build()
}
