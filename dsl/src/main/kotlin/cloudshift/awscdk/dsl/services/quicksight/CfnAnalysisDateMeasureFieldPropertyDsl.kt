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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisDateMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DateMeasureFieldProperty.Builder =
        CfnAnalysis.DateMeasureFieldProperty.builder()

    public fun aggregationFunction(aggregationFunction: String) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnAnalysis.DateTimeFormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun build(): CfnAnalysis.DateMeasureFieldProperty = cdkBuilder.build()
}
