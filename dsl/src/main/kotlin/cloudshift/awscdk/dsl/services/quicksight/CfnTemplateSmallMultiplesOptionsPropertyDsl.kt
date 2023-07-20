@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSmallMultiplesOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SmallMultiplesOptionsProperty.Builder =
      CfnTemplate.SmallMultiplesOptionsProperty.builder()

  public fun maxVisibleColumns(maxVisibleColumns: Number) {
    cdkBuilder.maxVisibleColumns(maxVisibleColumns)
  }

  public fun maxVisibleRows(maxVisibleRows: Number) {
    cdkBuilder.maxVisibleRows(maxVisibleRows)
  }

  public fun panelConfiguration(panelConfiguration: IResolvable) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  public fun panelConfiguration(panelConfiguration: CfnTemplate.PanelConfigurationProperty) {
    cdkBuilder.panelConfiguration(panelConfiguration)
  }

  public fun build(): CfnTemplate.SmallMultiplesOptionsProperty = cdkBuilder.build()
}
