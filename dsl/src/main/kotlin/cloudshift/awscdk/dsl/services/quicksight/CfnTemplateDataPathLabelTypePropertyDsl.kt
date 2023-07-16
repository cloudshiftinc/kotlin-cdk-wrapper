@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataPathLabelTypePropertyDsl {
  private val cdkBuilder: CfnTemplate.DataPathLabelTypeProperty.Builder =
      CfnTemplate.DataPathLabelTypeProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun fieldValue(fieldValue: String) {
    cdkBuilder.fieldValue(fieldValue)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.DataPathLabelTypeProperty = cdkBuilder.build()
}
