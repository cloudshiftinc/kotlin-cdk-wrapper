@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleStepFunctionsActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.StepFunctionsActionProperty.Builder =
      CfnTopicRule.StepFunctionsActionProperty.builder()

  public fun executionNamePrefix(executionNamePrefix: String) {
    cdkBuilder.executionNamePrefix(executionNamePrefix)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  public fun build(): CfnTopicRule.StepFunctionsActionProperty = cdkBuilder.build()
}
