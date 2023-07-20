@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsBasicPutSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsBasicPutSettingsProperty.Builder =
      CfnChannel.HlsBasicPutSettingsProperty.builder()

  public fun connectionRetryInterval(connectionRetryInterval: Number) {
    cdkBuilder.connectionRetryInterval(connectionRetryInterval)
  }

  public fun filecacheDuration(filecacheDuration: Number) {
    cdkBuilder.filecacheDuration(filecacheDuration)
  }

  public fun numRetries(numRetries: Number) {
    cdkBuilder.numRetries(numRetries)
  }

  public fun restartDelay(restartDelay: Number) {
    cdkBuilder.restartDelay(restartDelay)
  }

  public fun build(): CfnChannel.HlsBasicPutSettingsProperty = cdkBuilder.build()
}
