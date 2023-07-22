@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableEncryptionSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.EncryptionSpecificationProperty.Builder =
      CfnTable.EncryptionSpecificationProperty.builder()

  /**
   * @param encryptionType The encryption at rest options for the table. 
   * * *AWS owned key* (default) - `AWS_OWNED_KMS_KEY`
   * * *Customer managed key* - `CUSTOMER_MANAGED_KMS_KEY`
   *
   *
   * If you choose `CUSTOMER_MANAGED_KMS_KEY` , a `kms_key_identifier` in the format of a key ARN is
   * required.
   *
   *
   * Valid values: `CUSTOMER_MANAGED_KMS_KEY` | `AWS_OWNED_KMS_KEY` .
   */
  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  /**
   * @param kmsKeyIdentifier Requires a `kms_key_identifier` in the format of a key ARN.
   */
  public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
    cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
  }

  public fun build(): CfnTable.EncryptionSpecificationProperty = cdkBuilder.build()
}
