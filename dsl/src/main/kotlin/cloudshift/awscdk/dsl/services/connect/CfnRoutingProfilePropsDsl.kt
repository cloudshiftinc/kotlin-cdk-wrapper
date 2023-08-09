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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRoutingProfileProps

/**
 * Properties for defining a `CfnRoutingProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnRoutingProfileProps cfnRoutingProfileProps = CfnRoutingProfileProps.builder()
 * .defaultOutboundQueueArn("defaultOutboundQueueArn")
 * .description("description")
 * .instanceArn("instanceArn")
 * .mediaConcurrencies(List.of(MediaConcurrencyProperty.builder()
 * .channel("channel")
 * .concurrency(123)
 * // the properties below are optional
 * .crossChannelBehavior(CrossChannelBehaviorProperty.builder()
 * .behaviorType("behaviorType")
 * .build())
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .queueConfigs(List.of(RoutingProfileQueueConfigProperty.builder()
 * .delay(123)
 * .priority(123)
 * .queueReference(RoutingProfileQueueReferenceProperty.builder()
 * .channel("channel")
 * .queueArn("queueArn")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html)
 */
@CdkDslMarker
public class CfnRoutingProfilePropsDsl {
    private val cdkBuilder: CfnRoutingProfileProps.Builder = CfnRoutingProfileProps.builder()

    private val _mediaConcurrencies: MutableList<Any> = mutableListOf()

    private val _queueConfigs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     *   for the routing profile.
     */
    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
        cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    /** @param description The description of the routing profile. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The identifier of the Amazon Connect instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(vararg mediaConcurrencies: Any) {
        _mediaConcurrencies.addAll(listOf(*mediaConcurrencies))
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(mediaConcurrencies: Collection<Any>) {
        _mediaConcurrencies.addAll(mediaConcurrencies)
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
        cdkBuilder.mediaConcurrencies(mediaConcurrencies)
    }

    /** @param name The name of the routing profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile. If no queue is
     *   added, the agent can make only outbound calls.
     */
    public fun queueConfigs(vararg queueConfigs: Any) {
        _queueConfigs.addAll(listOf(*queueConfigs))
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile. If no queue is
     *   added, the agent can make only outbound calls.
     */
    public fun queueConfigs(queueConfigs: Collection<Any>) {
        _queueConfigs.addAll(queueConfigs)
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile. If no queue is
     *   added, the agent can make only outbound calls.
     */
    public fun queueConfigs(queueConfigs: IResolvable) {
        cdkBuilder.queueConfigs(queueConfigs)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRoutingProfileProps {
        if (_mediaConcurrencies.isNotEmpty()) cdkBuilder.mediaConcurrencies(_mediaConcurrencies)
        if (_queueConfigs.isNotEmpty()) cdkBuilder.queueConfigs(_queueConfigs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
