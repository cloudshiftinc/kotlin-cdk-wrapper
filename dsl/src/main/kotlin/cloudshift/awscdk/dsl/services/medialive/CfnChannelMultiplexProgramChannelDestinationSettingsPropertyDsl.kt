@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

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
