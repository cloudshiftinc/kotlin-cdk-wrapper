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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventCommonOptions
import software.amazon.awscdk.services.events.EventPattern
import software.constructs.Construct

/**
 * Common options for Events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.constructs.*;
 * Construct construct;
 * Object detail;
 * EventCommonOptions eventCommonOptions = EventCommonOptions.builder()
 * .crossStackScope(construct)
 * .description("description")
 * .eventPattern(EventPattern.builder()
 * .account(List.of("account"))
 * .detail(Map.of(
 * "detailKey", detail))
 * .detailType(List.of("detailType"))
 * .id(List.of("id"))
 * .region(List.of("region"))
 * .resources(List.of("resources"))
 * .source(List.of("source"))
 * .time(List.of("time"))
 * .version(List.of("version"))
 * .build())
 * .ruleName("ruleName")
 * .build();
 * ```
 */
@CdkDslMarker
public class EventCommonOptionsDsl {
    private val cdkBuilder: EventCommonOptions.Builder = EventCommonOptions.builder()

    /**
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     *   different Stacks (but in the same account &amp; region). This helps dealing with cycles
     *   that often arise in these situations.
     */
    public fun crossStackScope(crossStackScope: Construct) {
        cdkBuilder.crossStackScope(crossStackScope)
    }

    /** @param description A description of the rule's purpose. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     *   The method that generates the rule probably imposes some type of event filtering. The
     *   filtering implied by what you pass here is added on top of that filtering.
     */
    public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(eventPattern)
        cdkBuilder.eventPattern(builder.build())
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     *   The method that generates the rule probably imposes some type of event filtering. The
     *   filtering implied by what you pass here is added on top of that filtering.
     */
    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /** @param ruleName A name for the rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): EventCommonOptions = cdkBuilder.build()
}
