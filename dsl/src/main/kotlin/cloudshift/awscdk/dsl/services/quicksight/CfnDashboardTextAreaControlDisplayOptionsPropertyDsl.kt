@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTextAreaControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TextAreaControlDisplayOptionsProperty.Builder =
      CfnDashboard.TextAreaControlDisplayOptionsProperty.builder()

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text area control.
   */
  public fun placeholderOptions(placeholderOptions: IResolvable) {
    cdkBuilder.placeholderOptions(placeholderOptions)
  }

  /**
   * @param placeholderOptions The configuration of the placeholder options in a text area control.
   */
  public
      fun placeholderOptions(placeholderOptions: CfnDashboard.TextControlPlaceholderOptionsProperty) {
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
  public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnDashboard.TextAreaControlDisplayOptionsProperty = cdkBuilder.build()
}
