@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelNetworkInputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.NetworkInputSettingsProperty.Builder =
      CfnChannel.NetworkInputSettingsProperty.builder()

  /**
   * @param hlsInputSettings Information about how to connect to the upstream system.
   */
  public fun hlsInputSettings(hlsInputSettings: IResolvable) {
    cdkBuilder.hlsInputSettings(hlsInputSettings)
  }

  /**
   * @param hlsInputSettings Information about how to connect to the upstream system.
   */
  public fun hlsInputSettings(hlsInputSettings: CfnChannel.HlsInputSettingsProperty) {
    cdkBuilder.hlsInputSettings(hlsInputSettings)
  }

  /**
   * @param serverValidation Checks HTTPS server certificates.
   * When set to checkCryptographyOnly, cryptography in the certificate is checked, but not the
   * server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) don't
   * strictly match the corresponding certificate's wildcard pattern and would otherwise cause the
   * channel to error. This setting is ignored for protocols that do not use HTTPS.
   */
  public fun serverValidation(serverValidation: String) {
    cdkBuilder.serverValidation(serverValidation)
  }

  public fun build(): CfnChannel.NetworkInputSettingsProperty = cdkBuilder.build()
}
