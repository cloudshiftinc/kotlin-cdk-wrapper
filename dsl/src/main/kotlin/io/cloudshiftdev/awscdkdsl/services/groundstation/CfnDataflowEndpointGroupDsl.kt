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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.constructs.Construct

/**
 * Creates a Dataflow Endpoint Group request.
 *
 * Dataflow endpoint groups contain a list of endpoints. When the name of a dataflow endpoint group
 * is specified in a mission profile, the Ground Station service will connect to the endpoints and
 * flow data during a contact.
 *
 * For more information about dataflow endpoint groups, see
 * [Dataflow Endpoint Groups](https://docs.aws.amazon.com/ground-station/latest/ug/dataflowendpointgroups.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnDataflowEndpointGroup cfnDataflowEndpointGroup = CfnDataflowEndpointGroup.Builder.create(this,
 * "MyCfnDataflowEndpointGroup")
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
public class CfnDataflowEndpointGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataflowEndpointGroup.Builder =
        CfnDataflowEndpointGroup.Builder.create(scope, id)

    private val _endpointDetails: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint
     * Group will be in a `POSTPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `POSTPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactpostpassdurationseconds)
     *
     * @param contactPostPassDurationSeconds Amount of time, in seconds, after a contact ends that
     *   the Ground Station Dataflow Endpoint Group will be in a `POSTPASS` state.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint
     * Group will be in a `PREPASS` state.
     *
     * A Ground Station Dataflow Endpoint Group State Change event will be emitted when the Dataflow
     * Endpoint Group enters and exits the `PREPASS` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-contactprepassdurationseconds)
     *
     * @param contactPrePassDurationSeconds Amount of time, in seconds, before a contact starts that
     *   the Ground Station Dataflow Endpoint Group will be in a `PREPASS` state.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     *
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(vararg endpointDetails: Any) {
        _endpointDetails.addAll(listOf(*endpointDetails))
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     *
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(endpointDetails: Collection<Any>) {
        _endpointDetails.addAll(endpointDetails)
    }

    /**
     * List of Endpoint Details, containing address and port for each endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-endpointdetails)
     *
     * @param endpointDetails List of Endpoint Details, containing address and port for each
     *   endpoint.
     */
    public fun endpointDetails(endpointDetails: IResolvable) {
        cdkBuilder.endpointDetails(endpointDetails)
    }

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     *
     * @param tags Tags assigned to a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html#cfn-groundstation-dataflowendpointgroup-tags)
     *
     * @param tags Tags assigned to a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataflowEndpointGroup {
        if (_endpointDetails.isNotEmpty()) cdkBuilder.endpointDetails(_endpointDetails)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
