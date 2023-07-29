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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.sns.ITopic

/**
 * Construction properties for a CloudFormationStackNotificationCheck.
 *
 * Example:
 * ```
 * // topics to which CloudFormation stacks may send event notifications
 * Topic topic1 = new Topic(this, "AllowedTopic1");
 * Topic topic2 = new Topic(this, "AllowedTopic2");
 * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
 * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
 * CloudFormationStackNotificationCheck.Builder.create(this, "NotificationCheck")
 * .topics(List.of(topic1, topic2))
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFormationStackNotificationCheckPropsDsl {
    private val cdkBuilder: CloudFormationStackNotificationCheckProps.Builder =
        CloudFormationStackNotificationCheckProps.builder()

    private val _topics: MutableList<ITopic> = mutableListOf()

    /** @param configRuleName A name for the AWS Config rule. */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /** @param description A description about this AWS Config rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     *   evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /** @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. */
    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    /** @param topics A list of allowed topics. At most 5 topics. */
    public fun topics(vararg topics: ITopic) {
        _topics.addAll(listOf(*topics))
    }

    /** @param topics A list of allowed topics. At most 5 topics. */
    public fun topics(topics: Collection<ITopic>) {
        _topics.addAll(topics)
    }

    public fun build(): CloudFormationStackNotificationCheckProps {
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
