@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointCmafEncryptionPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.CmafEncryptionProperty.Builder =
      CfnOriginEndpoint.CmafEncryptionProperty.builder()

  /**
   * @param constantInitializationVector An optional 128-bit, 16-byte hex value represented by a
   * 32-character string, used in conjunction with the key for encrypting blocks.
   * If you don't specify a value, then AWS Elemental MediaPackage creates the constant
   * initialization vector (IV).
   */
  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  /**
   * @param encryptionMethod The encryption method to use.
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

  public fun build(): CfnOriginEndpoint.CmafEncryptionProperty = cdkBuilder.build()
}
