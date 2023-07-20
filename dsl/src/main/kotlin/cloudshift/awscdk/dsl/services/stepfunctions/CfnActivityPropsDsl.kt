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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnActivityPropsDsl {
    private val cdkBuilder: CfnActivityProps.Builder = CfnActivityProps.builder()

    private val _tags: MutableList<CfnActivity.TagsEntryProperty> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnActivityTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnActivityTagsEntryPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnActivity.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnActivityProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
