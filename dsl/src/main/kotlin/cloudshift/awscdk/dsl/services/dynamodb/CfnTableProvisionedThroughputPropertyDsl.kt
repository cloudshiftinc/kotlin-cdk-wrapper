@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
 * `WriteCapacityUnits` .
 *
 * For more information about the contents of a provisioned throughput structure, see [Amazon
 * DynamoDB Table
 * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ProvisionedThroughputProperty provisionedThroughputProperty =
 * ProvisionedThroughputProperty.builder()
 * .readCapacityUnits(123)
 * .writeCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html)
 */
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
