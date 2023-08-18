@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * Specifies the workflow ID for the workflow to assign and the execution role that's used for
 * executing the workflow.
 *
 * In addition to a workflow to execute when a file is uploaded completely, `WorkflowDetails` can
 * also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A
 * partial upload occurs when a file is open when the session disconnects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * WorkflowDetailProperty workflowDetailProperty = WorkflowDetailProperty.builder()
 * .executionRole("executionRole")
 * .workflowId("workflowId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-workflowdetail.html)
 */
@CdkDslMarker
public class CfnServerWorkflowDetailPropertyDsl {
    private val cdkBuilder: CfnServer.WorkflowDetailProperty.Builder =
        CfnServer.WorkflowDetailProperty.builder()

    /**
     * @param executionRole Includes the necessary permissions for S3, EFS, and Lambda operations
     *   that Transfer can assume, so that all workflow steps can operate on the required resources.
     */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param workflowId A unique identifier for the workflow. */
    public fun workflowId(workflowId: String) {
        cdkBuilder.workflowId(workflowId)
    }

    public fun build(): CfnServer.WorkflowDetailProperty = cdkBuilder.build()
}
