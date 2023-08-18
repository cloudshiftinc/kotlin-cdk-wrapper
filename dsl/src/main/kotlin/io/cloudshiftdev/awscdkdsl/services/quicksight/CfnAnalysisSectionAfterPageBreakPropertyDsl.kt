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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a page break after a section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionAfterPageBreakProperty sectionAfterPageBreakProperty =
 * SectionAfterPageBreakProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sectionafterpagebreak.html)
 */
@CdkDslMarker
public class CfnAnalysisSectionAfterPageBreakPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionAfterPageBreakProperty.Builder =
        CfnAnalysis.SectionAfterPageBreakProperty.builder()

    /** @param status The option that enables or disables a page break at the end of a section. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAnalysis.SectionAfterPageBreakProperty = cdkBuilder.build()
}
