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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a word cloud visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-wordcloudchartconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisWordCloudChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.WordCloudChartConfigurationProperty.Builder =
        CfnAnalysis.WordCloudChartConfigurationProperty.builder()

    /**
     * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
     *   visibility) for the word cloud category.
     */
    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /**
     * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
     *   visibility) for the word cloud category.
     */
    public fun categoryLabelOptions(
        categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: CfnAnalysis.WordCloudFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param sortConfiguration The sort configuration of a word cloud visual. */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a word cloud visual. */
    public fun sortConfiguration(
        sortConfiguration: CfnAnalysis.WordCloudSortConfigurationProperty
    ) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param wordCloudOptions The options for a word cloud visual. */
    public fun wordCloudOptions(wordCloudOptions: IResolvable) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    /** @param wordCloudOptions The options for a word cloud visual. */
    public fun wordCloudOptions(wordCloudOptions: CfnAnalysis.WordCloudOptionsProperty) {
        cdkBuilder.wordCloudOptions(wordCloudOptions)
    }

    public fun build(): CfnAnalysis.WordCloudChartConfigurationProperty = cdkBuilder.build()
}
