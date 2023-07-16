@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowCopyStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.CopyStepDetailsProperty.Builder =
      CfnWorkflow.CopyStepDetailsProperty.builder()

  public fun destinationFileLocation(destinationFileLocation: IResolvable) {
    cdkBuilder.destinationFileLocation(destinationFileLocation)
  }

  public fun destinationFileLocation(destinationFileLocation: CfnWorkflow.S3FileLocationProperty) {
    cdkBuilder.destinationFileLocation(destinationFileLocation)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun overwriteExisting(overwriteExisting: String) {
    cdkBuilder.overwriteExisting(overwriteExisting)
  }

  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun build(): CfnWorkflow.CopyStepDetailsProperty = cdkBuilder.build()
}
