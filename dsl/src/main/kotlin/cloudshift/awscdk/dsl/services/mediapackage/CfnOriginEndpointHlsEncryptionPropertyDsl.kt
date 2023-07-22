@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointHlsEncryptionPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.HlsEncryptionProperty.Builder =
      CfnOriginEndpoint.HlsEncryptionProperty.builder()

  /**
   * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a 32-character
   * string, used with the key for encrypting blocks.
   */
  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  /**
   * @param encryptionMethod HLS encryption type.
   */
  public fun encryptionMethod(encryptionMethod: String) {
    cdkBuilder.encryptionMethod(encryptionMethod)
  }

  /**
   * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage rotates
   * to a new key.
   * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
   */
  public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
    cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
  }

  /**
   * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
   * This might result in an increase in client requests to the DRM server.
   */
  public fun repeatExtXKey(repeatExtXKey: Boolean) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  /**
   * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
   * This might result in an increase in client requests to the DRM server.
   */
  public fun repeatExtXKey(repeatExtXKey: IResolvable) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  /**
   * @param spekeKeyProvider Parameters for the SPEKE key provider. 
   */
  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  /**
   * @param spekeKeyProvider Parameters for the SPEKE key provider. 
   */
  public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnOriginEndpoint.HlsEncryptionProperty = cdkBuilder.build()
}
