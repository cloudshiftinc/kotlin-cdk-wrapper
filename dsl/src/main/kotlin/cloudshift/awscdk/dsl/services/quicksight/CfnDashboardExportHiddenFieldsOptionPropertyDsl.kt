@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * Determines if hidden fields are included in an exported dashboard.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ExportHiddenFieldsOptionProperty exportHiddenFieldsOptionProperty =
 * ExportHiddenFieldsOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-exporthiddenfieldsoption.html)
 */
@CdkDslMarker
public class CfnDashboardExportHiddenFieldsOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.ExportHiddenFieldsOptionProperty.Builder =
        CfnDashboard.ExportHiddenFieldsOptionProperty.builder()

    /**
     * @param availabilityStatus The status of the export hidden fields options of a dashbaord.
     */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.ExportHiddenFieldsOptionProperty = cdkBuilder.build()
}
