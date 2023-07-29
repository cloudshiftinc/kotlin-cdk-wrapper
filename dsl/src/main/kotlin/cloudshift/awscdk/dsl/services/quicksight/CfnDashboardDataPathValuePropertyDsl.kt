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
 * The data path that needs to be sorted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPathValueProperty dataPathValueProperty = DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datapathvalue.html)
 */
@CdkDslMarker
public class CfnDashboardDataPathValuePropertyDsl {
    private val cdkBuilder: CfnDashboard.DataPathValueProperty.Builder =
        CfnDashboard.DataPathValueProperty.builder()

    /** @param fieldId The field ID of the field that needs to be sorted. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param fieldValue The actual value of the field that needs to be sorted. */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    public fun build(): CfnDashboard.DataPathValueProperty = cdkBuilder.build()
}
