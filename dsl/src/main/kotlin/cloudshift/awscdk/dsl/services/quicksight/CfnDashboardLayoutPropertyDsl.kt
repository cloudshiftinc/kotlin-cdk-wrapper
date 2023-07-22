@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLayoutPropertyDsl {
  private val cdkBuilder: CfnDashboard.LayoutProperty.Builder =
      CfnDashboard.LayoutProperty.builder()

  /**
   * @param configuration The configuration that determines what the type of layout for a sheet. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration that determines what the type of layout for a sheet. 
   */
  public fun configuration(configuration: CfnDashboard.LayoutConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnDashboard.LayoutProperty = cdkBuilder.build()
}
