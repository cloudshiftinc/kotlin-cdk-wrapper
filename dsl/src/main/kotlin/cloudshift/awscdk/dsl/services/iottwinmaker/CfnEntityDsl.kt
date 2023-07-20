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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnEntityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEntity.Builder = CfnEntity.Builder.create(scope, id)

    public fun components(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.components(builder.map)
    }

    public fun components(components: Map<String, Any>) {
        cdkBuilder.components(components)
    }

    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    public fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
    }

    public fun parentEntityId(parentEntityId: String) {
        cdkBuilder.parentEntityId(parentEntityId)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnEntity = cdkBuilder.build()
}
