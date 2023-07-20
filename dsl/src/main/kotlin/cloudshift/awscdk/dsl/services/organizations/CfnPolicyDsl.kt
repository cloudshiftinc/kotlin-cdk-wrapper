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

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPolicy.Builder = CfnPolicy.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetIds: MutableList<String> = mutableListOf()

    public fun content(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.content(builder.map)
    }

    public fun content(content: Any) {
        cdkBuilder.content(content)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun targetIds(vararg targetIds: String) {
        _targetIds.addAll(listOf(*targetIds))
    }

    public fun targetIds(targetIds: Collection<String>) {
        _targetIds.addAll(targetIds)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPolicy {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetIds.isNotEmpty()) cdkBuilder.targetIds(_targetIds)
        return cdkBuilder.build()
    }
}
