@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleWorkflowUpdatePropertyDsl {
  private val cdkBuilder: CfnAutomationRule.WorkflowUpdateProperty.Builder =
      CfnAutomationRule.WorkflowUpdateProperty.builder()

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnAutomationRule.WorkflowUpdateProperty = cdkBuilder.build()
}
