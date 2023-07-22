@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioDolbyEDecodePropertyDsl {
  private val cdkBuilder: CfnChannel.AudioDolbyEDecodeProperty.Builder =
      CfnChannel.AudioDolbyEDecodeProperty.builder()

  /**
   * @param programSelection the value to be set.
   */
  public fun programSelection(programSelection: String) {
    cdkBuilder.programSelection(programSelection)
  }

  public fun build(): CfnChannel.AudioDolbyEDecodeProperty = cdkBuilder.build()
}
