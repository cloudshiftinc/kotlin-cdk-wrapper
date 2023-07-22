@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTooltipItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.TooltipItemProperty.Builder =
      CfnDashboard.TooltipItemProperty.builder()

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: IResolvable) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: CfnDashboard.ColumnTooltipItemProperty) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  /**
   * @param fieldTooltipItem The tooltip item for the fields.
   */
  public fun fieldTooltipItem(fieldTooltipItem: IResolvable) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  /**
   * @param fieldTooltipItem The tooltip item for the fields.
   */
  public fun fieldTooltipItem(fieldTooltipItem: CfnDashboard.FieldTooltipItemProperty) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  public fun build(): CfnDashboard.TooltipItemProperty = cdkBuilder.build()
}
