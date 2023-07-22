@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorProvisionedCapacityPropertyDsl {
  private val cdkBuilder: CfnConnector.ProvisionedCapacityProperty.Builder =
      CfnConnector.ProvisionedCapacityProperty.builder()

  /**
   * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector worker.
   * The valid values are 1,2,4,8.
   */
  public fun mcuCount(mcuCount: Number) {
    cdkBuilder.mcuCount(mcuCount)
  }

  /**
   * @param workerCount The number of workers that are allocated to the connector. 
   */
  public fun workerCount(workerCount: Number) {
    cdkBuilder.workerCount(workerCount)
  }

  public fun build(): CfnConnector.ProvisionedCapacityProperty = cdkBuilder.build()
}
