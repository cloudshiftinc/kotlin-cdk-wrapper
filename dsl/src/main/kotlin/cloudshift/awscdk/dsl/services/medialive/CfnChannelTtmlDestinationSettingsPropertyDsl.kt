@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The setup of TTML captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * TtmlDestinationSettingsProperty ttmlDestinationSettingsProperty =
 * TtmlDestinationSettingsProperty.builder()
 * .styleControl("styleControl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ttmldestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelTtmlDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TtmlDestinationSettingsProperty.Builder =
      CfnChannel.TtmlDestinationSettingsProperty.builder()

  /**
   * @param styleControl When set to passthrough, passes through style and position information from
   * a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
   */
  public fun styleControl(styleControl: String) {
    cdkBuilder.styleControl(styleControl)
  }

  public fun build(): CfnChannel.TtmlDestinationSettingsProperty = cdkBuilder.build()
}
