@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDropDownControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DropDownControlDisplayOptionsProperty.Builder =
      CfnDashboard.DropDownControlDisplayOptionsProperty.builder()

  /**
   * @param selectAllOptions The configuration of the `Select all` options in a dropdown control.
   */
  public fun selectAllOptions(selectAllOptions: IResolvable) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  /**
   * @param selectAllOptions The configuration of the `Select all` options in a dropdown control.
   */
  public fun selectAllOptions(selectAllOptions: CfnDashboard.ListControlSelectAllOptionsProperty) {
    cdkBuilder.selectAllOptions(selectAllOptions)
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

  public fun build(): CfnDashboard.DropDownControlDisplayOptionsProperty = cdkBuilder.build()
}
