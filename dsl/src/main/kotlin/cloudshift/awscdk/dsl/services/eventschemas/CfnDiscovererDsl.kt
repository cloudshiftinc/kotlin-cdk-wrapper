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

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDiscovererDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDiscoverer.Builder = CfnDiscoverer.Builder.create(scope, id)

    private val _tags: MutableList<CfnDiscoverer.TagsEntryProperty> = mutableListOf()

    public fun crossAccount(crossAccount: Boolean) {
        cdkBuilder.crossAccount(crossAccount)
    }

    public fun crossAccount(crossAccount: IResolvable) {
        cdkBuilder.crossAccount(crossAccount)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun tags(tags: CfnDiscovererTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnDiscovererTagsEntryPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnDiscoverer.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDiscoverer {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
