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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The total options for a table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TotalOptionsProperty totalOptionsProperty = TotalOptionsProperty.builder()
 * .customLabel("customLabel")
 * .placement("placement")
 * .scrollStatus("scrollStatus")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-totaloptions.html)
 */
@CdkDslMarker
public class CfnDashboardTotalOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TotalOptionsProperty.Builder =
        CfnDashboard.TotalOptionsProperty.builder()

    /** @param customLabel The custom label string for the total cells. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param placement The placement (start, end) for the total cells. */
    public fun placement(placement: String) {
        cdkBuilder.placement(placement)
    }

    /** @param scrollStatus The scroll status (pinned, scrolled) for the total cells. */
    public fun scrollStatus(scrollStatus: String) {
        cdkBuilder.scrollStatus(scrollStatus)
    }

    /** @param totalCellStyle Cell styling options for the total cells. */
    public fun totalCellStyle(totalCellStyle: IResolvable) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    /** @param totalCellStyle Cell styling options for the total cells. */
    public fun totalCellStyle(totalCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    /** @param totalsVisibility The visibility configuration for the total cells. */
    public fun totalsVisibility(totalsVisibility: String) {
        cdkBuilder.totalsVisibility(totalsVisibility)
    }

    public fun build(): CfnDashboard.TotalOptionsProperty = cdkBuilder.build()
}
