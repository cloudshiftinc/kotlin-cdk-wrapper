@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsOutputSettingsProperty.Builder =
      CfnChannel.HlsOutputSettingsProperty.builder()

  /**
   * @param h265PackagingType Only applicable when this output is referencing an H.265 video
   * description. Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
   */
  public fun h265PackagingType(h265PackagingType: String) {
    cdkBuilder.h265PackagingType(h265PackagingType)
  }

  /**
   * @param hlsSettings The settings regarding the underlying stream.
   * These settings are different for audio-only outputs.
   */
  public fun hlsSettings(hlsSettings: IResolvable) {
    cdkBuilder.hlsSettings(hlsSettings)
  }

  /**
   * @param hlsSettings The settings regarding the underlying stream.
   * These settings are different for audio-only outputs.
   */
  public fun hlsSettings(hlsSettings: CfnChannel.HlsSettingsProperty) {
    cdkBuilder.hlsSettings(hlsSettings)
  }

  /**
   * @param nameModifier A string that is concatenated to the end of the destination file name.
   * Accepts "Format Identifiers":#formatIdentifierParameters.
   */
  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  /**
   * @param segmentModifier A string that is concatenated to the end of segment file names.
   */
  public fun segmentModifier(segmentModifier: String) {
    cdkBuilder.segmentModifier(segmentModifier)
  }

  public fun build(): CfnChannel.HlsOutputSettingsProperty = cdkBuilder.build()
}
