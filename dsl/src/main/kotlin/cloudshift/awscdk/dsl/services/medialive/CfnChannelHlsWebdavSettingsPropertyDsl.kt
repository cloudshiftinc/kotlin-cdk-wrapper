@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsWebdavSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsWebdavSettingsProperty.Builder =
      CfnChannel.HlsWebdavSettingsProperty.builder()

  public fun connectionRetryInterval(connectionRetryInterval: Number) {
    cdkBuilder.connectionRetryInterval(connectionRetryInterval)
  }

  public fun filecacheDuration(filecacheDuration: Number) {
    cdkBuilder.filecacheDuration(filecacheDuration)
  }

  public fun httpTransferMode(httpTransferMode: String) {
    cdkBuilder.httpTransferMode(httpTransferMode)
  }

  public fun numRetries(numRetries: Number) {
    cdkBuilder.numRetries(numRetries)
  }

  public fun restartDelay(restartDelay: Number) {
    cdkBuilder.restartDelay(restartDelay)
  }

  public fun build(): CfnChannel.HlsWebdavSettingsProperty = cdkBuilder.build()
}
