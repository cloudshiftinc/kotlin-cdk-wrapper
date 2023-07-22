@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointBlueGreenUpdatePolicyPropertyDsl {
  private val cdkBuilder: CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder =
      CfnEndpoint.BlueGreenUpdatePolicyProperty.builder()

  /**
   * @param maximumExecutionTimeoutInSeconds Maximum execution timeout for the deployment.
   * Note that the timeout value should be larger than the total waiting time specified in
   * `TerminationWaitInSeconds` and `WaitIntervalInSeconds` .
   */
  public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
    cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
  }

  /**
   * @param terminationWaitInSeconds Additional waiting time in seconds after the completion of an
   * endpoint deployment before terminating the old endpoint fleet.
   * Default is 0.
   */
  public fun terminationWaitInSeconds(terminationWaitInSeconds: Number) {
    cdkBuilder.terminationWaitInSeconds(terminationWaitInSeconds)
  }

  /**
   * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from
   * the old fleet to the new fleet during an endpoint deployment. 
   */
  public fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable) {
    cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
  }

  /**
   * @param trafficRoutingConfiguration Defines the traffic routing strategy to shift traffic from
   * the old fleet to the new fleet during an endpoint deployment. 
   */
  public
      fun trafficRoutingConfiguration(trafficRoutingConfiguration: CfnEndpoint.TrafficRoutingConfigProperty) {
    cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
  }

  public fun build(): CfnEndpoint.BlueGreenUpdatePolicyProperty = cdkBuilder.build()
}
