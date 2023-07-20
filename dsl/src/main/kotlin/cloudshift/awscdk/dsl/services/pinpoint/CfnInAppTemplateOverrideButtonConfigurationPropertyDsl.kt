@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateOverrideButtonConfigurationPropertyDsl {
  private val cdkBuilder: CfnInAppTemplate.OverrideButtonConfigurationProperty.Builder =
      CfnInAppTemplate.OverrideButtonConfigurationProperty.builder()

  public fun buttonAction(buttonAction: String) {
    cdkBuilder.buttonAction(buttonAction)
  }

  public fun link(link: String) {
    cdkBuilder.link(link)
  }

  public fun build(): CfnInAppTemplate.OverrideButtonConfigurationProperty = cdkBuilder.build()
}
