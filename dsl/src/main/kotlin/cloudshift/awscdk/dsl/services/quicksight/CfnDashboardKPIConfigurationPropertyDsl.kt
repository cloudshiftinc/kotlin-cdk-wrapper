@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIConfigurationProperty.Builder =
      CfnDashboard.KPIConfigurationProperty.builder()

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnDashboard.KPIFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun kpiOptions(kpiOptions: IResolvable) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  public fun kpiOptions(kpiOptions: CfnDashboard.KPIOptionsProperty) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnDashboard.KPISortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnDashboard.KPIConfigurationProperty = cdkBuilder.build()
}
