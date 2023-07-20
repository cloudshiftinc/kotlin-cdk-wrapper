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
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocalGatewayRouteTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocalGatewayRouteTable.Builder =
        CfnLocalGatewayRouteTable.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun localGatewayId(localGatewayId: String) {
        cdkBuilder.localGatewayId(localGatewayId)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocalGatewayRouteTable {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
