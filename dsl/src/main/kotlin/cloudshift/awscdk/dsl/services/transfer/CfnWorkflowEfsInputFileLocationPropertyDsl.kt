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
import software.amazon.awscdk.services.transfer.CfnWorkflow
import kotlin.String

@CdkDslMarker
public class CfnWorkflowEfsInputFileLocationPropertyDsl {
    private val cdkBuilder: CfnWorkflow.EfsInputFileLocationProperty.Builder =
        CfnWorkflow.EfsInputFileLocationProperty.builder()

    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnWorkflow.EfsInputFileLocationProperty = cdkBuilder.build()
}
