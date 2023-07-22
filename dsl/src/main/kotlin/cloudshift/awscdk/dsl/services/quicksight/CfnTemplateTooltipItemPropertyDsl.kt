@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTooltipItemPropertyDsl {
  private val cdkBuilder: CfnTemplate.TooltipItemProperty.Builder =
      CfnTemplate.TooltipItemProperty.builder()

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: IResolvable) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: CfnTemplate.ColumnTooltipItemProperty) {
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
  public fun fieldTooltipItem(fieldTooltipItem: CfnTemplate.FieldTooltipItemProperty) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  public fun build(): CfnTemplate.TooltipItemProperty = cdkBuilder.build()
}
