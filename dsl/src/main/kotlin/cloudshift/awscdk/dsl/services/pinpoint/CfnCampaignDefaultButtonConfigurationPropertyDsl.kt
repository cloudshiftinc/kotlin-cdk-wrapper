@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignDefaultButtonConfigurationPropertyDsl {
  private val cdkBuilder: CfnCampaign.DefaultButtonConfigurationProperty.Builder =
      CfnCampaign.DefaultButtonConfigurationProperty.builder()

  /**
   * @param backgroundColor The background color of a button, expressed as a hex color code (such as
   * #000000 for black).
   */
  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param borderRadius The border radius of a button.
   */
  public fun borderRadius(borderRadius: Number) {
    cdkBuilder.borderRadius(borderRadius)
  }

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

  /**
   * @param text The text that appears on a button in an in-app message.
   */
  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  /**
   * @param textColor The color of the body text in a button, expressed as a hex color code (such as
   * #000000 for black).
   */
  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnCampaign.DefaultButtonConfigurationProperty = cdkBuilder.build()
}
