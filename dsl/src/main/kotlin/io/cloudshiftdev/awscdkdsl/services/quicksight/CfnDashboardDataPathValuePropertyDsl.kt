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
import software.amazon.awscdk.IResolvable
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
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
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

    /** @param dataPathType The type configuration of the field. */
    public fun dataPathType(dataPathType: IResolvable) {
        cdkBuilder.dataPathType(dataPathType)
    }

    /** @param dataPathType The type configuration of the field. */
    public fun dataPathType(dataPathType: CfnDashboard.DataPathTypeProperty) {
        cdkBuilder.dataPathType(dataPathType)
    }

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
