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
 * The paginated report options for a pivot table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTablePaginatedReportOptionsProperty pivotTablePaginatedReportOptionsProperty =
 * PivotTablePaginatedReportOptionsProperty.builder()
 * .overflowColumnHeaderVisibility("overflowColumnHeaderVisibility")
 * .verticalOverflowVisibility("verticalOverflowVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablepaginatedreportoptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTablePaginatedReportOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTablePaginatedReportOptionsProperty.Builder =
        CfnDashboard.PivotTablePaginatedReportOptionsProperty.builder()

    /**
     * @param overflowColumnHeaderVisibility The visibility of the repeating header rows on each
     *   page.
     */
    public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
        cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
    }

    /**
     * @param verticalOverflowVisibility The visibility of the printing table overflow across pages.
     */
    public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
        cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
    }

    public fun build(): CfnDashboard.PivotTablePaginatedReportOptionsProperty = cdkBuilder.build()
}
