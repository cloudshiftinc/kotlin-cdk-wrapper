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
 * Common options for Events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
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
public interface EventCommonOptions {
  /**
   * The scope to use if the source of the rule and its target are in different Stacks (but in the
   * same account &amp; region).
   *
   * This helps dealing with cycles that often arise in these situations.
   *
   * Default: - none (the main scope will be used, even for cross-stack Events)
   */
  public fun crossStackScope(): Construct? = unwrap(this).getCrossStackScope()?.let(Construct::wrap)

  /**
   * A description of the rule's purpose.
   *
   * Default: - No description
   */
  public fun description(): String? = unwrap(this).getDescription()

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
  public fun eventPattern(): EventPattern? = unwrap(this).getEventPattern()?.let(EventPattern::wrap)

  /**
   * A name for the rule.
   *
   * Default: AWS CloudFormation generates a unique physical ID.
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * A builder for [EventCommonOptions]
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
    @JvmName("049d7415c09e92ccc71acf1adf00a5e512d9443464a486f308048d6ca94e848e")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * @param ruleName A name for the rule.
     */
    public fun ruleName(ruleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventCommonOptions.Builder =
        software.amazon.awscdk.services.events.EventCommonOptions.builder()

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
    @JvmName("049d7415c09e92ccc71acf1adf00a5e512d9443464a486f308048d6ca94e848e")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * @param ruleName A name for the rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.EventCommonOptions,
  ) : CdkObject(cdkObject), EventCommonOptions {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventCommonOptions):
        EventCommonOptions = CdkObjectWrappers.wrap(cdkObject) as? EventCommonOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventCommonOptions):
        software.amazon.awscdk.services.events.EventCommonOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.EventCommonOptions
  }
}
