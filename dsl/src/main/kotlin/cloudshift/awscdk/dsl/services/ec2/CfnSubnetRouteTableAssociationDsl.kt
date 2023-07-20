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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSubnetRouteTableAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnetRouteTableAssociation.Builder =
        CfnSubnetRouteTableAssociation.Builder.create(scope, id)

    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnSubnetRouteTableAssociation = cdkBuilder.build()
}
