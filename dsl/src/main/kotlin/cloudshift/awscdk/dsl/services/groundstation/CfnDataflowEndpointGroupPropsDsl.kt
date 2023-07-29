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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps

/**
 * Properties for defining a `CfnDataflowEndpointGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnDataflowEndpointGroupProps cfnDataflowEndpointGroupProps =
 * CfnDataflowEndpointGroupProps.builder()
 * .endpointDetails(List.of(EndpointDetailsProperty.builder()
 * .awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty.builder()
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
 * .build())
 * .endpoint(DataflowEndpointProperty.builder()
 * .address(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .mtu(123)
 * .name("name")
 * .build())
 * .securityDetails(SecurityDetailsProperty.builder()
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build()))
 * // the properties below are optional
 * .contactPostPassDurationSeconds(123)
 * .contactPrePassDurationSeconds(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupPropsDsl {
    private val cdkBuilder: CfnDataflowEndpointGroupProps.Builder =
        CfnDataflowEndpointGroupProps.builder()

    private val _endpointDetails: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     *   the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state. A Ground Station
     *   Dataflow Endpoint Group State Change event will be emitted when the Dataflow Endpoint Group
     *   enters and exits the `POSTPASS` state.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     *   the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state. A Ground Station
     *   Dataflow Endpoint Group State Change event will be emitted when the Dataflow Endpoint Group
     *   enters and exits the `PREPASS` state.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(vararg endpointDetails: Any) {
        _endpointDetails.addAll(listOf(*endpointDetails))
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(endpointDetails: Collection<Any>) {
        _endpointDetails.addAll(endpointDetails)
    }

    /**
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(endpointDetails: IResolvable) {
        cdkBuilder.endpointDetails(endpointDetails)
    }

    /** @param tags Tags assigned to a resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags assigned to a resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataflowEndpointGroupProps {
        if (_endpointDetails.isNotEmpty()) cdkBuilder.endpointDetails(_endpointDetails)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
