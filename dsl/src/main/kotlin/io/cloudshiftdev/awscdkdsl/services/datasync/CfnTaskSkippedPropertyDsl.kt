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
 * The reporting level for the skipped section of your DataSync task report.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * SkippedProperty skippedProperty = SkippedProperty.builder()
 * .reportLevel("reportLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-skipped.html)
 */
@CdkDslMarker
public class CfnTaskSkippedPropertyDsl {
    private val cdkBuilder: CfnTask.SkippedProperty.Builder = CfnTask.SkippedProperty.builder()

    /**
     * @param reportLevel Specifies whether you want your task report to include only what went
     *   wrong with your transfer or a list of what succeeded and didn't.
     * * `ERRORS_ONLY` : A report shows what DataSync was unable to skip.
     * * `SUCCESSES_AND_ERRORS` : A report shows what DataSync was able and unable to skip.
     */
    public fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
    }

    public fun build(): CfnTask.SkippedProperty = cdkBuilder.build()
}
