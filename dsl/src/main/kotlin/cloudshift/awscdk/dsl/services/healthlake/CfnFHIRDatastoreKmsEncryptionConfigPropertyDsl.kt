@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@CdkDslMarker
public class CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl {
  private val cdkBuilder: CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder =
      CfnFHIRDatastore.KmsEncryptionConfigProperty.builder()

  /**
   * @param cmkType The type of customer-managed-key(CMK) used for encryption. 
   * The two types of supported CMKs are customer owned CMKs and Amazon owned CMKs. For more
   * information on CMK types, see
   * [KmsEncryptionConfig](https://docs.aws.amazon.com/healthlake/latest/APIReference/API_KmsEncryptionConfig.html#HealthLake-Type-KmsEncryptionConfig-CmkType)
   * .
   */
  public fun cmkType(cmkType: String) {
    cdkBuilder.cmkType(cmkType)
  }

  /**
   * @param kmsKeyId The KMS encryption key id/alias used to encrypt the Data Store contents at
   * rest.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnFHIRDatastore.KmsEncryptionConfigProperty = cdkBuilder.build()
}
