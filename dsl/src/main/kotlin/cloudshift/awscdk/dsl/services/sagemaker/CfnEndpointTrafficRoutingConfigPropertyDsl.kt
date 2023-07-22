@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointTrafficRoutingConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.TrafficRoutingConfigProperty.Builder =
      CfnEndpoint.TrafficRoutingConfigProperty.builder()

  /**
   * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet.
   * `Value` must be less than or equal to 50% of the variant's total instance count.
   */
  public fun canarySize(canarySize: IResolvable) {
    cdkBuilder.canarySize(canarySize)
  }

  /**
   * @param canarySize Batch size for the first step to turn on traffic on the new endpoint fleet.
   * `Value` must be less than or equal to 50% of the variant's total instance count.
   */
  public fun canarySize(canarySize: CfnEndpoint.CapacitySizeProperty) {
    cdkBuilder.canarySize(canarySize)
  }

  /**
   * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet.
   * `Value` must be 10-50% of the variant's total instance count.
   */
  public fun linearStepSize(linearStepSize: IResolvable) {
    cdkBuilder.linearStepSize(linearStepSize)
  }

  /**
   * @param linearStepSize Batch size for each step to turn on traffic on the new endpoint fleet.
   * `Value` must be 10-50% of the variant's total instance count.
   */
  public fun linearStepSize(linearStepSize: CfnEndpoint.CapacitySizeProperty) {
    cdkBuilder.linearStepSize(linearStepSize)
  }

  /**
   * @param type Traffic routing strategy type. 
   * * `ALL_AT_ONCE` : Endpoint traffic shifts to the new fleet in a single step.
   * * `CANARY` : Endpoint traffic shifts to the new fleet in two steps. The first step is the
   * canary, which is a small portion of the traffic. The second step is the remainder of the traffic.
   * * `LINEAR` : Endpoint traffic shifts to the new fleet in n steps of a configurable size.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param waitIntervalInSeconds The waiting time (in seconds) between incremental steps to turn on
   * traffic on the new endpoint fleet.
   */
  public fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
    cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
  }

  public fun build(): CfnEndpoint.TrafficRoutingConfigProperty = cdkBuilder.build()
}
