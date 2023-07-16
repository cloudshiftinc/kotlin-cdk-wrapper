@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointEncryptionContractConfigurationPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder =
      CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

  public fun build(): CfnOriginEndpoint.EncryptionContractConfigurationProperty = cdkBuilder.build()
}
