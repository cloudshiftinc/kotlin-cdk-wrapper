@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowWorkflowParameterPropertyDsl {
  private val cdkBuilder: CfnWorkflow.WorkflowParameterProperty.Builder =
      CfnWorkflow.WorkflowParameterProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun optional(optional: Boolean) {
    cdkBuilder.optional(optional)
  }

  public fun optional(optional: IResolvable) {
    cdkBuilder.optional(optional)
  }

  public fun build(): CfnWorkflow.WorkflowParameterProperty = cdkBuilder.build()
}
