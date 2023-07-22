@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The input specification for this channel.
 *
 * It specifies the key characteristics of the inputs for this channel: the maximum bitrate, the
 * resolution, and the codec.
 *
 * This entity is at the top level in the channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputSpecificationProperty inputSpecificationProperty = InputSpecificationProperty.builder()
 * .codec("codec")
 * .maximumBitrate("maximumBitrate")
 * .resolution("resolution")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html)
 */
@CdkDslMarker
public class CfnChannelInputSpecificationPropertyDsl {
  private val cdkBuilder: CfnChannel.InputSpecificationProperty.Builder =
      CfnChannel.InputSpecificationProperty.builder()

  /**
   * @param codec The codec to include in the input specification for this channel.
   */
  public fun codec(codec: String) {
    cdkBuilder.codec(codec)
  }

  /**
   * @param maximumBitrate The maximum input bitrate for any input attached to this channel.
   */
  public fun maximumBitrate(maximumBitrate: String) {
    cdkBuilder.maximumBitrate(maximumBitrate)
  }

  /**
   * @param resolution The resolution for any input attached to this channel.
   */
  public fun resolution(resolution: String) {
    cdkBuilder.resolution(resolution)
  }

  public fun build(): CfnChannel.InputSpecificationProperty = cdkBuilder.build()
}
