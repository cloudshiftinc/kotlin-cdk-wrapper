@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMpeg2FilterSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Mpeg2FilterSettingsProperty.Builder =
      CfnChannel.Mpeg2FilterSettingsProperty.builder()

  public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  public
      fun temporalFilterSettings(temporalFilterSettings: CfnChannel.TemporalFilterSettingsProperty) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  public fun build(): CfnChannel.Mpeg2FilterSettingsProperty = cdkBuilder.build()
}
