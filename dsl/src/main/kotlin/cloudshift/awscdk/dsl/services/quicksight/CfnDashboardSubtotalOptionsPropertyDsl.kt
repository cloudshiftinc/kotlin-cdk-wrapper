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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The subtotal options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SubtotalOptionsProperty subtotalOptionsProperty = SubtotalOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fieldLevel("fieldLevel")
 * .fieldLevelOptions(List.of(PivotTableFieldSubtotalOptionsProperty.builder()
 * .fieldId("fieldId")
 * .build()))
 * .metricHeaderCellStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .totalCellStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .totalsVisibility("totalsVisibility")
 * .valueCellStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-subtotaloptions.html)
 */
@CdkDslMarker
public class CfnDashboardSubtotalOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SubtotalOptionsProperty.Builder =
        CfnDashboard.SubtotalOptionsProperty.builder()

    private val _fieldLevelOptions: MutableList<Any> = mutableListOf()

    /** @param customLabel The custom label string for the subtotal cells. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param fieldLevel The field level (all, custom, last) for the subtotal cells. */
    public fun fieldLevel(fieldLevel: String) {
        cdkBuilder.fieldLevel(fieldLevel)
    }

    /** @param fieldLevelOptions The optional configuration of subtotal cells. */
    public fun fieldLevelOptions(vararg fieldLevelOptions: Any) {
        _fieldLevelOptions.addAll(listOf(*fieldLevelOptions))
    }

    /** @param fieldLevelOptions The optional configuration of subtotal cells. */
    public fun fieldLevelOptions(fieldLevelOptions: Collection<Any>) {
        _fieldLevelOptions.addAll(fieldLevelOptions)
    }

    /** @param fieldLevelOptions The optional configuration of subtotal cells. */
    public fun fieldLevelOptions(fieldLevelOptions: IResolvable) {
        cdkBuilder.fieldLevelOptions(fieldLevelOptions)
    }

    /** @param metricHeaderCellStyle The cell styling options for the subtotals of header cells. */
    public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    /** @param metricHeaderCellStyle The cell styling options for the subtotals of header cells. */
    public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    /** @param totalCellStyle The cell styling options for the subtotal cells. */
    public fun totalCellStyle(totalCellStyle: IResolvable) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    /** @param totalCellStyle The cell styling options for the subtotal cells. */
    public fun totalCellStyle(totalCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    /** @param totalsVisibility The visibility configuration for the subtotal cells. */
    public fun totalsVisibility(totalsVisibility: String) {
        cdkBuilder.totalsVisibility(totalsVisibility)
    }

    /** @param valueCellStyle The cell styling options for the subtotals of value cells. */
    public fun valueCellStyle(valueCellStyle: IResolvable) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    /** @param valueCellStyle The cell styling options for the subtotals of value cells. */
    public fun valueCellStyle(valueCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    public fun build(): CfnDashboard.SubtotalOptionsProperty {
        if (_fieldLevelOptions.isNotEmpty()) cdkBuilder.fieldLevelOptions(_fieldLevelOptions)
        return cdkBuilder.build()
    }
}
