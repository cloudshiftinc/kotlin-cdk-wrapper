@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAc3SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Ac3SettingsProperty.Builder =
      CfnChannel.Ac3SettingsProperty.builder()

  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  public fun bitstreamMode(bitstreamMode: String) {
    cdkBuilder.bitstreamMode(bitstreamMode)
  }

  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  public fun dialnorm(dialnorm: Number) {
    cdkBuilder.dialnorm(dialnorm)
  }

  public fun drcProfile(drcProfile: String) {
    cdkBuilder.drcProfile(drcProfile)
  }

  public fun lfeFilter(lfeFilter: String) {
    cdkBuilder.lfeFilter(lfeFilter)
  }

  public fun metadataControl(metadataControl: String) {
    cdkBuilder.metadataControl(metadataControl)
  }

  public fun build(): CfnChannel.Ac3SettingsProperty = cdkBuilder.build()
}
