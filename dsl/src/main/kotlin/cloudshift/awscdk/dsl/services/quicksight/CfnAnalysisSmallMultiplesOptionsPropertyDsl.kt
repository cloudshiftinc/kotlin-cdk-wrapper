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

  public fun maxVisibleColumns(maxVisibleColumns: Number) {
    cdkBuilder.maxVisibleColumns(maxVisibleColumns)
  }

  public fun maxVisibleRows(maxVisibleRows: Number) {
    cdkBuilder.maxVisibleRows(maxVisibleRows)
  }

  public fun panelConfiguration(panelConfiguration: IResolvable) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  public fun panelConfiguration(panelConfiguration: CfnAnalysis.PanelConfigurationProperty) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  public fun build(): CfnAnalysis.SmallMultiplesOptionsProperty = cdkBuilder.build()
}
