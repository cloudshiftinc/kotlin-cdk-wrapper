@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSliderControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SliderControlDisplayOptionsProperty.Builder =
      CfnTemplate.SliderControlDisplayOptionsProperty.builder()

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnTemplate.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
