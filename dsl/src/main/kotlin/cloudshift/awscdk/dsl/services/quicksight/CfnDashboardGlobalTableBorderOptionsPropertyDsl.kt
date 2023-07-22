@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGlobalTableBorderOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GlobalTableBorderOptionsProperty.Builder =
      CfnDashboard.GlobalTableBorderOptionsProperty.builder()

  /**
   * @param sideSpecificBorder Determines the options for side specific border.
   */
  public fun sideSpecificBorder(sideSpecificBorder: IResolvable) {
    cdkBuilder.sideSpecificBorder(sideSpecificBorder)
  }

  /**
   * @param sideSpecificBorder Determines the options for side specific border.
   */
  public fun sideSpecificBorder(sideSpecificBorder: CfnDashboard.TableSideBorderOptionsProperty) {
    cdkBuilder.sideSpecificBorder(sideSpecificBorder)
  }

  /**
   * @param uniformBorder Determines the options for uniform border.
   */
  public fun uniformBorder(uniformBorder: IResolvable) {
    cdkBuilder.uniformBorder(uniformBorder)
  }

  /**
   * @param uniformBorder Determines the options for uniform border.
   */
  public fun uniformBorder(uniformBorder: CfnDashboard.TableBorderOptionsProperty) {
    cdkBuilder.uniformBorder(uniformBorder)
  }

  public fun build(): CfnDashboard.GlobalTableBorderOptionsProperty = cdkBuilder.build()
}
