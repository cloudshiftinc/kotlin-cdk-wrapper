@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowDeleteStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.DeleteStepDetailsProperty.Builder =
      CfnWorkflow.DeleteStepDetailsProperty.builder()

  /**
   * @param name The name of the step, used as an identifier.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sourceFileLocation Specifies which file to use as input to the workflow step: either the
   * output from the previous step, or the originally uploaded file for the workflow.
   * * To use the previous file as the input, enter `${previous.file}` . In this case, this workflow
   * step uses the output file from the previous workflow step as input. This is the default value.
   * * To use the originally uploaded file location as input for this step, enter `${original.file}`
   * .
   */
  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun build(): CfnWorkflow.DeleteStepDetailsProperty = cdkBuilder.build()
}
