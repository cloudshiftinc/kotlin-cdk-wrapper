@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationMssEncryptionPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.MssEncryptionProperty.Builder =
      CfnPackagingConfiguration.MssEncryptionProperty.builder()

  public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public
      fun spekeKeyProvider(spekeKeyProvider: CfnPackagingConfiguration.SpekeKeyProviderProperty) {
    cdkBuilder.spekeKeyProvider(spekeKeyProvider)
  }

  public fun build(): CfnPackagingConfiguration.MssEncryptionProperty = cdkBuilder.build()
}
