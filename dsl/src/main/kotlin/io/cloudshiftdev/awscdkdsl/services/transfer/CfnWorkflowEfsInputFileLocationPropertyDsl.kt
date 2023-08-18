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
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Specifies the Amazon EFS identifier and the path for the file being used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * EfsInputFileLocationProperty efsInputFileLocationProperty =
 * EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html)
 */
@CdkDslMarker
public class CfnWorkflowEfsInputFileLocationPropertyDsl {
    private val cdkBuilder: CfnWorkflow.EfsInputFileLocationProperty.Builder =
        CfnWorkflow.EfsInputFileLocationProperty.builder()

    /** @param fileSystemId The identifier of the file system, assigned by Amazon EFS. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /** @param path The pathname for the folder being used by a workflow. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnWorkflow.EfsInputFileLocationProperty = cdkBuilder.build()
}
