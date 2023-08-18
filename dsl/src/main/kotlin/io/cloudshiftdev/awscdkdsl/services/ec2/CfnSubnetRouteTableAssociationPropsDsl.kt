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
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps

/**
 * Properties for defining a `CfnSubnetRouteTableAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetRouteTableAssociationProps cfnSubnetRouteTableAssociationProps =
 * CfnSubnetRouteTableAssociationProps.builder()
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html)
 */
@CdkDslMarker
public class CfnSubnetRouteTableAssociationPropsDsl {
    private val cdkBuilder: CfnSubnetRouteTableAssociationProps.Builder =
        CfnSubnetRouteTableAssociationProps.builder()

    /**
     * @param routeTableId The ID of the route table. The physical ID changes when the route table
     *   ID is changed.
     */
    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    /** @param subnetId The ID of the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetRouteTableAssociationProps = cdkBuilder.build()
}
