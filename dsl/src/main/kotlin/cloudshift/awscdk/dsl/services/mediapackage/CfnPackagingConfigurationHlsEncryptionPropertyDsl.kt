@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationHlsEncryptionPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.HlsEncryptionProperty.Builder =
      CfnPackagingConfiguration.HlsEncryptionProperty.builder()

  /**
   * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a 32-character
   * string, used with the key for encrypting blocks.
   * If you don't specify a constant initialization vector (IV), AWS Elemental MediaPackage
   * periodically rotates the IV.
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
   * @param spekeKeyProvider Parameters for the SPEKE key provider. 
   */
  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  /**
   * @param spekeKeyProvider Parameters for the SPEKE key provider. 
   */
  public
      fun spekeKeyProvider(spekeKeyProvider: CfnPackagingConfiguration.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnPackagingConfiguration.HlsEncryptionProperty = cdkBuilder.build()
}
