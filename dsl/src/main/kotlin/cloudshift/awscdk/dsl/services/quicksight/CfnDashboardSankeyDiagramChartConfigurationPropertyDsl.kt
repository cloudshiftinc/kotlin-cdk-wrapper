@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSankeyDiagramChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SankeyDiagramChartConfigurationProperty.Builder =
      CfnDashboard.SankeyDiagramChartConfigurationProperty.builder()

  /**
   * @param dataLabels The data label configuration of a sankey diagram.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The data label configuration of a sankey diagram.
   */
  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param fieldWells The field well configuration of a sankey diagram.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a sankey diagram.
   */
  public fun fieldWells(fieldWells: CfnDashboard.SankeyDiagramFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param sortConfiguration The sort configuration of a sankey diagram.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a sankey diagram.
   */
  public
      fun sortConfiguration(sortConfiguration: CfnDashboard.SankeyDiagramSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnDashboard.SankeyDiagramChartConfigurationProperty = cdkBuilder.build()
}
