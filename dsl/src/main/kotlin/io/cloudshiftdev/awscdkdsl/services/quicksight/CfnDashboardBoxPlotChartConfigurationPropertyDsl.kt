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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a `BoxPlotVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-boxplotchartconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardBoxPlotChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.BoxPlotChartConfigurationProperty.Builder =
        CfnDashboard.BoxPlotChartConfigurationProperty.builder()

    private val _referenceLines: MutableList<Any> = mutableListOf()

    /** @param boxPlotOptions The box plot chart options for a box plot visual. */
    public fun boxPlotOptions(boxPlotOptions: IResolvable) {
        cdkBuilder.boxPlotOptions(boxPlotOptions)
    }

    /** @param boxPlotOptions The box plot chart options for a box plot visual. */
    public fun boxPlotOptions(boxPlotOptions: CfnDashboard.BoxPlotOptionsProperty) {
        cdkBuilder.boxPlotOptions(boxPlotOptions)
    }

    /**
     * @param categoryAxis The label display options (grid line, range, scale, axis step) of a box
     *   plot category.
     */
    public fun categoryAxis(categoryAxis: IResolvable) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    /**
     * @param categoryAxis The label display options (grid line, range, scale, axis step) of a box
     *   plot category.
     */
    public fun categoryAxis(categoryAxis: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    /**
     * @param categoryLabelOptions The label options (label text, label visibility and sort Icon
     *   visibility) of a box plot category.
     */
    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /**
     * @param categoryLabelOptions The label options (label text, label visibility and sort Icon
     *   visibility) of a box plot category.
     */
    public fun categoryLabelOptions(
        categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: CfnDashboard.BoxPlotFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param legend the value to be set. */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /** @param legend the value to be set. */
    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param primaryYAxisDisplayOptions The label display options (grid line, range, scale, axis
     *   step) of a box plot category.
     */
    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    /**
     * @param primaryYAxisDisplayOptions The label display options (grid line, range, scale, axis
     *   step) of a box plot category.
     */
    public fun primaryYAxisDisplayOptions(
        primaryYAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty
    ) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    /**
     * @param primaryYAxisLabelOptions The label options (label text, label visibility and sort icon
     *   visibility) of a box plot value.
     */
    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    /**
     * @param primaryYAxisLabelOptions The label options (label text, label visibility and sort icon
     *   visibility) of a box plot value.
     */
    public fun primaryYAxisLabelOptions(
        primaryYAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    /** @param referenceLines The reference line setup of the visual. */
    public fun referenceLines(vararg referenceLines: Any) {
        _referenceLines.addAll(listOf(*referenceLines))
    }

    /** @param referenceLines The reference line setup of the visual. */
    public fun referenceLines(referenceLines: Collection<Any>) {
        _referenceLines.addAll(referenceLines)
    }

    /** @param referenceLines The reference line setup of the visual. */
    public fun referenceLines(referenceLines: IResolvable) {
        cdkBuilder.referenceLines(referenceLines)
    }

    /** @param sortConfiguration The sort configuration of a `BoxPlotVisual` . */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a `BoxPlotVisual` . */
    public fun sortConfiguration(sortConfiguration: CfnDashboard.BoxPlotSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip display setup of the visual. */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param visualPalette The palette (chart color) display setup of the visual. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The palette (chart color) display setup of the visual. */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnDashboard.BoxPlotChartConfigurationProperty {
        if (_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
        return cdkBuilder.build()
    }
}
