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
 * The selected field options for the pivot table field options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableFieldOptionProperty pivotTableFieldOptionProperty =
 * PivotTableFieldOptionProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .customLabel("customLabel")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottablefieldoption.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTableFieldOptionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableFieldOptionProperty.Builder =
        CfnAnalysis.PivotTableFieldOptionProperty.builder()

    /** @param customLabel The custom label of the pivot table field. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param fieldId The field ID of the pivot table field. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param visibility The visibility of the pivot table field. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.PivotTableFieldOptionProperty = cdkBuilder.build()
}
