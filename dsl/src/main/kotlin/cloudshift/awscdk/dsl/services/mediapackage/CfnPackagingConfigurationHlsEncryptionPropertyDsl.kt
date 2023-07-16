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

  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  public fun encryptionMethod(encryptionMethod: String) {
    cdkBuilder.encryptionMethod(encryptionMethod)
  }

  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public
      fun spekeKeyProvider(spekeKeyProvider: CfnPackagingConfiguration.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnPackagingConfiguration.HlsEncryptionProperty = cdkBuilder.build()
}
