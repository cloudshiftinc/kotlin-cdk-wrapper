@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

@CdkDslMarker
public class ReplicaRegionDsl {
  private val cdkBuilder: ReplicaRegion.Builder = ReplicaRegion.builder()

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): ReplicaRegion = cdkBuilder.build()
}
