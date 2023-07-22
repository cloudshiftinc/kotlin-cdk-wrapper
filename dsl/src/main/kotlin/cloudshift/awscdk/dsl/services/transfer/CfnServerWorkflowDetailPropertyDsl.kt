@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnServer

@CdkDslMarker
public class CfnServerWorkflowDetailPropertyDsl {
  private val cdkBuilder: CfnServer.WorkflowDetailProperty.Builder =
      CfnServer.WorkflowDetailProperty.builder()

  /**
   * @param executionRole Includes the necessary permissions for S3, EFS, and Lambda operations that
   * Transfer can assume, so that all workflow steps can operate on the required resources. 
   */
  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param workflowId A unique identifier for the workflow. 
   */
  public fun workflowId(workflowId: String) {
    cdkBuilder.workflowId(workflowId)
  }

  public fun build(): CfnServer.WorkflowDetailProperty = cdkBuilder.build()
}
