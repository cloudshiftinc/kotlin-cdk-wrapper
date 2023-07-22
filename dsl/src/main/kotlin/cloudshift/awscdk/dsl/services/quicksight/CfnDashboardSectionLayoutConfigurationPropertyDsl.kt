@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSectionLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionLayoutConfigurationProperty.Builder =
      CfnDashboard.SectionLayoutConfigurationProperty.builder()

  /**
   * @param freeFormLayout The free-form layout configuration of a section. 
   */
  public fun freeFormLayout(freeFormLayout: IResolvable) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  /**
   * @param freeFormLayout The free-form layout configuration of a section. 
   */
  public
      fun freeFormLayout(freeFormLayout: CfnDashboard.FreeFormSectionLayoutConfigurationProperty) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  public fun build(): CfnDashboard.SectionLayoutConfigurationProperty = cdkBuilder.build()
}
