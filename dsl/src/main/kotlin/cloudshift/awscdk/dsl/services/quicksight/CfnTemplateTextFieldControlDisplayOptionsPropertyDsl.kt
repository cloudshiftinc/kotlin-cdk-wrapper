@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTextFieldControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TextFieldControlDisplayOptionsProperty.Builder =
      CfnTemplate.TextFieldControlDisplayOptionsProperty.builder()

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text field control.
   */
  public fun placeholderOptions(placeholderOptions: IResolvable) {
    cdkBuilder.placeholderOptions(placeholderOptions)
  }

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text field control.
   */
  public
      fun placeholderOptions(placeholderOptions: CfnTemplate.TextControlPlaceholderOptionsProperty) {
    cdkBuilder.placeholderOptions(placeholderOptions)
  }

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

  public fun build(): CfnTemplate.TextFieldControlDisplayOptionsProperty = cdkBuilder.build()
}
