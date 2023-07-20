@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowCustomStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.CustomStepDetailsProperty.Builder =
      CfnWorkflow.CustomStepDetailsProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun timeoutSeconds(timeoutSeconds: Number) {
    cdkBuilder.timeoutSeconds(timeoutSeconds)
  }

  public fun build(): CfnWorkflow.CustomStepDetailsProperty = cdkBuilder.build()
}
