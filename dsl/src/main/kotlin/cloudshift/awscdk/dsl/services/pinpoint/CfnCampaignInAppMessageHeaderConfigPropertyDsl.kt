@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignInAppMessageHeaderConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.InAppMessageHeaderConfigProperty.Builder =
      CfnCampaign.InAppMessageHeaderConfigProperty.builder()

  /**
   * @param alignment The text alignment of the title of the message.
   * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
   */
  public fun alignment(alignment: String) {
    cdkBuilder.alignment(alignment)
  }

  /**
   * @param header The header or title text of the in-app message.
   */
  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param textColor The color of the body text, expressed as a string consisting of a hex color
   * code (such as "#000000" for black).
   */
  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnCampaign.InAppMessageHeaderConfigProperty = cdkBuilder.build()
}
