@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVideoSelectorProgramIdPropertyDsl {
  private val cdkBuilder: CfnChannel.VideoSelectorProgramIdProperty.Builder =
      CfnChannel.VideoSelectorProgramIdProperty.builder()

  /**
   * @param programId Selects a specific program from within a multi-program transport stream.
   * If the program doesn't exist, MediaLive selects the first program within the transport stream
   * by default.
   */
  public fun programId(programId: Number) {
    cdkBuilder.programId(programId)
  }

  public fun build(): CfnChannel.VideoSelectorProgramIdProperty = cdkBuilder.build()
}
