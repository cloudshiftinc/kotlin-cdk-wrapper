@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

@CdkDslMarker
public class ReplicaRegionDsl {
  private val cdkBuilder: ReplicaRegion.Builder = ReplicaRegion.builder()

  /**
   * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
   * value.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param region The name of the region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): ReplicaRegion = cdkBuilder.build()
}
