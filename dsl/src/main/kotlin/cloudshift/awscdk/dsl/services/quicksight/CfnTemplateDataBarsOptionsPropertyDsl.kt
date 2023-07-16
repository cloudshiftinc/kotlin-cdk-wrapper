@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataBarsOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.DataBarsOptionsProperty.Builder =
      CfnTemplate.DataBarsOptionsProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun negativeColor(negativeColor: String) {
    cdkBuilder.negativeColor(negativeColor)
  }

  public fun positiveColor(positiveColor: String) {
    cdkBuilder.positiveColor(positiveColor)
  }

  public fun build(): CfnTemplate.DataBarsOptionsProperty = cdkBuilder.build()
}
