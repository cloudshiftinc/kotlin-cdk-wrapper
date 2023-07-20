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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocalGatewayRouteTableVPCAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocalGatewayRouteTableVPCAssociation.Builder =
        CfnLocalGatewayRouteTableVPCAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
        cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnLocalGatewayRouteTableVPCAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
