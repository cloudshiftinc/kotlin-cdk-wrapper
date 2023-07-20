@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer
import kotlin.String

@CdkDslMarker
public class CfnServerWorkflowDetailPropertyDsl {
    private val cdkBuilder: CfnServer.WorkflowDetailProperty.Builder =
        CfnServer.WorkflowDetailProperty.builder()

    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun workflowId(workflowId: String) {
        cdkBuilder.workflowId(workflowId)
    }

    public fun build(): CfnServer.WorkflowDetailProperty = cdkBuilder.build()
}
