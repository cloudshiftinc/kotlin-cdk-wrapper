@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableProvisionedThroughputPropertyDsl {
  private val cdkBuilder: CfnTable.ProvisionedThroughputProperty.Builder =
      CfnTable.ProvisionedThroughputProperty.builder()

  /**
   * @param readCapacityUnits The amount of read capacity that's provisioned for the table. 
   * For more information, see [Read/write capacity
   * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
   * *Amazon Keyspaces Developer Guide* .
   */
  public fun readCapacityUnits(readCapacityUnits: Number) {
    cdkBuilder.readCapacityUnits(readCapacityUnits)
  }

  /**
   * @param writeCapacityUnits The amount of write capacity that's provisioned for the table. 
   * For more information, see [Read/write capacity
   * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
   * *Amazon Keyspaces Developer Guide* .
   */
  public fun writeCapacityUnits(writeCapacityUnits: Number) {
    cdkBuilder.writeCapacityUnits(writeCapacityUnits)
  }

  public fun build(): CfnTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
