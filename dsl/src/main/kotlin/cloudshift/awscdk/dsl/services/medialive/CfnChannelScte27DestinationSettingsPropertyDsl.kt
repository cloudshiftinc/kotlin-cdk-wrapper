@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of SCTE-27 captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Scte27DestinationSettingsProperty scte27DestinationSettingsProperty =
 * Scte27DestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27destinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelScte27DestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte27DestinationSettingsProperty.Builder =
      CfnChannel.Scte27DestinationSettingsProperty.builder()

  public fun build(): CfnChannel.Scte27DestinationSettingsProperty = cdkBuilder.build()
}
