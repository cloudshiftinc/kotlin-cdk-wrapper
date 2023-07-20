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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVirtualGateway.Builder = CfnVirtualGateway.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    public fun meshOwner(meshOwner: String) {
        cdkBuilder.meshOwner(meshOwner)
    }

    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    public fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty) {
        cdkBuilder.spec(spec)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): CfnVirtualGateway {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
