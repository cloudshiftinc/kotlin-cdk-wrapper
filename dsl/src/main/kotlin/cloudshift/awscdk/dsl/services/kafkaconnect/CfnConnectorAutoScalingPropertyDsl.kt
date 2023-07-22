@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorAutoScalingPropertyDsl {
  private val cdkBuilder: CfnConnector.AutoScalingProperty.Builder =
      CfnConnector.AutoScalingProperty.builder()

  /**
   * @param maxWorkerCount The maximum number of workers allocated to the connector. 
   */
  public fun maxWorkerCount(maxWorkerCount: Number) {
    cdkBuilder.maxWorkerCount(maxWorkerCount)
  }

  /**
   * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector worker. 
   * The valid values are 1,2,4,8.
   */
  public fun mcuCount(mcuCount: Number) {
    cdkBuilder.mcuCount(mcuCount)
  }

  /**
   * @param minWorkerCount The minimum number of workers allocated to the connector. 
   */
  public fun minWorkerCount(minWorkerCount: Number) {
    cdkBuilder.minWorkerCount(minWorkerCount)
  }

  /**
   * @param scaleInPolicy The sacle-in policy for the connector. 
   */
  public fun scaleInPolicy(scaleInPolicy: IResolvable) {
    cdkBuilder.scaleInPolicy(scaleInPolicy)
  }

  /**
   * @param scaleInPolicy The sacle-in policy for the connector. 
   */
  public fun scaleInPolicy(scaleInPolicy: CfnConnector.ScaleInPolicyProperty) {
    cdkBuilder.scaleInPolicy(scaleInPolicy)
  }

  /**
   * @param scaleOutPolicy The sacle-out policy for the connector. 
   */
  public fun scaleOutPolicy(scaleOutPolicy: IResolvable) {
    cdkBuilder.scaleOutPolicy(scaleOutPolicy)
  }

  /**
   * @param scaleOutPolicy The sacle-out policy for the connector. 
   */
  public fun scaleOutPolicy(scaleOutPolicy: CfnConnector.ScaleOutPolicyProperty) {
    cdkBuilder.scaleOutPolicy(scaleOutPolicy)
  }

  public fun build(): CfnConnector.AutoScalingProperty = cdkBuilder.build()
}
