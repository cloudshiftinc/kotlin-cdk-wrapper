@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusProps

/**
 * Properties for defining a `CfnEventBus`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * Object policy;
 * CfnEventBusProps cfnEventBusProps = CfnEventBusProps.builder()
 * .name("name")
 * // the properties below are optional
 * .eventSourceName("eventSourceName")
 * .policy(policy)
 * .tags(List.of(TagEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html)
 */
@CdkDslMarker
public class CfnEventBusPropsDsl {
    private val cdkBuilder: CfnEventBusProps.Builder = CfnEventBusProps.builder()

    private val _tags: MutableList<CfnEventBus.TagEntryProperty> = mutableListOf()

    /**
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     *   event source that the new event bus will be matched with.
     */
    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * @param name The name of the new event bus. Custom event bus names can't contain the `/`
     *   character, but you can use the `/` character in partner event bus names. In addition, for
     *   partner event buses, the name must exactly match the name of the partner event source that
     *   this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     *   can write events to this event bus.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * @param policy The permissions policy of the event bus, describing which other AWS accounts
     *   can write events to this event bus.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /** @param tags Tags to associate with the event bus. */
    public fun tags(tags: CfnEventBusTagEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnEventBusTagEntryPropertyDsl().apply(tags).build())
    }

    /** @param tags Tags to associate with the event bus. */
    public fun tags(tags: Collection<CfnEventBus.TagEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventBusProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
