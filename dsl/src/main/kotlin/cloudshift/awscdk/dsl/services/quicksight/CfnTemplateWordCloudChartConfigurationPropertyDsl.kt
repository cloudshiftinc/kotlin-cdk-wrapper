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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWordCloudChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.WordCloudChartConfigurationProperty.Builder =
        CfnTemplate.WordCloudChartConfigurationProperty.builder()

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.WordCloudFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnTemplate.WordCloudSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun wordCloudOptions(wordCloudOptions: IResolvable) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    public fun wordCloudOptions(wordCloudOptions: CfnTemplate.WordCloudOptionsProperty) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    public fun build(): CfnTemplate.WordCloudChartConfigurationProperty = cdkBuilder.build()
}
