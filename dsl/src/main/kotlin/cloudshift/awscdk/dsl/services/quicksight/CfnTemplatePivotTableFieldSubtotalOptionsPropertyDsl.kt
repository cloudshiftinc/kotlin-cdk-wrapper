@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableFieldSubtotalOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableFieldSubtotalOptionsProperty.Builder =
      CfnTemplate.PivotTableFieldSubtotalOptionsProperty.builder()

  /**
   * @param fieldId The field ID of the subtotal options.
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnTemplate.PivotTableFieldSubtotalOptionsProperty = cdkBuilder.build()
}
