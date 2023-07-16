@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTooltipItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.TooltipItemProperty.Builder =
      CfnDashboard.TooltipItemProperty.builder()

  public fun columnTooltipItem(columnTooltipItem: IResolvable) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  public fun columnTooltipItem(columnTooltipItem: CfnDashboard.ColumnTooltipItemProperty) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  public fun fieldTooltipItem(fieldTooltipItem: IResolvable) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  public fun fieldTooltipItem(fieldTooltipItem: CfnDashboard.FieldTooltipItemProperty) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  public fun build(): CfnDashboard.TooltipItemProperty = cdkBuilder.build()
}
