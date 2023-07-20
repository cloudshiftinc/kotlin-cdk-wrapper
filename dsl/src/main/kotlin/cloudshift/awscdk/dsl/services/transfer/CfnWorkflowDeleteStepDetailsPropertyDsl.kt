@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowDeleteStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.DeleteStepDetailsProperty.Builder =
      CfnWorkflow.DeleteStepDetailsProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun build(): CfnWorkflow.DeleteStepDetailsProperty = cdkBuilder.build()
}
