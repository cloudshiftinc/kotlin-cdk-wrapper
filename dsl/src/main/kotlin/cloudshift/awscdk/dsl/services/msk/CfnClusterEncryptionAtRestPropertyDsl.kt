@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterEncryptionAtRestPropertyDsl {
  private val cdkBuilder: CfnCluster.EncryptionAtRestProperty.Builder =
      CfnCluster.EncryptionAtRestProperty.builder()

  public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
    cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
  }

  public fun build(): CfnCluster.EncryptionAtRestProperty = cdkBuilder.build()
}
