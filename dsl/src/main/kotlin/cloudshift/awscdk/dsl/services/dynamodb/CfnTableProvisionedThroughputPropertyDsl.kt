@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableProvisionedThroughputPropertyDsl {
  private val cdkBuilder: CfnTable.ProvisionedThroughputProperty.Builder =
      CfnTable.ProvisionedThroughputProperty.builder()

  public fun readCapacityUnits(readCapacityUnits: Number) {
    cdkBuilder.readCapacityUnits(readCapacityUnits)
  }

  public fun writeCapacityUnits(writeCapacityUnits: Number) {
    cdkBuilder.writeCapacityUnits(writeCapacityUnits)
  }

  public fun build(): CfnTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
