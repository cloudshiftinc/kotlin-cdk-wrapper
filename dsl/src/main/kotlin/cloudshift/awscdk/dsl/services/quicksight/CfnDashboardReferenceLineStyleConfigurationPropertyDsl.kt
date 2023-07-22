@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineStyleConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineStyleConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineStyleConfigurationProperty.builder()

  /**
   * @param color The hex color of the reference line.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param pattern The pattern type of the line style. Choose one of the following options:.
   * * `SOLID`
   * * `DASHED`
   * * `DOTTED`
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnDashboard.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
