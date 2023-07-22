@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of ad avail blanking in the output.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AvailBlankingProperty availBlankingProperty = AvailBlankingProperty.builder()
 * .availBlankingImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-availblanking.html)
 */
@CdkDslMarker
public class CfnChannelAvailBlankingPropertyDsl {
  private val cdkBuilder: CfnChannel.AvailBlankingProperty.Builder =
      CfnChannel.AvailBlankingProperty.builder()

  /**
   * @param availBlankingImage The blanking image to be used.
   * Keep empty for solid black. Only .bmp and .png images are supported.
   */
  public fun availBlankingImage(availBlankingImage: IResolvable) {
    cdkBuilder.availBlankingImage(availBlankingImage)
  }

  /**
   * @param availBlankingImage The blanking image to be used.
   * Keep empty for solid black. Only .bmp and .png images are supported.
   */
  public fun availBlankingImage(availBlankingImage: CfnChannel.InputLocationProperty) {
    cdkBuilder.availBlankingImage(availBlankingImage)
  }

  /**
   * @param state When set to enabled, the video, audio, and captions are blanked when insertion
   * metadata is added.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnChannel.AvailBlankingProperty = cdkBuilder.build()
}
