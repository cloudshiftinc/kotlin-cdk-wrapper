@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsInputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsInputSettingsProperty.Builder =
      CfnChannel.HlsInputSettingsProperty.builder()

  public fun bandwidth(bandwidth: Number) {
    cdkBuilder.bandwidth(bandwidth)
  }

  public fun bufferSegments(bufferSegments: Number) {
    cdkBuilder.bufferSegments(bufferSegments)
  }

  public fun retries(retries: Number) {
    cdkBuilder.retries(retries)
  }

  public fun retryInterval(retryInterval: Number) {
    cdkBuilder.retryInterval(retryInterval)
  }

  public fun scte35Source(scte35Source: String) {
    cdkBuilder.scte35Source(scte35Source)
  }

  public fun build(): CfnChannel.HlsInputSettingsProperty = cdkBuilder.build()
}
