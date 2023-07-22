@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelWebvttDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.WebvttDestinationSettingsProperty.Builder =
      CfnChannel.WebvttDestinationSettingsProperty.builder()

  /**
   * @param styleControl Controls whether the color and position of the source captions is passed
   * through to the WebVTT output captions.
   * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't
   * pass through the style. The output captions will not contain any font styling information.
   */
  public fun styleControl(styleControl: String) {
    cdkBuilder.styleControl(styleControl)
  }

  public fun build(): CfnChannel.WebvttDestinationSettingsProperty = cdkBuilder.build()
}
