@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPathValuePropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPathValueProperty.Builder =
      CfnDashboard.DataPathValueProperty.builder()

  /**
   * @param fieldId The field ID of the field that needs to be sorted. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param fieldValue The actual value of the field that needs to be sorted. 
   */
  public fun fieldValue(fieldValue: String) {
    cdkBuilder.fieldValue(fieldValue)
  }

  public fun build(): CfnDashboard.DataPathValueProperty = cdkBuilder.build()
}
