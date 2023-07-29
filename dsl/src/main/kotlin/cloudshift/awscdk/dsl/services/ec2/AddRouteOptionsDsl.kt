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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.AddRouteOptions
import software.amazon.awscdk.services.ec2.RouterType

/**
 * Options for adding a new route to a subnet.
 *
 * Example:
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "VPC")
 * .subnetConfiguration(List.of(SubnetConfiguration.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .name("Public")
 * .build(), SubnetConfiguration.builder()
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .name("Isolated")
 * .build()))
 * .build();
 * ((Subnet)vpc.isolatedSubnets[0]).addRoute("StaticRoute", AddRouteOptions.builder()
 * .routerId(vpc.getInternetGatewayId())
 * .routerType(RouterType.GATEWAY)
 * .destinationCidrBlock("8.8.8.8/32")
 * .build());
 * ```
 */
@CdkDslMarker
public class AddRouteOptionsDsl {
    private val cdkBuilder: AddRouteOptions.Builder = AddRouteOptions.builder()

    /** @param destinationCidrBlock IPv4 range this route applies to. */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /** @param destinationIpv6CidrBlock IPv6 range this route applies to. */
    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
        cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    /**
     * @param enablesInternetConnectivity Whether this route will enable internet connectivity. If
     *   true, this route will be added before any AWS resources that depend on internet
     *   connectivity in the VPC will be created.
     */
    public fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean) {
        cdkBuilder.enablesInternetConnectivity(enablesInternetConnectivity)
    }

    /**
     * @param routerId The ID of the router. Can be an instance ID, gateway ID, etc, depending on
     *   the router type.
     */
    public fun routerId(routerId: String) {
        cdkBuilder.routerId(routerId)
    }

    /** @param routerType What type of router to route this traffic to. */
    public fun routerType(routerType: RouterType) {
        cdkBuilder.routerType(routerType)
    }

    public fun build(): AddRouteOptions = cdkBuilder.build()
}
