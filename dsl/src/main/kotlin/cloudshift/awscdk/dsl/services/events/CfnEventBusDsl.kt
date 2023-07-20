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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnEventBus
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventBusDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventBus.Builder = CfnEventBus.Builder.create(scope, id)

    private val _tags: MutableList<CfnEventBus.TagEntryProperty> = mutableListOf()

    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnEventBusTagEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnEventBusTagEntryPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnEventBus.TagEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventBus {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
