@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelH265FilterSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.H265FilterSettingsProperty.Builder =
      CfnChannel.H265FilterSettingsProperty.builder()

  /**
   * @param temporalFilterSettings Settings for applying the temporal filter to the video.
   */
  public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  /**
   * @param temporalFilterSettings Settings for applying the temporal filter to the video.
   */
  public
      fun temporalFilterSettings(temporalFilterSettings: CfnChannel.TemporalFilterSettingsProperty) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  public fun build(): CfnChannel.H265FilterSettingsProperty = cdkBuilder.build()
}
