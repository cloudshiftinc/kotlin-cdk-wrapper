@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetControlLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetControlLayoutConfigurationProperty.Builder =
      CfnDashboard.SheetControlLayoutConfigurationProperty.builder()

  /**
   * @param gridLayout The configuration that determines the elements and canvas size options of
   * sheet control.
   */
  public fun gridLayout(gridLayout: IResolvable) {
    cdkBuilder.gridLayout(gridLayout)
  }

  /**
   * @param gridLayout The configuration that determines the elements and canvas size options of
   * sheet control.
   */
  public fun gridLayout(gridLayout: CfnDashboard.GridLayoutConfigurationProperty) {
    cdkBuilder.gridLayout(gridLayout)
  }

  public fun build(): CfnDashboard.SheetControlLayoutConfigurationProperty = cdkBuilder.build()
}
