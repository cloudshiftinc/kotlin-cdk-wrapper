@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnSecret

@CdkDslMarker
public class CfnSecretReplicaRegionPropertyDsl {
  private val cdkBuilder: CfnSecret.ReplicaRegionProperty.Builder =
      CfnSecret.ReplicaRegionProperty.builder()

  /**
   * @param kmsKeyId The ARN, key ID, or alias of the KMS key to encrypt the secret.
   * If you don't include this field, Secrets Manager uses `aws/secretsmanager` .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param region (Optional) A string that represents a `Region` , for example "us-east-1". 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnSecret.ReplicaRegionProperty = cdkBuilder.build()
}
