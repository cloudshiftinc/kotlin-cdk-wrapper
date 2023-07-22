@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.RuleProps
import software.amazon.awscdk.services.events.Schedule
import software.constructs.Construct

/**
 * Properties for defining an EventBridge Rule.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .runtime(Runtime.NODEJS_14_X)
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
@CdkDslMarker
public class RulePropsDsl {
  private val cdkBuilder: RuleProps.Builder = RuleProps.builder()

  private val _targets: MutableList<IRuleTarget> = mutableListOf()

  /**
   * @param crossStackScope The scope to use if the source of the rule and its target are in
   * different Stacks (but in the same account &amp; region).
   * This helps dealing with cycles that often arise in these situations.
   */
  public fun crossStackScope(crossStackScope: Construct) {
    cdkBuilder.crossStackScope(crossStackScope)
  }

  /**
   * @param description A description of the rule's purpose.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enabled Indicates whether the rule is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param eventBus The event bus to associate with this rule.
   */
  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  /**
   * @param eventPattern Additional restrictions for the event to route to the specified target.
   * The method that generates the rule probably imposes some type of event
   * filtering. The filtering implied by what you pass here is added
   * on top of that filtering.
   */
  public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(eventPattern)
    cdkBuilder.eventPattern(builder.build())
  }

  /**
   * @param eventPattern Additional restrictions for the event to route to the specified target.
   * The method that generates the rule probably imposes some type of event
   * filtering. The filtering implied by what you pass here is added
   * on top of that filtering.
   */
  public fun eventPattern(eventPattern: EventPattern) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * @param ruleName A name for the rule.
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param schedule The schedule or rate (frequency) that determines when EventBridge runs the
   * rule.
   * You must specify this property, the `eventPattern` property, or both.
   *
   * For more information, see Schedule Expression Syntax for
   * Rules in the Amazon EventBridge User Guide.
   */
  public fun schedule(schedule: Schedule) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param targets Targets to invoke when this rule matches an event.
   * Input will be the full matched event. If you wish to specify custom
   * target input, use `addTarget(target[, inputOptions])`.
   */
  public fun targets(vararg targets: IRuleTarget) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets Targets to invoke when this rule matches an event.
   * Input will be the full matched event. If you wish to specify custom
   * target input, use `addTarget(target[, inputOptions])`.
   */
  public fun targets(targets: Collection<IRuleTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): RuleProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
