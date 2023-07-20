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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSignalCatalogDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSignalCatalog.Builder = CfnSignalCatalog.Builder.create(scope, id)

    private val _nodes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun nodeCounts(nodeCounts: IResolvable) {
        cdkBuilder.nodeCounts(nodeCounts)
    }

    public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
        cdkBuilder.nodeCounts(nodeCounts)
    }

    public fun nodes(vararg nodes: Any) {
        _nodes.addAll(listOf(*nodes))
    }

    public fun nodes(nodes: Collection<Any>) {
        _nodes.addAll(nodes)
    }

    public fun nodes(nodes: IResolvable) {
        cdkBuilder.nodes(nodes)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSignalCatalog {
        if (_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
