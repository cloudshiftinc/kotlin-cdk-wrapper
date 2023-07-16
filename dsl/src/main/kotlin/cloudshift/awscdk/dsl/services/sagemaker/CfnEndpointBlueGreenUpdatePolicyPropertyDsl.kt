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

  public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
    cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
  }

  public fun terminationWaitInSeconds(terminationWaitInSeconds: Number) {
    cdkBuilder.terminationWaitInSeconds(terminationWaitInSeconds)
  }

  public fun trafficRoutingConfiguration(trafficRoutingConfiguration: IResolvable) {
    cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
  }

  public
      fun trafficRoutingConfiguration(trafficRoutingConfiguration: CfnEndpoint.TrafficRoutingConfigProperty) {
    cdkBuilder.trafficRoutingConfiguration(trafficRoutingConfiguration)
  }

  public fun build(): CfnEndpoint.BlueGreenUpdatePolicyProperty = cdkBuilder.build()
}
