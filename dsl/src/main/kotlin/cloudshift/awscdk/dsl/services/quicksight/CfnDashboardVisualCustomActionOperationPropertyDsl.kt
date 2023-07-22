@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualCustomActionOperationPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualCustomActionOperationProperty.Builder =
      CfnDashboard.VisualCustomActionOperationProperty.builder()

  /**
   * @param filterOperation The filter operation that filters data included in a visual or in an
   * entire sheet.
   */
  public fun filterOperation(filterOperation: IResolvable) {
    cdkBuilder.filterOperation(filterOperation)
  }

  /**
   * @param filterOperation The filter operation that filters data included in a visual or in an
   * entire sheet.
   */
  public fun filterOperation(filterOperation: CfnDashboard.CustomActionFilterOperationProperty) {
    cdkBuilder.filterOperation(filterOperation)
  }

  /**
   * @param navigationOperation The navigation operation that navigates between different sheets in
   * the same analysis.
   */
  public fun navigationOperation(navigationOperation: IResolvable) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  /**
   * @param navigationOperation The navigation operation that navigates between different sheets in
   * the same analysis.
   */
  public
      fun navigationOperation(navigationOperation: CfnDashboard.CustomActionNavigationOperationProperty) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  /**
   * @param setParametersOperation The set parameter operation that sets parameters in custom
   * action.
   */
  public fun setParametersOperation(setParametersOperation: IResolvable) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  /**
   * @param setParametersOperation The set parameter operation that sets parameters in custom
   * action.
   */
  public
      fun setParametersOperation(setParametersOperation: CfnDashboard.CustomActionSetParametersOperationProperty) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  /**
   * @param urlOperation The URL operation that opens a link to another webpage.
   */
  public fun urlOperation(urlOperation: IResolvable) {
    cdkBuilder.urlOperation(urlOperation)
  }

  /**
   * @param urlOperation The URL operation that opens a link to another webpage.
   */
  public fun urlOperation(urlOperation: CfnDashboard.CustomActionURLOperationProperty) {
    cdkBuilder.urlOperation(urlOperation)
  }

  public fun build(): CfnDashboard.VisualCustomActionOperationProperty = cdkBuilder.build()
}
