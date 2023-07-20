@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLegendOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LegendOptionsProperty.Builder =
      CfnDashboard.LegendOptionsProperty.builder()

  public fun height(height: String) {
    cdkBuilder.height(height)
  }

  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  public fun title(title: CfnDashboard.LabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnDashboard.LegendOptionsProperty = cdkBuilder.build()
}
