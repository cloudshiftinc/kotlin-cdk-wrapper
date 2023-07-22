@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFieldLabelTypePropertyDsl {
  private val cdkBuilder: CfnDashboard.FieldLabelTypeProperty.Builder =
      CfnDashboard.FieldLabelTypeProperty.builder()

  /**
   * @param fieldId Indicates the field that is targeted by the field label.
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param visibility The visibility of the field label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.FieldLabelTypeProperty = cdkBuilder.build()
}
