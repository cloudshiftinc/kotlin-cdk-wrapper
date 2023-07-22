@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The Akamai settings in an HLS output.
 *
 * The parent of this entity is HlsCdnSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsAkamaiSettingsProperty hlsAkamaiSettingsProperty = HlsAkamaiSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .salt("salt")
 * .token("token")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsakamaisettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsAkamaiSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsAkamaiSettingsProperty.Builder =
      CfnChannel.HlsAkamaiSettingsProperty.builder()

  /**
   * @param connectionRetryInterval The number of seconds to wait before retrying a connection to
   * the CDN if the connection is lost.
   */
  public fun connectionRetryInterval(connectionRetryInterval: Number) {
    cdkBuilder.connectionRetryInterval(connectionRetryInterval)
  }

  /**
   * @param filecacheDuration The size, in seconds, of the file cache for streaming outputs.
   */
  public fun filecacheDuration(filecacheDuration: Number) {
    cdkBuilder.filecacheDuration(filecacheDuration)
  }

  /**
   * @param httpTransferMode Specifies whether to use chunked transfer encoding to Akamai.
   * To enable this feature, contact Akamai.
   */
  public fun httpTransferMode(httpTransferMode: String) {
    cdkBuilder.httpTransferMode(httpTransferMode)
  }

  /**
   * @param numRetries The number of retry attempts that will be made before the channel is put into
   * an error state.
   */
  public fun numRetries(numRetries: Number) {
    cdkBuilder.numRetries(numRetries)
  }

  /**
   * @param restartDelay If a streaming output fails, the number of seconds to wait until a restart
   * is initiated.
   * A value of 0 means never restart.
   */
  public fun restartDelay(restartDelay: Number) {
    cdkBuilder.restartDelay(restartDelay)
  }

  /**
   * @param salt The salt for authenticated Akamai.
   */
  public fun salt(salt: String) {
    cdkBuilder.salt(salt)
  }

  /**
   * @param token The token parameter for authenticated Akamai.
   * If this is not specified, *gda* is used.
   */
  public fun token(token: String) {
    cdkBuilder.token(token)
  }

  public fun build(): CfnChannel.HlsAkamaiSettingsProperty = cdkBuilder.build()
}
