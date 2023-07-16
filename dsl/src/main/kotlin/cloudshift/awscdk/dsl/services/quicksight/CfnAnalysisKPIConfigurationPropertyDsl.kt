@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisKPIConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.KPIConfigurationProperty.Builder =
      CfnAnalysis.KPIConfigurationProperty.builder()

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.KPIFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun kpiOptions(kpiOptions: IResolvable) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  public fun kpiOptions(kpiOptions: CfnAnalysis.KPIOptionsProperty) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnAnalysis.KPISortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnAnalysis.KPIConfigurationProperty = cdkBuilder.build()
}
