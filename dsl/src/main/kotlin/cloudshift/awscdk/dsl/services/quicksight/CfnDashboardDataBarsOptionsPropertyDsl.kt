@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataBarsOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataBarsOptionsProperty.Builder =
      CfnDashboard.DataBarsOptionsProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun negativeColor(negativeColor: String) {
    cdkBuilder.negativeColor(negativeColor)
  }

  public fun positiveColor(positiveColor: String) {
    cdkBuilder.positiveColor(positiveColor)
  }

  public fun build(): CfnDashboard.DataBarsOptionsProperty = cdkBuilder.build()
}
