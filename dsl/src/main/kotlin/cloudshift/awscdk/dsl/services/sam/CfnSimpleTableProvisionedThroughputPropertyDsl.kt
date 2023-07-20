@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sam.CfnSimpleTable

@CdkDslMarker
public class CfnSimpleTableProvisionedThroughputPropertyDsl {
  private val cdkBuilder: CfnSimpleTable.ProvisionedThroughputProperty.Builder =
      CfnSimpleTable.ProvisionedThroughputProperty.builder()

  public fun readCapacityUnits(readCapacityUnits: Number) {
    cdkBuilder.readCapacityUnits(readCapacityUnits)
  }

  public fun writeCapacityUnits(writeCapacityUnits: Number) {
    cdkBuilder.writeCapacityUnits(writeCapacityUnits)
  }

  public fun build(): CfnSimpleTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
