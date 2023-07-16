@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.EncryptionContractConfigurationProperty.Builder
      = CfnPackagingConfiguration.EncryptionContractConfigurationProperty.builder()

  public fun build(): CfnPackagingConfiguration.EncryptionContractConfigurationProperty =
      cdkBuilder.build()
}
