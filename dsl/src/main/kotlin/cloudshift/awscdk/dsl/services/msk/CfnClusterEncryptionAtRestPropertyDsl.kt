@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterEncryptionAtRestPropertyDsl {
  private val cdkBuilder: CfnCluster.EncryptionAtRestProperty.Builder =
      CfnCluster.EncryptionAtRestProperty.builder()

  /**
   * @param dataVolumeKmsKeyId The ARN of the Amazon KMS key for encrypting data at rest. 
   * If you don't specify a KMS key, MSK creates one for you and uses it.
   */
  public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
    cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
  }

  public fun build(): CfnCluster.EncryptionAtRestProperty = cdkBuilder.build()
}
