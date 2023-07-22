@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRelativeDateTimeControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty.Builder =
      CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty.builder()

  /**
   * @param dateTimeFormat Customize how dates are formatted in controls.
   */
  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
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

  public fun build(): CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty =
      cdkBuilder.build()
}
