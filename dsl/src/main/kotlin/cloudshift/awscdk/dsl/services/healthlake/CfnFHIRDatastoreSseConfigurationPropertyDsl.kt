@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@CdkDslMarker
public class CfnFHIRDatastoreSseConfigurationPropertyDsl {
  private val cdkBuilder: CfnFHIRDatastore.SseConfigurationProperty.Builder =
      CfnFHIRDatastore.SseConfigurationProperty.builder()

  /**
   * @param kmsEncryptionConfig The server-side encryption key configuration for a customer provided
   * encryption key (CMK). 
   */
  public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  /**
   * @param kmsEncryptionConfig The server-side encryption key configuration for a customer provided
   * encryption key (CMK). 
   */
  public
      fun kmsEncryptionConfig(kmsEncryptionConfig: CfnFHIRDatastore.KmsEncryptionConfigProperty) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  public fun build(): CfnFHIRDatastore.SseConfigurationProperty = cdkBuilder.build()
}
