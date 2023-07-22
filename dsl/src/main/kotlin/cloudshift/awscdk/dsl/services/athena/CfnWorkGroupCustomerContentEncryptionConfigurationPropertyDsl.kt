@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder =
      CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder()

  /**
   * @param kmsKey The KMS key that is used to encrypt the user's data stores in Athena. 
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty =
      cdkBuilder.build()
}
