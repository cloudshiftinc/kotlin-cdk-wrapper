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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The table cell style for a cell in pivot table or table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableCellStyleProperty tableCellStyleProperty = TableCellStyleProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablecellstyle.html)
 */
@CdkDslMarker
public class CfnAnalysisTableCellStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableCellStyleProperty.Builder =
        CfnAnalysis.TableCellStyleProperty.builder()

    /** @param backgroundColor The background color for the table cells. */
    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /** @param border The borders for the table cells. */
    public fun border(border: IResolvable) {
        cdkBuilder.border(border)
    }

    /** @param border The borders for the table cells. */
    public fun border(border: CfnAnalysis.GlobalTableBorderOptionsProperty) {
        cdkBuilder.border(border)
    }

    /** @param fontConfiguration The font configuration of the table cells. */
    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /** @param fontConfiguration The font configuration of the table cells. */
    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /** @param height The height color for the table cells. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * @param horizontalTextAlignment The horizontal text alignment (left, center, right, auto) for
     *   the table cells.
     */
    public fun horizontalTextAlignment(horizontalTextAlignment: String) {
        cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
    }

    /** @param textWrap The text wrap (none, wrap) for the table cells. */
    public fun textWrap(textWrap: String) {
        cdkBuilder.textWrap(textWrap)
    }

    /**
     * @param verticalTextAlignment The vertical text alignment (top, middle, bottom) for the table
     *   cells.
     */
    public fun verticalTextAlignment(verticalTextAlignment: String) {
        cdkBuilder.verticalTextAlignment(verticalTextAlignment)
    }

    /** @param visibility The visibility of the table cells. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.TableCellStyleProperty = cdkBuilder.build()
}
