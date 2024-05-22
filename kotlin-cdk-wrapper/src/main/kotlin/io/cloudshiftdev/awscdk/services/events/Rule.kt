@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines an EventBridge Rule in this stack.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = handler.toString()"))
 * .build();
 * Rule rule = Rule.Builder.create(this, "rule")
 * .eventPattern(EventPattern.builder()
 * .source(List.of("aws.ec2"))
 * .build())
 * .build();
 * Queue queue = new Queue(this, "Queue");
 * rule.addTarget(LambdaFunction.Builder.create(fn)
 * .deadLetterQueue(queue) // Optional: add a dead letter queue
 * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
 * .retryAttempts(2)
 * .build());
 * ```
 */
public open class Rule(
  cdkObject: software.amazon.awscdk.services.events.Rule,
) : Resource(cdkObject), IRule {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.events.Rule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RuleProps,
  ) :
      this(software.amazon.awscdk.services.events.Rule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(RuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RuleProps.Builder.() -> Unit,
  ) : this(scope, id, RuleProps(props)
  )

  /**
   * Adds an event pattern filter to this rule.
   *
   * If a pattern was already specified,
   * these values are merged into the existing pattern.
   *
   * For example, if the rule already contains the pattern:
   *
   * {
   * "resources": [ "r1" ],
   * "detail": {
   * "hello": [ 1 ]
   * }
   * }
   *
   * And `addEventPattern` is called with the pattern:
   *
   * {
   * "resources": [ "r2" ],
   * "detail": {
   * "foo": [ "bar" ]
   * }
   * }
   *
   * The resulting event pattern will be:
   *
   * {
   * "resources": [ "r1", "r2" ],
   * "detail": {
   * "hello": [ 1 ],
   * "foo": [ "bar" ]
   * }
   * }
   *
   * @param eventPattern
   */
  public open fun addEventPattern() {
    unwrap(this).addEventPattern()
  }

  /**
   * Adds an event pattern filter to this rule.
   *
   * If a pattern was already specified,
   * these values are merged into the existing pattern.
   *
   * For example, if the rule already contains the pattern:
   *
   * {
   * "resources": [ "r1" ],
   * "detail": {
   * "hello": [ 1 ]
   * }
   * }
   *
   * And `addEventPattern` is called with the pattern:
   *
   * {
   * "resources": [ "r2" ],
   * "detail": {
   * "foo": [ "bar" ]
   * }
   * }
   *
   * The resulting event pattern will be:
   *
   * {
   * "resources": [ "r1", "r2" ],
   * "detail": {
   * "hello": [ 1 ],
   * "foo": [ "bar" ]
   * }
   * }
   *
   * @param eventPattern
   */
  public open fun addEventPattern(eventPattern: EventPattern) {
    unwrap(this).addEventPattern(eventPattern.let(EventPattern.Companion::unwrap))
  }

  /**
   * Adds an event pattern filter to this rule.
   *
   * If a pattern was already specified,
   * these values are merged into the existing pattern.
   *
   * For example, if the rule already contains the pattern:
   *
   * {
   * "resources": [ "r1" ],
   * "detail": {
   * "hello": [ 1 ]
   * }
   * }
   *
   * And `addEventPattern` is called with the pattern:
   *
   * {
   * "resources": [ "r2" ],
   * "detail": {
   * "foo": [ "bar" ]
   * }
   * }
   *
   * The resulting event pattern will be:
   *
   * {
   * "resources": [ "r1", "r2" ],
   * "detail": {
   * "hello": [ 1 ],
   * "foo": [ "bar" ]
   * }
   * }
   *
   * @param eventPattern
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1aacddab944920841d7d2aea054a2768b6270f2beeecb913d08ef326324505b")
  public open fun addEventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
      addEventPattern(EventPattern(eventPattern))

  /**
   * Adds a target to the rule. The abstract class RuleTarget can be extended to define new targets.
   *
   * No-op if target is undefined.
   *
   * @param target
   */
  public open fun addTarget() {
    unwrap(this).addTarget()
  }

  /**
   * Adds a target to the rule. The abstract class RuleTarget can be extended to define new targets.
   *
   * No-op if target is undefined.
   *
   * @param target
   */
  public open fun addTarget(target: IRuleTarget) {
    unwrap(this).addTarget(target.let(IRuleTarget.Companion::unwrap))
  }

  /**
   * The value of the event rule Amazon Resource Name (ARN), such as
   * arn:aws:events:us-east-2:123456789012:rule/example.
   */
  public override fun ruleArn(): String = unwrap(this).getRuleArn()

  /**
   * The name event rule.
   */
  public override fun ruleName(): String = unwrap(this).getRuleName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.Rule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The scope to use if the source of the rule and its target are in different Stacks (but in the
     * same account &amp; region).
     *
     * This helps dealing with cycles that often arise in these situations.
     *
     * Default: - none (the main scope will be used, even for cross-stack Events)
     *
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     * different Stacks (but in the same account &amp; region). 
     */
    public fun crossStackScope(crossStackScope: CloudshiftdevConstructsConstruct)

    /**
     * A description of the rule's purpose.
     *
     * Default: - No description
     *
     * @param description A description of the rule's purpose. 
     */
    public fun description(description: String)

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the rule is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The event bus to associate with this rule.
     *
     * Default: - The default event bus.
     *
     * @param eventBus The event bus to associate with this rule. 
     */
    public fun eventBus(eventBus: IEventBus)

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
     * @param eventPattern Additional restrictions for the event to route to the specified target. 
     */
    public fun eventPattern(eventPattern: EventPattern)

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
     * @param eventPattern Additional restrictions for the event to route to the specified target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("994ae001b9447828d08dd212be4705a3b78bdf5259daaf02800345a35fa9ad3d")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * A name for the rule.
     *
     * Default: AWS CloudFormation generates a unique physical ID.
     *
     * @param ruleName A name for the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * The schedule or rate (frequency) that determines when EventBridge runs the rule.
     *
     * You must specify this property, the `eventPattern` property, or both.
     *
     * For more information, see Schedule Expression Syntax for
     * Rules in the Amazon EventBridge User Guide.
     *
     * Default: - None.
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html)
     * @param schedule The schedule or rate (frequency) that determines when EventBridge runs the
     * rule. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * Targets to invoke when this rule matches an event.
     *
     * Input will be the full matched event. If you wish to specify custom
     * target input, use `addTarget(target[, inputOptions])`.
     *
     * Default: - No targets.
     *
     * @param targets Targets to invoke when this rule matches an event. 
     */
    public fun targets(targets: List<IRuleTarget>)

    /**
     * Targets to invoke when this rule matches an event.
     *
     * Input will be the full matched event. If you wish to specify custom
     * target input, use `addTarget(target[, inputOptions])`.
     *
     * Default: - No targets.
     *
     * @param targets Targets to invoke when this rule matches an event. 
     */
    public fun targets(vararg targets: IRuleTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Rule.Builder =
        software.amazon.awscdk.services.events.Rule.Builder.create(scope, id)

    /**
     * The scope to use if the source of the rule and its target are in different Stacks (but in the
     * same account &amp; region).
     *
     * This helps dealing with cycles that often arise in these situations.
     *
     * Default: - none (the main scope will be used, even for cross-stack Events)
     *
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     * different Stacks (but in the same account &amp; region). 
     */
    override fun crossStackScope(crossStackScope: CloudshiftdevConstructsConstruct) {
      cdkBuilder.crossStackScope(crossStackScope.let(CloudshiftdevConstructsConstruct.Companion::unwrap))
    }

    /**
     * A description of the rule's purpose.
     *
     * Default: - No description
     *
     * @param description A description of the rule's purpose. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the rule is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The event bus to associate with this rule.
     *
     * Default: - The default event bus.
     *
     * @param eventBus The event bus to associate with this rule. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

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
     * @param eventPattern Additional restrictions for the event to route to the specified target. 
     */
    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern.Companion::unwrap))
    }

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
     * @param eventPattern Additional restrictions for the event to route to the specified target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("994ae001b9447828d08dd212be4705a3b78bdf5259daaf02800345a35fa9ad3d")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * A name for the rule.
     *
     * Default: AWS CloudFormation generates a unique physical ID.
     *
     * @param ruleName A name for the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * The schedule or rate (frequency) that determines when EventBridge runs the rule.
     *
     * You must specify this property, the `eventPattern` property, or both.
     *
     * For more information, see Schedule Expression Syntax for
     * Rules in the Amazon EventBridge User Guide.
     *
     * Default: - None.
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html)
     * @param schedule The schedule or rate (frequency) that determines when EventBridge runs the
     * rule. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * Targets to invoke when this rule matches an event.
     *
     * Input will be the full matched event. If you wish to specify custom
     * target input, use `addTarget(target[, inputOptions])`.
     *
     * Default: - No targets.
     *
     * @param targets Targets to invoke when this rule matches an event. 
     */
    override fun targets(targets: List<IRuleTarget>) {
      cdkBuilder.targets(targets.map(IRuleTarget.Companion::unwrap))
    }

    /**
     * Targets to invoke when this rule matches an event.
     *
     * Input will be the full matched event. If you wish to specify custom
     * target input, use `addTarget(target[, inputOptions])`.
     *
     * Default: - No targets.
     *
     * @param targets Targets to invoke when this rule matches an event. 
     */
    override fun targets(vararg targets: IRuleTarget): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.events.Rule = cdkBuilder.build()
  }

  public companion object {
    public fun fromEventRuleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventRuleArn: String,
    ): IRule =
        software.amazon.awscdk.services.events.Rule.fromEventRuleArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, eventRuleArn).let(IRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Rule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Rule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Rule): Rule =
        Rule(cdkObject)

    internal fun unwrap(wrapped: Rule): software.amazon.awscdk.services.events.Rule =
        wrapped.cdkObject as software.amazon.awscdk.services.events.Rule
  }
}
