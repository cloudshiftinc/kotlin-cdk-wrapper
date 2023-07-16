@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.glue.CfnPartition

@CdkDslMarker
public class CfnPartitionOrderPropertyDsl {
  private val cdkBuilder: CfnPartition.OrderProperty.Builder = CfnPartition.OrderProperty.builder()

  public fun column(column: String) {
    cdkBuilder.column(column)
  }

  public fun sortOrder(sortOrder: Number) {
    cdkBuilder.sortOrder(sortOrder)
  }

  public fun build(): CfnPartition.OrderProperty = cdkBuilder.build()
}
