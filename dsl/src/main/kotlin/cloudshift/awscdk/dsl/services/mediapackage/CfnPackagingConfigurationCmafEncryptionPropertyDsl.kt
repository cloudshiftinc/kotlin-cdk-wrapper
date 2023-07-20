@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationCmafEncryptionPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.CmafEncryptionProperty.Builder =
      CfnPackagingConfiguration.CmafEncryptionProperty.builder()

  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public
      fun spekeKeyProvider(spekeKeyProvider: CfnPackagingConfiguration.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnPackagingConfiguration.CmafEncryptionProperty = cdkBuilder.build()
}
