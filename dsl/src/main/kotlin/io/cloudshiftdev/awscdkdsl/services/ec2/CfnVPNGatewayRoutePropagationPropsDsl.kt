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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps

/**
 * Properties for defining a `CfnVPNGatewayRoutePropagation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNGatewayRoutePropagationProps cfnVPNGatewayRoutePropagationProps =
 * CfnVPNGatewayRoutePropagationProps.builder()
 * .routeTableIds(List.of("routeTableIds"))
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html)
 */
@CdkDslMarker
public class CfnVPNGatewayRoutePropagationPropsDsl {
    private val cdkBuilder: CfnVPNGatewayRoutePropagationProps.Builder =
        CfnVPNGatewayRoutePropagationProps.builder()

    private val _routeTableIds: MutableList<String> = mutableListOf()

    /**
     * @param routeTableIds The ID of the route table. The routing table must be associated with the
     *   same VPC that the virtual private gateway is attached to.
     */
    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    /**
     * @param routeTableIds The ID of the route table. The routing table must be associated with the
     *   same VPC that the virtual private gateway is attached to.
     */
    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    /**
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC. The
     *   virtual private gateway must be attached to the same VPC that the routing tables are
     *   associated with.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPNGatewayRoutePropagationProps {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        return cdkBuilder.build()
    }
}
