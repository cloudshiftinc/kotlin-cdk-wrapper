@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateOverrideButtonConfigurationPropertyDsl {
  private val cdkBuilder: CfnInAppTemplate.OverrideButtonConfigurationProperty.Builder =
      CfnInAppTemplate.OverrideButtonConfigurationProperty.builder()

  /**
   * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
   * message.
   * You can specify one of the following:
   *
   * * `LINK` – A link to a web destination.
   * * `DEEP_LINK` – A link to a specific page in an application.
   * * `CLOSE` – Dismisses the message.
   */
  public fun buttonAction(buttonAction: String) {
    cdkBuilder.buttonAction(buttonAction)
  }

  /**
   * @param link The destination (such as a URL) for a button.
   */
  public fun link(link: String) {
    cdkBuilder.link(link)
  }

  public fun build(): CfnInAppTemplate.OverrideButtonConfigurationProperty = cdkBuilder.build()
}
