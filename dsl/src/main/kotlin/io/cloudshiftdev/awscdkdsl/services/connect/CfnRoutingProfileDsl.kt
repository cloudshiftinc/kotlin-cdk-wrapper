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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRoutingProfile
import software.constructs.Construct

/**
 * Creates a new routing profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnRoutingProfile cfnRoutingProfile = CfnRoutingProfile.Builder.create(this,
 * "MyCfnRoutingProfile")
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
 * .agentAvailabilityTimer("agentAvailabilityTimer")
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
public class CfnRoutingProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoutingProfile.Builder = CfnRoutingProfile.Builder.create(scope, id)

    private val _mediaConcurrencies: MutableList<Any> = mutableListOf()

    private val _queueConfigs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Whether agents with this routing profile will have their routing order calculated based on
     * *time since their last inbound contact* or *longest idle time* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-agentavailabilitytimer)
     *
     * @param agentAvailabilityTimer Whether agents with this routing profile will have their
     *   routing order calculated based on *time since their last inbound contact* or *longest idle
     *   time* .
     */
    public fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
        cdkBuilder.agentAvailabilityTimer(agentAvailabilityTimer)
    }

    /**
     * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-defaultoutboundqueuearn)
     *
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     *   for the routing profile.
     */
    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
        cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    /**
     * The description of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-description)
     *
     * @param description The description of the routing profile.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-instancearn)
     *
     * @param instanceArn The identifier of the Amazon Connect instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     *
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(vararg mediaConcurrencies: Any) {
        _mediaConcurrencies.addAll(listOf(*mediaConcurrencies))
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     *
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(mediaConcurrencies: Collection<Any>) {
        _mediaConcurrencies.addAll(mediaConcurrencies)
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     *
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     *   for this routing profile.
     */
    public fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
        cdkBuilder.mediaConcurrencies(mediaConcurrencies)
    }

    /**
     * The name of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-name)
     *
     * @param name The name of the routing profile.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     *
     * @param queueConfigs The inbound queues associated with the routing profile.
     */
    public fun queueConfigs(vararg queueConfigs: Any) {
        _queueConfigs.addAll(listOf(*queueConfigs))
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     *
     * @param queueConfigs The inbound queues associated with the routing profile.
     */
    public fun queueConfigs(queueConfigs: Collection<Any>) {
        _queueConfigs.addAll(queueConfigs)
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     *
     * @param queueConfigs The inbound queues associated with the routing profile.
     */
    public fun queueConfigs(queueConfigs: IResolvable) {
        cdkBuilder.queueConfigs(queueConfigs)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRoutingProfile {
        if (_mediaConcurrencies.isNotEmpty()) cdkBuilder.mediaConcurrencies(_mediaConcurrencies)
        if (_queueConfigs.isNotEmpty()) cdkBuilder.queueConfigs(_queueConfigs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
