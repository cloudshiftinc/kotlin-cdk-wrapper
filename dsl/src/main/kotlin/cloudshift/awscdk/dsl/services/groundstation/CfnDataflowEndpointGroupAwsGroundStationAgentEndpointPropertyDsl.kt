@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.Builder =
      CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.builder()

  /**
   * @param agentStatus the value to be set.
   */
  public fun agentStatus(agentStatus: String) {
    cdkBuilder.agentStatus(agentStatus)
  }

  /**
   * @param auditResults the value to be set.
   */
  public fun auditResults(auditResults: String) {
    cdkBuilder.auditResults(auditResults)
  }

  /**
   * @param egressAddress the value to be set.
   */
  public fun egressAddress(egressAddress: IResolvable) {
    cdkBuilder.egressAddress(egressAddress)
  }

  /**
   * @param egressAddress the value to be set.
   */
  public fun egressAddress(egressAddress: CfnDataflowEndpointGroup.ConnectionDetailsProperty) {
    cdkBuilder.egressAddress(egressAddress)
  }

  /**
   * @param ingressAddress the value to be set.
   */
  public fun ingressAddress(ingressAddress: IResolvable) {
    cdkBuilder.ingressAddress(ingressAddress)
  }

  /**
   * @param ingressAddress the value to be set.
   */
  public
      fun ingressAddress(ingressAddress: CfnDataflowEndpointGroup.RangedConnectionDetailsProperty) {
    cdkBuilder.ingressAddress(ingressAddress)
  }

  /**
   * @param name the value to be set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty =
      cdkBuilder.build()
}
