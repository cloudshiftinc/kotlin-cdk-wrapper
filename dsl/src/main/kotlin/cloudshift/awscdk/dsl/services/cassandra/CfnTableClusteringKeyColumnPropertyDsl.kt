@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableClusteringKeyColumnPropertyDsl {
  private val cdkBuilder: CfnTable.ClusteringKeyColumnProperty.Builder =
      CfnTable.ClusteringKeyColumnProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTable.ColumnProperty) {
    cdkBuilder.column(column)
  }

  public fun orderBy(orderBy: String) {
    cdkBuilder.orderBy(orderBy)
  }

  public fun build(): CfnTable.ClusteringKeyColumnProperty = cdkBuilder.build()
}
