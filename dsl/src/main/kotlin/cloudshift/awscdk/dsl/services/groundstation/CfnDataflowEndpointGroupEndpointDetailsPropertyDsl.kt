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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * The security details and endpoint information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * EndpointDetailsProperty endpointDetailsProperty = EndpointDetailsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupEndpointDetailsPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder =
        CfnDataflowEndpointGroup.EndpointDetailsProperty.builder()

    /** @param awsGroundStationAgentEndpoint the value to be set. */
    public fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
    }

    /** @param awsGroundStationAgentEndpoint the value to be set. */
    public fun awsGroundStationAgentEndpoint(
        awsGroundStationAgentEndpoint:
            CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
    ) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
    }

    /** @param endpoint Information about the endpoint such as name and the endpoint address. */
    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param endpoint Information about the endpoint such as name and the endpoint address. */
    public fun endpoint(endpoint: CfnDataflowEndpointGroup.DataflowEndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param securityDetails The role ARN, and IDs for security groups and subnets. */
    public fun securityDetails(securityDetails: IResolvable) {
        cdkBuilder.securityDetails(securityDetails)
    }

    /** @param securityDetails The role ARN, and IDs for security groups and subnets. */
    public fun securityDetails(securityDetails: CfnDataflowEndpointGroup.SecurityDetailsProperty) {
        cdkBuilder.securityDetails(securityDetails)
    }

    public fun build(): CfnDataflowEndpointGroup.EndpointDetailsProperty = cdkBuilder.build()
}
