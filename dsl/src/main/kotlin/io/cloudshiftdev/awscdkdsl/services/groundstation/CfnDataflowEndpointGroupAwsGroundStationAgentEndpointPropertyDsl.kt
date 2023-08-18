@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * AwsGroundStationAgentEndpointProperty awsGroundStationAgentEndpointProperty =
 * AwsGroundStationAgentEndpointProperty.builder()
 * .agentStatus("agentStatus")
 * .auditResults("auditResults")
 * .egressAddress(ConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .build())
 * .ingressAddress(RangedConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(RangedSocketAddressProperty.builder()
 * .name("name")
 * .portRange(IntegerRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.Builder =
        CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.builder()

    /** @param agentStatus the value to be set. */
    public fun agentStatus(agentStatus: String) {
        cdkBuilder.agentStatus(agentStatus)
    }

    /** @param auditResults the value to be set. */
    public fun auditResults(auditResults: String) {
        cdkBuilder.auditResults(auditResults)
    }

    /** @param egressAddress the value to be set. */
    public fun egressAddress(egressAddress: IResolvable) {
        cdkBuilder.egressAddress(egressAddress)
    }

    /** @param egressAddress the value to be set. */
    public fun egressAddress(egressAddress: CfnDataflowEndpointGroup.ConnectionDetailsProperty) {
        cdkBuilder.egressAddress(egressAddress)
    }

    /** @param ingressAddress the value to be set. */
    public fun ingressAddress(ingressAddress: IResolvable) {
        cdkBuilder.ingressAddress(ingressAddress)
    }

    /** @param ingressAddress the value to be set. */
    public fun ingressAddress(
        ingressAddress: CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
    ) {
        cdkBuilder.ingressAddress(ingressAddress)
    }

    /** @param name the value to be set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty =
        cdkBuilder.build()
}
