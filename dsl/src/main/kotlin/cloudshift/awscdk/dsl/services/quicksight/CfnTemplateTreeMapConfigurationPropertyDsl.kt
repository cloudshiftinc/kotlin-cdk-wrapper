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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a tree map.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-treemapconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateTreeMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TreeMapConfigurationProperty.Builder =
        CfnTemplate.TreeMapConfigurationProperty.builder()

    /**
     * @param colorLabelOptions The label options (label text, label visibility) for the colors
     *   displayed in a tree map.
     */
    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    /**
     * @param colorLabelOptions The label options (label text, label visibility) for the colors
     *   displayed in a tree map.
     */
    public fun colorLabelOptions(colorLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    /** @param colorScale The color options (gradient color, point of divergence) of a tree map. */
    public fun colorScale(colorScale: IResolvable) {
        cdkBuilder.colorScale(colorScale)
    }

    /** @param colorScale The color options (gradient color, point of divergence) of a tree map. */
    public fun colorScale(colorScale: CfnTemplate.ColorScaleProperty) {
        cdkBuilder.colorScale(colorScale)
    }

    /** @param dataLabels The options that determine if visual data labels are displayed. */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param dataLabels The options that determine if visual data labels are displayed. */
    public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: CfnTemplate.TreeMapFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param groupLabelOptions The label options (label text, label visibility) of the groups that
     *   are displayed in a tree map.
     */
    public fun groupLabelOptions(groupLabelOptions: IResolvable) {
        cdkBuilder.groupLabelOptions(groupLabelOptions)
    }

    /**
     * @param groupLabelOptions The label options (label text, label visibility) of the groups that
     *   are displayed in a tree map.
     */
    public fun groupLabelOptions(groupLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.groupLabelOptions(groupLabelOptions)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /** @param legend The legend display setup of the visual. */
    public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param sizeLabelOptions The label options (label text, label visibility) of the sizes that
     *   are displayed in a tree map.
     */
    public fun sizeLabelOptions(sizeLabelOptions: IResolvable) {
        cdkBuilder.sizeLabelOptions(sizeLabelOptions)
    }

    /**
     * @param sizeLabelOptions The label options (label text, label visibility) of the sizes that
     *   are displayed in a tree map.
     */
    public fun sizeLabelOptions(sizeLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.sizeLabelOptions(sizeLabelOptions)
    }

    /** @param sortConfiguration The sort configuration of a tree map. */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a tree map. */
    public fun sortConfiguration(sortConfiguration: CfnTemplate.TreeMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun build(): CfnTemplate.TreeMapConfigurationProperty = cdkBuilder.build()
}
