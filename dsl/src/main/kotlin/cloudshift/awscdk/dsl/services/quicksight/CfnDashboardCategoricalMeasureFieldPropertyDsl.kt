@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardCategoricalMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnDashboard.CategoricalMeasureFieldProperty.Builder =
        CfnDashboard.CategoricalMeasureFieldProperty.builder()

    public fun aggregationFunction(aggregationFunction: String) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnDashboard.StringFormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun build(): CfnDashboard.CategoricalMeasureFieldProperty = cdkBuilder.build()
}
