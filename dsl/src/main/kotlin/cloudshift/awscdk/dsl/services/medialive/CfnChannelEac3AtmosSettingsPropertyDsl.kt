@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEac3AtmosSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Eac3AtmosSettingsProperty.Builder =
      CfnChannel.Eac3AtmosSettingsProperty.builder()

  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  public fun dialnorm(dialnorm: Number) {
    cdkBuilder.dialnorm(dialnorm)
  }

  public fun drcLine(drcLine: String) {
    cdkBuilder.drcLine(drcLine)
  }

  public fun drcRf(drcRf: String) {
    cdkBuilder.drcRf(drcRf)
  }

  public fun heightTrim(heightTrim: Number) {
    cdkBuilder.heightTrim(heightTrim)
  }

  public fun surroundTrim(surroundTrim: Number) {
    cdkBuilder.surroundTrim(surroundTrim)
  }

  public fun build(): CfnChannel.Eac3AtmosSettingsProperty = cdkBuilder.build()
}
