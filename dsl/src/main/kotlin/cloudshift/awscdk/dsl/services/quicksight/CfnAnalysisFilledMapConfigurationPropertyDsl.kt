@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration for a `FilledMapVisual` .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filledmapconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFilledMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilledMapConfigurationProperty.Builder =
        CfnAnalysis.FilledMapConfigurationProperty.builder()

    /**
     * @param fieldWells The field wells of the visual.
     */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param fieldWells The field wells of the visual.
     */
    public fun fieldWells(fieldWells: CfnAnalysis.FilledMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param legend The legend display setup of the visual.
     */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param legend The legend display setup of the visual.
     */
    public fun legend(legend: CfnAnalysis.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param mapStyleOptions The map style options of the filled map visual.
     */
    public fun mapStyleOptions(mapStyleOptions: IResolvable) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    /**
     * @param mapStyleOptions The map style options of the filled map visual.
     */
    public fun mapStyleOptions(mapStyleOptions: CfnAnalysis.GeospatialMapStyleOptionsProperty) {
        cdkBuilder.mapStyleOptions(mapStyleOptions)
    }

    /**
     * @param sortConfiguration The sort configuration of a `FilledMapVisual` .
     */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /**
     * @param sortConfiguration The sort configuration of a `FilledMapVisual` .
     */
    public fun sortConfiguration(sortConfiguration: CfnAnalysis.FilledMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /**
     * @param tooltip The tooltip display setup of the visual.
     */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param tooltip The tooltip display setup of the visual.
     */
    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param windowOptions The window options of the filled map visual.
     */
    public fun windowOptions(windowOptions: IResolvable) {
        cdkBuilder.windowOptions(windowOptions)
    }

    /**
     * @param windowOptions The window options of the filled map visual.
     */
    public fun windowOptions(windowOptions: CfnAnalysis.GeospatialWindowOptionsProperty) {
        cdkBuilder.windowOptions(windowOptions)
    }

    public fun build(): CfnAnalysis.FilledMapConfigurationProperty = cdkBuilder.build()
}
