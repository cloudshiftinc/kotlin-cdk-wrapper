@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineStyleConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineStyleConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineStyleConfigurationProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnDashboard.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
