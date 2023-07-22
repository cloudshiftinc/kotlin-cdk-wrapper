@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Options that determine the layout and display options of a chart's small multiples.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SmallMultiplesOptionsProperty smallMultiplesOptionsProperty =
 * SmallMultiplesOptionsProperty.builder()
 * .maxVisibleColumns(123)
 * .maxVisibleRows(123)
 * .panelConfiguration(PanelConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .backgroundVisibility("backgroundVisibility")
 * .borderColor("borderColor")
 * .borderStyle("borderStyle")
 * .borderThickness("borderThickness")
 * .borderVisibility("borderVisibility")
 * .gutterSpacing("gutterSpacing")
 * .gutterVisibility("gutterVisibility")
 * .title(PanelTitleOptionsProperty.builder()
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
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-smallmultiplesoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisSmallMultiplesOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SmallMultiplesOptionsProperty.Builder =
      CfnAnalysis.SmallMultiplesOptionsProperty.builder()

  /**
   * @param maxVisibleColumns Sets the maximum number of visible columns to display in the grid of
   * small multiples panels.
   * The default is `Auto` , which automatically adjusts the columns in the grid to fit the overall
   * layout and size of the given chart.
   */
  public fun maxVisibleColumns(maxVisibleColumns: Number) {
    cdkBuilder.maxVisibleColumns(maxVisibleColumns)
  }

  /**
   * @param maxVisibleRows Sets the maximum number of visible rows to display in the grid of small
   * multiples panels.
   * The default value is `Auto` , which automatically adjusts the rows in the grid to fit the
   * overall layout and size of the given chart.
   */
  public fun maxVisibleRows(maxVisibleRows: Number) {
    cdkBuilder.maxVisibleRows(maxVisibleRows)
  }

  /**
   * @param panelConfiguration Configures the display options for each small multiples panel.
   */
  public fun panelConfiguration(panelConfiguration: IResolvable) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  /**
   * @param panelConfiguration Configures the display options for each small multiples panel.
   */
  public fun panelConfiguration(panelConfiguration: CfnAnalysis.PanelConfigurationProperty) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  public fun build(): CfnAnalysis.SmallMultiplesOptionsProperty = cdkBuilder.build()
}
