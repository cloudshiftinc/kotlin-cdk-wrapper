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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The table options for a table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableOptionsProperty tableOptionsProperty = TableOptionsProperty.builder()
 * .cellStyle(TableCellStyleProperty.builder()
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
 * .headerStyle(TableCellStyleProperty.builder()
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
 * .orientation("orientation")
 * .rowAlternateColorOptions(RowAlternateColorOptionsProperty.builder()
 * .rowAlternateColors(List.of("rowAlternateColors"))
 * .status("status")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tableoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTableOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableOptionsProperty.Builder =
        CfnAnalysis.TableOptionsProperty.builder()

    /** @param cellStyle The table cell style of table cells. */
    public fun cellStyle(cellStyle: IResolvable) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /** @param cellStyle The table cell style of table cells. */
    public fun cellStyle(cellStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /** @param headerStyle The table cell style of a table header. */
    public fun headerStyle(headerStyle: IResolvable) {
        cdkBuilder.headerStyle(headerStyle)
    }

    /** @param headerStyle The table cell style of a table header. */
    public fun headerStyle(headerStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.headerStyle(headerStyle)
    }

    /** @param orientation The orientation (vertical, horizontal) for a table. */
    public fun orientation(orientation: String) {
        cdkBuilder.orientation(orientation)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     *   colors) for a table.
     */
    public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     *   colors) for a table.
     */
    public fun rowAlternateColorOptions(
        rowAlternateColorOptions: CfnAnalysis.RowAlternateColorOptionsProperty
    ) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    public fun build(): CfnAnalysis.TableOptionsProperty = cdkBuilder.build()
}
