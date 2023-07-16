@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFontSizePropertyDsl {
  private val cdkBuilder: CfnDashboard.FontSizeProperty.Builder =
      CfnDashboard.FontSizeProperty.builder()

  public fun relative(relative: String) {
    cdkBuilder.relative(relative)
  }

  public fun build(): CfnDashboard.FontSizeProperty = cdkBuilder.build()
}
