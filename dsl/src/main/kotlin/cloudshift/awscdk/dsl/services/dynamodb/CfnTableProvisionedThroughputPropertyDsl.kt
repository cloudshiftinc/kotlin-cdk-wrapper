@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableProvisionedThroughputPropertyDsl {
  private val cdkBuilder: CfnTable.ProvisionedThroughputProperty.Builder =
      CfnTable.ProvisionedThroughputProperty.builder()

  /**
   * @param readCapacityUnits The maximum number of strongly consistent reads consumed per second
   * before DynamoDB returns a `ThrottlingException` . 
   * For more information, see [Specifying Read and Write
   * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
   * in the *Amazon DynamoDB Developer Guide* .
   *
   * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
   */
  public fun readCapacityUnits(readCapacityUnits: Number) {
    cdkBuilder.readCapacityUnits(readCapacityUnits)
  }

  /**
   * @param writeCapacityUnits The maximum number of writes consumed per second before DynamoDB
   * returns a `ThrottlingException` . 
   * For more information, see [Specifying Read and Write
   * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
   * in the *Amazon DynamoDB Developer Guide* .
   *
   * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
   */
  public fun writeCapacityUnits(writeCapacityUnits: Number) {
    cdkBuilder.writeCapacityUnits(writeCapacityUnits)
  }

  public fun build(): CfnTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
