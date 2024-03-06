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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * The reporting level for the transferred section of your DataSync task report.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * TransferredProperty transferredProperty = TransferredProperty.builder()
 * .reportLevel("reportLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-transferred.html)
 */
@CdkDslMarker
public class CfnTaskTransferredPropertyDsl {
    private val cdkBuilder: CfnTask.TransferredProperty.Builder =
        CfnTask.TransferredProperty.builder()

    /**
     * @param reportLevel Specifies whether you want your task report to include only what went
     *   wrong with your transfer or a list of what succeeded and didn't.
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to transfer.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to transfer.
     */
    public fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
    }

    public fun build(): CfnTask.TransferredProperty = cdkBuilder.build()
}
