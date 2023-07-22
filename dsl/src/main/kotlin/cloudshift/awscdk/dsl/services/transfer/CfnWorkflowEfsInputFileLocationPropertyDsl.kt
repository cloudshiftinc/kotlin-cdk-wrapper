@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowEfsInputFileLocationPropertyDsl {
  private val cdkBuilder: CfnWorkflow.EfsInputFileLocationProperty.Builder =
      CfnWorkflow.EfsInputFileLocationProperty.builder()

  /**
   * @param fileSystemId The identifier of the file system, assigned by Amazon EFS.
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param path The pathname for the folder being used by a workflow.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnWorkflow.EfsInputFileLocationProperty = cdkBuilder.build()
}
