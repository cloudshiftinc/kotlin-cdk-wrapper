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

@CdkDslMarker
public class CfnDashboardWordCloudChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.WordCloudChartConfigurationProperty.Builder =
        CfnDashboard.WordCloudChartConfigurationProperty.builder()

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.WordCloudFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.WordCloudSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun wordCloudOptions(wordCloudOptions: IResolvable) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    public fun wordCloudOptions(wordCloudOptions: CfnDashboard.WordCloudOptionsProperty) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    public fun build(): CfnDashboard.WordCloudChartConfigurationProperty = cdkBuilder.build()
}
