@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIConfigurationProperty.Builder =
      CfnDashboard.KPIConfigurationProperty.builder()

  /**
   * @param fieldWells The field well configuration of a KPI visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a KPI visual.
   */
  public fun fieldWells(fieldWells: CfnDashboard.KPIFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param kpiOptions The options that determine the presentation of a KPI visual.
   */
  public fun kpiOptions(kpiOptions: IResolvable) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  /**
   * @param kpiOptions The options that determine the presentation of a KPI visual.
   */
  public fun kpiOptions(kpiOptions: CfnDashboard.KPIOptionsProperty) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a KPI visual.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a KPI visual.
   */
  public fun sortConfiguration(sortConfiguration: CfnDashboard.KPISortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnDashboard.KPIConfigurationProperty = cdkBuilder.build()
}
