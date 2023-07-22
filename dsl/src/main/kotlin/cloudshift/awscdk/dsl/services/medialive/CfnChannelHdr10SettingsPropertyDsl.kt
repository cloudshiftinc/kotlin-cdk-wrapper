@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHdr10SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Hdr10SettingsProperty.Builder =
      CfnChannel.Hdr10SettingsProperty.builder()

  /**
   * @param maxCll Maximum Content Light Level An integer metadata value defining the maximum light
   * level, in nits, of any single pixel within an encoded HDR video stream or file.
   */
  public fun maxCll(maxCll: Number) {
    cdkBuilder.maxCll(maxCll)
  }

  /**
   * @param maxFall Maximum Frame Average Light Level An integer metadata value defining the maximum
   * average light level, in nits, for any single frame within an encoded HDR video stream or file.
   */
  public fun maxFall(maxFall: Number) {
    cdkBuilder.maxFall(maxFall)
  }

  public fun build(): CfnChannel.Hdr10SettingsProperty = cdkBuilder.build()
}
