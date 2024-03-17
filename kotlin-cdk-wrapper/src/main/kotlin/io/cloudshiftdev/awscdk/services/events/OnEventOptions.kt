@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Standard set of options for `onXxx` event handlers on construct.
 *
 * Example:
 *
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
public interface OnEventOptions : EventCommonOptions {
  /**
   * The target to register for the event.
   *
   * Default: - No target is added to the rule. Use `addTarget()` to add a target.
   */
  public fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)

  /**
   * A builder for [OnEventOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     * different Stacks (but in the same account &amp; region).
     * This helps dealing with cycles that often arise in these situations.
     */
    public fun crossStackScope(crossStackScope: Construct)

    /**
     * @param description A description of the rule's purpose.
     */
    public fun description(description: String)

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     * The method that generates the rule probably imposes some type of event
     * filtering. The filtering implied by what you pass here is added
     * on top of that filtering.
     */
    public fun eventPattern(eventPattern: EventPattern)

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     * The method that generates the rule probably imposes some type of event
     * filtering. The filtering implied by what you pass here is added
     * on top of that filtering.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465bca2fc0cbd4bfa50c0bf58a6fec3b52545c857393b56d54a1b8762965529c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * @param ruleName A name for the rule.
     */
    public fun ruleName(ruleName: String)

    /**
     * @param target The target to register for the event.
     */
    public fun target(target: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.OnEventOptions.Builder =
        software.amazon.awscdk.services.events.OnEventOptions.builder()

    /**
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     * different Stacks (but in the same account &amp; region).
     * This helps dealing with cycles that often arise in these situations.
     */
    override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    /**
     * @param description A description of the rule's purpose.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     * The method that generates the rule probably imposes some type of event
     * filtering. The filtering implied by what you pass here is added
     * on top of that filtering.
     */
    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     * The method that generates the rule probably imposes some type of event
     * filtering. The filtering implied by what you pass here is added
     * on top of that filtering.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465bca2fc0cbd4bfa50c0bf58a6fec3b52545c857393b56d54a1b8762965529c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * @param ruleName A name for the rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param target The target to register for the event.
     */
    override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.OnEventOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.OnEventOptions,
  ) : CdkObject(cdkObject), OnEventOptions {
    /**
     * The scope to use if the source of the rule and its target are in different Stacks (but in the
     * same account &amp; region).
     *
     * This helps dealing with cycles that often arise in these situations.
     *
     * Default: - none (the main scope will be used, even for cross-stack Events)
     */
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    /**
     * A description of the rule's purpose.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Additional restrictions for the event to route to the specified target.
     *
     * The method that generates the rule probably imposes some type of event
     * filtering. The filtering implied by what you pass here is added
     * on top of that filtering.
     *
     * Default: - No additional filtering based on an event pattern.
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     */
    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    /**
     * A name for the rule.
     *
     * Default: AWS CloudFormation generates a unique physical ID.
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * The target to register for the event.
     *
     * Default: - No target is added to the rule. Use `addTarget()` to add a target.
     */
    override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OnEventOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.OnEventOptions):
        OnEventOptions = CdkObjectWrappers.wrap(cdkObject) as? OnEventOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnEventOptions):
        software.amazon.awscdk.services.events.OnEventOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.OnEventOptions
  }
}
