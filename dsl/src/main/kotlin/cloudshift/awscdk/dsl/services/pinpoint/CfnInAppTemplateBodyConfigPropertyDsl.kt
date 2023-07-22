@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

@CdkDslMarker
public class CfnInAppTemplateBodyConfigPropertyDsl {
  private val cdkBuilder: CfnInAppTemplate.BodyConfigProperty.Builder =
      CfnInAppTemplate.BodyConfigProperty.builder()

  /**
   * @param alignment The text alignment of the main body text of the message.
   * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
   */
  public fun alignment(alignment: String) {
    cdkBuilder.alignment(alignment)
  }

  /**
   * @param body The main body text of the message.
   */
  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  /**
   * @param textColor The color of the body text, expressed as a hex color code (such as #000000 for
   * black).
   */
  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnInAppTemplate.BodyConfigProperty = cdkBuilder.build()
}
