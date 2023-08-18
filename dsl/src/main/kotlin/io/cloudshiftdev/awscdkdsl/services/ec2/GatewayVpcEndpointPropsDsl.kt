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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Construction properties for a GatewayVpcEndpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IGatewayVpcEndpointService gatewayVpcEndpointService;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * GatewayVpcEndpointProps gatewayVpcEndpointProps = GatewayVpcEndpointProps.builder()
 * .service(gatewayVpcEndpointService)
 * .vpc(vpc)
 * // the properties below are optional
 * .subnets(List.of(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class GatewayVpcEndpointPropsDsl {
    private val cdkBuilder: GatewayVpcEndpointProps.Builder = GatewayVpcEndpointProps.builder()

    private val _subnets: MutableList<SubnetSelection> = mutableListOf()

    /** @param service The service to use for this gateway VPC endpoint. */
    public fun service(service: IGatewayVpcEndpointService) {
        cdkBuilder.service(service)
    }

    /**
     * @param subnets Where to add endpoint routing. By default, this endpoint will be routable from
     *   all subnets in the VPC. Specify a list of subnet selection objects here to be more
     *   specific.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
        _subnets.add(SubnetSelectionDsl().apply(subnets).build())
    }

    /**
     * @param subnets Where to add endpoint routing. By default, this endpoint will be routable from
     *   all subnets in the VPC. Specify a list of subnet selection objects here to be more
     *   specific.
     */
    public fun subnets(subnets: Collection<SubnetSelection>) {
        _subnets.addAll(subnets)
    }

    /** @param vpc The VPC network in which the gateway endpoint will be used. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): GatewayVpcEndpointProps {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
