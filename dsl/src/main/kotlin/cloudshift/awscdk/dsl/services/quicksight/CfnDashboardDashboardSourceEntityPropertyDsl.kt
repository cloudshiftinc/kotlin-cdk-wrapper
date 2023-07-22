@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDashboardSourceEntityPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardSourceEntityProperty.Builder =
      CfnDashboard.DashboardSourceEntityProperty.builder()

  /**
   * @param sourceTemplate Source template.
   */
  public fun sourceTemplate(sourceTemplate: IResolvable) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  /**
   * @param sourceTemplate Source template.
   */
  public fun sourceTemplate(sourceTemplate: CfnDashboard.DashboardSourceTemplateProperty) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun build(): CfnDashboard.DashboardSourceEntityProperty = cdkBuilder.build()
}
