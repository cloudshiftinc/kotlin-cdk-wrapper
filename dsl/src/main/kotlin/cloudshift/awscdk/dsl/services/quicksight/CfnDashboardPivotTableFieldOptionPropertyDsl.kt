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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldoption.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldOptionProperty.Builder =
        CfnDashboard.PivotTableFieldOptionProperty.builder()

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

    public fun build(): CfnDashboard.PivotTableFieldOptionProperty = cdkBuilder.build()
}
