@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateHeaderConfigPropertyDsl {
  private val cdkBuilder: CfnInAppTemplate.HeaderConfigProperty.Builder =
      CfnInAppTemplate.HeaderConfigProperty.builder()

  public fun alignment(alignment: String) {
    cdkBuilder.alignment(alignment)
  }

  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnInAppTemplate.HeaderConfigProperty = cdkBuilder.build()
}
