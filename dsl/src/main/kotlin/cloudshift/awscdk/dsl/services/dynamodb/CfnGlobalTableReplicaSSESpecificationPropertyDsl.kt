@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableReplicaSSESpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.ReplicaSSESpecificationProperty.Builder =
      CfnGlobalTable.ReplicaSSESpecificationProperty.builder()

  public fun kmsMasterKeyId(kmsMasterKeyId: String) {
    cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
  }

  public fun build(): CfnGlobalTable.ReplicaSSESpecificationProperty = cdkBuilder.build()
}
