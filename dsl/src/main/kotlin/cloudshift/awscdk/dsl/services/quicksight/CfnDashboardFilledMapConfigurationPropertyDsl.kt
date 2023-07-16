@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilledMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapConfigurationProperty.Builder =
      CfnDashboard.FilledMapConfigurationProperty.builder()

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.FilledMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  public fun mapStyleOptions(mapStyleOptions: IResolvable) {
    cdkBuilder.mapStyleOptions(mapStyleOptions)
  }

  public fun mapStyleOptions(mapStyleOptions: CfnDashboard.GeospatialMapStyleOptionsProperty) {
    cdkBuilder.mapStyleOptions(mapStyleOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnDashboard.FilledMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun windowOptions(windowOptions: IResolvable) {
    cdkBuilder.windowOptions(windowOptions)
  }

  public fun windowOptions(windowOptions: CfnDashboard.GeospatialWindowOptionsProperty) {
    cdkBuilder.windowOptions(windowOptions)
  }

  public fun build(): CfnDashboard.FilledMapConfigurationProperty = cdkBuilder.build()
}
