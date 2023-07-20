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

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnGraph
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGraphDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGraph.Builder = CfnGraph.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun autoEnableMembers(autoEnableMembers: Boolean) {
        cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    public fun autoEnableMembers(autoEnableMembers: IResolvable) {
        cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGraph {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
