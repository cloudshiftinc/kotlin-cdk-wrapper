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

@CdkDslMarker
public class CfnAnalysisSeriesItemPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SeriesItemProperty.Builder =
        CfnAnalysis.SeriesItemProperty.builder()

    public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
        cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
    }

    public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnAnalysis.DataFieldSeriesItemProperty) {
        cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
    }

    public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
        cdkBuilder.fieldSeriesItem(fieldSeriesItem)
    }

    public fun fieldSeriesItem(fieldSeriesItem: CfnAnalysis.FieldSeriesItemProperty) {
        cdkBuilder.fieldSeriesItem(fieldSeriesItem)
    }

    public fun build(): CfnAnalysis.SeriesItemProperty = cdkBuilder.build()
}
