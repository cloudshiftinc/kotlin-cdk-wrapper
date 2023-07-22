@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAncillarySourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AncillarySourceSettingsProperty.Builder =
      CfnChannel.AncillarySourceSettingsProperty.builder()

  /**
   * @param sourceAncillaryChannelNumber Specifies the number (1 to 4) of the captions channel you
   * want to extract from the ancillary captions.
   * If you plan to convert the ancillary captions to another format, complete this field. If you
   * plan to choose Embedded as the captions destination in the output (to pass through all the
   * channels in the ancillary captions), leave this field blank because MediaLive ignores the field.
   */
  public fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
    cdkBuilder.sourceAncillaryChannelNumber(sourceAncillaryChannelNumber)
  }

  public fun build(): CfnChannel.AncillarySourceSettingsProperty = cdkBuilder.build()
}
