@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointDashEncryptionPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.DashEncryptionProperty.Builder =
      CfnOriginEndpoint.DashEncryptionProperty.builder()

  public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
    cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
  }

  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnOriginEndpoint.DashEncryptionProperty = cdkBuilder.build()
}
