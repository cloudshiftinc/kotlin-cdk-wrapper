@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorCapacityPropertyDsl {
  private val cdkBuilder: CfnConnector.CapacityProperty.Builder =
      CfnConnector.CapacityProperty.builder()

  /**
   * @param autoScaling Information about the auto scaling parameters for the connector.
   */
  public fun autoScaling(autoScaling: IResolvable) {
    cdkBuilder.autoScaling(autoScaling)
  }

  /**
   * @param autoScaling Information about the auto scaling parameters for the connector.
   */
  public fun autoScaling(autoScaling: CfnConnector.AutoScalingProperty) {
    cdkBuilder.autoScaling(autoScaling)
  }

  /**
   * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
   */
  public fun provisionedCapacity(provisionedCapacity: IResolvable) {
    cdkBuilder.provisionedCapacity(provisionedCapacity)
  }

  /**
   * @param provisionedCapacity Details about a fixed capacity allocated to a connector.
   */
  public fun provisionedCapacity(provisionedCapacity: CfnConnector.ProvisionedCapacityProperty) {
    cdkBuilder.provisionedCapacity(provisionedCapacity)
  }

  public fun build(): CfnConnector.CapacityProperty = cdkBuilder.build()
}
