@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPathColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPathColorProperty.Builder =
      CfnDashboard.DataPathColorProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun element(element: IResolvable) {
    cdkBuilder.element(element)
  }

  public fun element(element: CfnDashboard.DataPathValueProperty) {
    cdkBuilder.element(element)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnDashboard.DataPathColorProperty = cdkBuilder.build()
}
