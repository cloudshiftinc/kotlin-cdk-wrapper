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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateComboChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ComboChartConfigurationProperty.Builder =
        CfnTemplate.ComboChartConfigurationProperty.builder()

    private val _referenceLines: MutableList<Any> = mutableListOf()

    public fun barDataLabels(barDataLabels: IResolvable) {
        cdkBuilder.barDataLabels(barDataLabels)
    }

    public fun barDataLabels(barDataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.barDataLabels(barDataLabels)
    }

    public fun barsArrangement(barsArrangement: String) {
        cdkBuilder.barsArrangement(barsArrangement)
    }

    public fun categoryAxis(categoryAxis: IResolvable) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    public fun categoryAxis(categoryAxis: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.categoryAxis(categoryAxis)
    }

    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun categoryLabelOptions(categoryLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: IResolvable) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun colorLabelOptions(colorLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.colorLabelOptions(colorLabelOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnTemplate.ComboChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    public fun lineDataLabels(lineDataLabels: IResolvable) {
        cdkBuilder.lineDataLabels(lineDataLabels)
    }

    public fun lineDataLabels(lineDataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.lineDataLabels(lineDataLabels)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisDisplayOptions(primaryYAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.primaryYAxisDisplayOptions(primaryYAxisDisplayOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun primaryYAxisLabelOptions(primaryYAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.primaryYAxisLabelOptions(primaryYAxisLabelOptions)
    }

    public fun referenceLines(vararg referenceLines: Any) {
        _referenceLines.addAll(listOf(*referenceLines))
    }

    public fun referenceLines(referenceLines: Collection<Any>) {
        _referenceLines.addAll(referenceLines)
    }

    public fun referenceLines(referenceLines: IResolvable) {
        cdkBuilder.referenceLines(referenceLines)
    }

    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: IResolvable) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    public fun secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.secondaryYAxisDisplayOptions(secondaryYAxisDisplayOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: IResolvable) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    public fun secondaryYAxisLabelOptions(secondaryYAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.secondaryYAxisLabelOptions(secondaryYAxisLabelOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnTemplate.ComboChartSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnTemplate.ComboChartConfigurationProperty {
        if (_referenceLines.isNotEmpty()) cdkBuilder.referenceLines(_referenceLines)
        return cdkBuilder.build()
    }
}
