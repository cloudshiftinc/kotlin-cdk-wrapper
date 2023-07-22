@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
