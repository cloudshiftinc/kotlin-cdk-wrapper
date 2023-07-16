@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisTickLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisTickLabelOptionsProperty.Builder =
      CfnTemplate.AxisTickLabelOptionsProperty.builder()

  public fun labelOptions(labelOptions: IResolvable) {
    cdkBuilder.labelOptions(labelOptions)
  }

  public fun labelOptions(labelOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.labelOptions(labelOptions)
  }

  public fun rotationAngle(rotationAngle: Number) {
    cdkBuilder.rotationAngle(rotationAngle)
  }

  public fun build(): CfnTemplate.AxisTickLabelOptionsProperty = cdkBuilder.build()
}
