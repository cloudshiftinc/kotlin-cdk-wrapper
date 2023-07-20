@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSankeyDiagramChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SankeyDiagramChartConfigurationProperty.Builder =
      CfnAnalysis.SankeyDiagramChartConfigurationProperty.builder()

  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun dataLabels(dataLabels: CfnAnalysis.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.SankeyDiagramFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public
      fun sortConfiguration(sortConfiguration: CfnAnalysis.SankeyDiagramSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnAnalysis.SankeyDiagramChartConfigurationProperty = cdkBuilder.build()
}
