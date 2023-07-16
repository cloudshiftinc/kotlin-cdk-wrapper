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

  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  public fun encryptionMethod(encryptionMethod: String) {
    cdkBuilder.encryptionMethod(encryptionMethod)
  }

  public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
    cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
  }

  public fun repeatExtXKey(repeatExtXKey: Boolean) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  public fun repeatExtXKey(repeatExtXKey: IResolvable) {
    cdkBuilder.repeatExtXKey(repeatExtXKey)
  }

  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnOriginEndpoint.HlsEncryptionProperty = cdkBuilder.build()
}
