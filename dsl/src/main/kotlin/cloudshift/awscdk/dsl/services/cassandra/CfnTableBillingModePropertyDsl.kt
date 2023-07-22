@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableBillingModePropertyDsl {
  private val cdkBuilder: CfnTable.BillingModeProperty.Builder =
      CfnTable.BillingModeProperty.builder()

  /**
   * @param mode The billing mode for the table:. 
   * * On-demand mode - `ON_DEMAND`
   * * Provisioned mode - `PROVISIONED`
   *
   *
   * If you choose `PROVISIONED` mode, then you also need to specify provisioned throughput (read
   * and write capacity) for the table.
   *
   *
   * Valid values: `ON_DEMAND` | `PROVISIONED`
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param provisionedThroughput The provisioned read capacity and write capacity for the table.
   * For more information, see [Provisioned throughput capacity
   * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
   * in the *Amazon Keyspaces Developer Guide* .
   */
  public fun provisionedThroughput(provisionedThroughput: IResolvable) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  /**
   * @param provisionedThroughput The provisioned read capacity and write capacity for the table.
   * For more information, see [Provisioned throughput capacity
   * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
   * in the *Amazon Keyspaces Developer Guide* .
   */
  public fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty) {
    cdkBuilder.provisionedThroughput(provisionedThroughput)
  }

  public fun build(): CfnTable.BillingModeProperty = cdkBuilder.build()
}
