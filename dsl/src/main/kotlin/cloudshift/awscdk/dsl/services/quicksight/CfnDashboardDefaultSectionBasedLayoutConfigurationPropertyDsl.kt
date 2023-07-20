@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDefaultSectionBasedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty.Builder =
      CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty.builder()

  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public
      fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty =
      cdkBuilder.build()
}
