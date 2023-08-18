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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.CfnEventBus
import software.constructs.Construct

/**
 * Creates a new event bus within your account.
 *
 * This can be a custom event bus which you can use to receive events from your custom applications
 * and services, or it can be a partner event bus which can be matched to a partner event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * CfnEventBus cfnEventBus = CfnEventBus.Builder.create(this, "MyCfnEventBus")
 * .name("name")
 * // the properties below are optional
 * .eventSourceName("eventSourceName")
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
public class CfnEventBusDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventBus.Builder = CfnEventBus.Builder.create(scope, id)

    private val _tags: MutableList<CfnEventBus.TagEntryProperty> = mutableListOf()

    /**
     * If you are creating a partner event bus, this specifies the partner event source that the new
     * event bus will be matched with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-eventsourcename)
     *
     * @param eventSourceName If you are creating a partner event bus, this specifies the partner
     *   event source that the new event bus will be matched with.
     */
    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * The name of the new event bus.
     *
     * Custom event bus names can't contain the `/` character, but you can use the `/` character in
     * partner event bus names. In addition, for partner event buses, the name must exactly match
     * the name of the partner event source that this event bus is matched to.
     *
     * You can't use the name `default` for a custom event bus, as this name is already used for
     * your account's default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-name)
     *
     * @param name The name of the new event bus.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     *
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(tags: CfnEventBusTagEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnEventBusTagEntryPropertyDsl().apply(tags).build())
    }

    /**
     * Tags to associate with the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html#cfn-events-eventbus-tags)
     *
     * @param tags Tags to associate with the event bus.
     */
    public fun tags(tags: Collection<CfnEventBus.TagEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventBus {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
