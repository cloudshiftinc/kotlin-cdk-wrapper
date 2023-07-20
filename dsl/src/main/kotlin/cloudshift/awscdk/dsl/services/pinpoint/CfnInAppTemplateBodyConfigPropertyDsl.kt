@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateBodyConfigPropertyDsl {
  private val cdkBuilder: CfnInAppTemplate.BodyConfigProperty.Builder =
      CfnInAppTemplate.BodyConfigProperty.builder()

  public fun alignment(alignment: String) {
    cdkBuilder.alignment(alignment)
  }

  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnInAppTemplate.BodyConfigProperty = cdkBuilder.build()
}
