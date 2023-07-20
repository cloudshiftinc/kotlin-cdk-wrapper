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
public class CfnAnalysisFunnelChartDataLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FunnelChartDataLabelOptionsProperty.Builder =
        CfnAnalysis.FunnelChartDataLabelOptionsProperty.builder()

    public fun categoryLabelVisibility(categoryLabelVisibility: String) {
        cdkBuilder.categoryLabelVisibility(categoryLabelVisibility)
    }

    public fun labelColor(labelColor: String) {
        cdkBuilder.labelColor(labelColor)
    }

    public fun labelFontConfiguration(labelFontConfiguration: IResolvable) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    public fun labelFontConfiguration(labelFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    public fun measureDataLabelStyle(measureDataLabelStyle: String) {
        cdkBuilder.measureDataLabelStyle(measureDataLabelStyle)
    }

    public fun measureLabelVisibility(measureLabelVisibility: String) {
        cdkBuilder.measureLabelVisibility(measureLabelVisibility)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.FunnelChartDataLabelOptionsProperty = cdkBuilder.build()
}
