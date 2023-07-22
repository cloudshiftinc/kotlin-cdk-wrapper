@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardEntityPropertyDsl {
  private val cdkBuilder: CfnDashboard.EntityProperty.Builder =
      CfnDashboard.EntityProperty.builder()

  /**
   * @param path The hierarchical path of the entity within the analysis, template, or dashboard
   * definition tree.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnDashboard.EntityProperty = cdkBuilder.build()
}
