@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisLoadBalancerTargetPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.builder()

  /**
   * @param address The IP address.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param availabilityZone The Availability Zone.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param instance Information about the instance.
   */
  public fun instance(instance: IResolvable) {
    cdkBuilder.instance(instance)
  }

  /**
   * @param instance Information about the instance.
   */
  public fun instance(instance: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.instance(instance)
  }

  /**
   * @param port The port on which the target is listening.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty =
      cdkBuilder.build()
}
