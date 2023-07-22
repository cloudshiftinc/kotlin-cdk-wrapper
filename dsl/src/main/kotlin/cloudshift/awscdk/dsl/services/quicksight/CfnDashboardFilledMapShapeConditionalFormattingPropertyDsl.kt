@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilledMapShapeConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapShapeConditionalFormattingProperty.Builder =
      CfnDashboard.FilledMapShapeConditionalFormattingProperty.builder()

  /**
   * @param fieldId The field ID of the filled map shape. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param format The conditional formatting that determines the background color of a filled map's
   * shape.
   */
  public fun format(format: IResolvable) {
    cdkBuilder.format(format)
  }

  /**
   * @param format The conditional formatting that determines the background color of a filled map's
   * shape.
   */
  public fun format(format: CfnDashboard.ShapeConditionalFormatProperty) {
    cdkBuilder.format(format)
  }

  public fun build(): CfnDashboard.FilledMapShapeConditionalFormattingProperty = cdkBuilder.build()
}
