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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

/**
 * The VPC endpoint object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .port(123)
 * .vpcEndpoints(List.of(VpcEndpointProperty.builder()
 * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .subnetId("subnetId")
 * .build()))
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html)
 */
@CdkDslMarker
public class CfnWorkgroupEndpointPropertyDsl {
    private val cdkBuilder: CfnWorkgroup.EndpointProperty.Builder =
        CfnWorkgroup.EndpointProperty.builder()

    private val _vpcEndpoints: MutableList<Any> = mutableListOf()

    /** @param address The DNS address of the VPC endpoint. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param port The port that Amazon Redshift Serverless listens on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param vpcEndpoints An array of `VpcEndpoint` objects. */
    public fun vpcEndpoints(vararg vpcEndpoints: Any) {
        _vpcEndpoints.addAll(listOf(*vpcEndpoints))
    }

    /** @param vpcEndpoints An array of `VpcEndpoint` objects. */
    public fun vpcEndpoints(vpcEndpoints: Collection<Any>) {
        _vpcEndpoints.addAll(vpcEndpoints)
    }

    /** @param vpcEndpoints An array of `VpcEndpoint` objects. */
    public fun vpcEndpoints(vpcEndpoints: IResolvable) {
        cdkBuilder.vpcEndpoints(vpcEndpoints)
    }

    public fun build(): CfnWorkgroup.EndpointProperty {
        if (_vpcEndpoints.isNotEmpty()) cdkBuilder.vpcEndpoints(_vpcEndpoints)
        return cdkBuilder.build()
    }
}
