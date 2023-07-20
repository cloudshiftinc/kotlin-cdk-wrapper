@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataPathValuePropertyDsl {
  private val cdkBuilder: CfnTemplate.DataPathValueProperty.Builder =
      CfnTemplate.DataPathValueProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun fieldValue(fieldValue: String) {
    cdkBuilder.fieldValue(fieldValue)
  }

  public fun build(): CfnTemplate.DataPathValueProperty = cdkBuilder.build()
}
