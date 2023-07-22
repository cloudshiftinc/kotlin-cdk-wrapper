@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Destination settings for a Multiplex output.
 *
 * The parent of this entity is OutputDestination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexProgramChannelDestinationSettingsProperty
 * multiplexProgramChannelDestinationSettingsProperty =
 * MultiplexProgramChannelDestinationSettingsProperty.builder()
 * .multiplexId("multiplexId")
 * .programName("programName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.Builder =
      CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.builder()

  /**
   * @param multiplexId The ID of the Multiplex that the encoder is providing output to.
   * You do not need to specify the individual inputs to the Multiplex; MediaLive will handle the
   * connection of the two MediaLive pipelines to the two Multiplex instances.
   * The Multiplex must be in the same region as the Channel.
   */
  public fun multiplexId(multiplexId: String) {
    cdkBuilder.multiplexId(multiplexId)
  }

  /**
   * @param programName The program name of the Multiplex program that the encoder is providing
   * output to.
   */
  public fun programName(programName: String) {
    cdkBuilder.programName(programName)
  }

  public fun build(): CfnChannel.MultiplexProgramChannelDestinationSettingsProperty =
      cdkBuilder.build()
}
