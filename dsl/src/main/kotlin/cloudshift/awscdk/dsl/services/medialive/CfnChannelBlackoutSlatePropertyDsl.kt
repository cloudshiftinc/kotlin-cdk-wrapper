@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for a blackout slate.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * BlackoutSlateProperty blackoutSlateProperty = BlackoutSlateProperty.builder()
 * .blackoutSlateImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .networkEndBlackout("networkEndBlackout")
 * .networkEndBlackoutImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .networkId("networkId")
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-blackoutslate.html)
 */
@CdkDslMarker
public class CfnChannelBlackoutSlatePropertyDsl {
  private val cdkBuilder: CfnChannel.BlackoutSlateProperty.Builder =
      CfnChannel.BlackoutSlateProperty.builder()

  /**
   * @param blackoutSlateImage The blackout slate image to be used.
   * Keep empty for solid black. Only .bmp and .png images are supported.
   */
  public fun blackoutSlateImage(blackoutSlateImage: IResolvable) {
    cdkBuilder.blackoutSlateImage(blackoutSlateImage)
  }

  /**
   * @param blackoutSlateImage The blackout slate image to be used.
   * Keep empty for solid black. Only .bmp and .png images are supported.
   */
  public fun blackoutSlateImage(blackoutSlateImage: CfnChannel.InputLocationProperty) {
    cdkBuilder.blackoutSlateImage(blackoutSlateImage)
  }

  /**
   * @param networkEndBlackout Setting to enabled causes MediaLive to blackout the video, audio, and
   * captions, and raise the "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation
   * Descriptor is encountered.
   * The blackout is lifted when the Network Start Segmentation Descriptor is encountered. The
   * Network End and Network Start descriptors must contain a network ID that matches the value entered
   * in Network ID.
   */
  public fun networkEndBlackout(networkEndBlackout: String) {
    cdkBuilder.networkEndBlackout(networkEndBlackout)
  }

  /**
   * @param networkEndBlackoutImage The path to the local file to use as the Network End Blackout
   * image.
   * The image is scaled to fill the entire output raster.
   */
  public fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable) {
    cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage)
  }

  /**
   * @param networkEndBlackoutImage The path to the local file to use as the Network End Blackout
   * image.
   * The image is scaled to fill the entire output raster.
   */
  public fun networkEndBlackoutImage(networkEndBlackoutImage: CfnChannel.InputLocationProperty) {
    cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage)
  }

  /**
   * @param networkId Provides a Network ID that matches EIDR ID format (for example,
   * "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
   */
  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  /**
   * @param state When set to enabled, this causes video, audio, and captions to be blanked when
   * indicated by program metadata.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnChannel.BlackoutSlateProperty = cdkBuilder.build()
}
