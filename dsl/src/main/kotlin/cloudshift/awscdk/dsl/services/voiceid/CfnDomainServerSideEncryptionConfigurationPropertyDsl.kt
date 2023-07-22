@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.voiceid

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.voiceid.CfnDomain

@CdkDslMarker
public class CfnDomainServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder =
      CfnDomain.ServerSideEncryptionConfigurationProperty.builder()

  /**
   * @param kmsKeyId The identifier of the KMS key to use to encrypt data stored by Voice ID. 
   * Voice ID doesn't support asymmetric customer managed keys .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnDomain.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}
