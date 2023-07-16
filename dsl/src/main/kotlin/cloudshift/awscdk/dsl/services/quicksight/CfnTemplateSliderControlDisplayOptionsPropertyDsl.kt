@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSliderControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SliderControlDisplayOptionsProperty.Builder =
      CfnTemplate.SliderControlDisplayOptionsProperty.builder()

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnTemplate.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
