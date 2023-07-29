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
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.OnEventOptions
import software.constructs.Construct

/**
 * Standard set of options for `onXxx` event handlers on construct.
 *
 * Example:
 * ```
 * // Lambda function containing logic that evaluates compliance with the rule.
 * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
 * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * // A custom rule that runs on configuration changes of EC2 instances
 * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
 * .configurationChanges(true)
 * .lambdaFunction(evalComplianceFn)
 * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
 * .build();
 * // A rule to detect stack drifts
 * CloudFormationStackDriftDetectionCheck driftRule = new
 * CloudFormationStackDriftDetectionCheck(this, "Drift");
 * // Topic to which compliance notification events will be published
 * Topic complianceTopic = new Topic(this, "ComplianceTopic");
 * // Send notification on compliance change events
 * driftRule.onComplianceChange("ComplianceChange", OnEventOptions.builder()
 * .target(new SnsTopic(complianceTopic))
 * .build());
 * ```
 */
@CdkDslMarker
public class OnEventOptionsDsl {
    private val cdkBuilder: OnEventOptions.Builder = OnEventOptions.builder()

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

    /** @param target The target to register for the event. */
    public fun target(target: IRuleTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): OnEventOptions = cdkBuilder.build()
}
