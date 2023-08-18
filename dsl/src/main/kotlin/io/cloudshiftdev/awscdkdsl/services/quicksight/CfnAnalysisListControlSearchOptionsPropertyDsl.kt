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
 * The configuration of the search options in a list control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSearchOptionsProperty listControlSearchOptionsProperty =
 * ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-listcontrolsearchoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisListControlSearchOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ListControlSearchOptionsProperty.Builder =
        CfnAnalysis.ListControlSearchOptionsProperty.builder()

    /** @param visibility The visibility configuration of the search options in a list control. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.ListControlSearchOptionsProperty = cdkBuilder.build()
}
