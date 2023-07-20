@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import kotlin.String

@CdkDslMarker
public class CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.Builder =
        CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.builder()

    public fun agentStatus(agentStatus: String) {
        cdkBuilder.agentStatus(agentStatus)
    }

    public fun auditResults(auditResults: String) {
        cdkBuilder.auditResults(auditResults)
    }

    public fun egressAddress(egressAddress: IResolvable) {
        cdkBuilder.egressAddress(egressAddress)
    }

    public fun egressAddress(egressAddress: CfnDataflowEndpointGroup.ConnectionDetailsProperty) {
        cdkBuilder.egressAddress(egressAddress)
    }

    public fun ingressAddress(ingressAddress: IResolvable) {
        cdkBuilder.ingressAddress(ingressAddress)
    }

    public fun ingressAddress(ingressAddress: CfnDataflowEndpointGroup.RangedConnectionDetailsProperty) {
        cdkBuilder.ingressAddress(ingressAddress)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty =
        cdkBuilder.build()
}
