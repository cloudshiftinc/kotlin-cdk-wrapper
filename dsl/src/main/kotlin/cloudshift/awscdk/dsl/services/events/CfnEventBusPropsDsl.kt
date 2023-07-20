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
import software.amazon.awscdk.services.events.CfnEventBusProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventBusPropsDsl {
    private val cdkBuilder: CfnEventBusProps.Builder = CfnEventBusProps.builder()

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

    public fun build(): CfnEventBusProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
