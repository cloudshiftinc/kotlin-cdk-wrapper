package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface OnCommitOptions : OnEventOptions {
  /**
   * The branch to monitor.
   *
   * Default: - All branches
   */
  public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

  /**
   * A builder for [OnCommitOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param branches The branch to monitor.
     */
    public fun branches(branches: List<String>)

    /**
     * @param branches The branch to monitor.
     */
    public fun branches(vararg branches: String)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b41071d7a82339177ac708e2f7dd2b3deda430733805e7c72d71e4125aaf1fb3")
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
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.OnCommitOptions.Builder =
        software.amazon.awscdk.services.codecommit.OnCommitOptions.builder()

    /**
     * @param branches The branch to monitor.
     */
    override fun branches(branches: List<String>) {
      cdkBuilder.branches(branches)
    }

    /**
     * @param branches The branch to monitor.
     */
    override fun branches(vararg branches: String): Unit = branches(branches.toList())

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b41071d7a82339177ac708e2f7dd2b3deda430733805e7c72d71e4125aaf1fb3")
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

    public fun build(): software.amazon.awscdk.services.codecommit.OnCommitOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.OnCommitOptions,
  ) : OnCommitOptions {
    /**
     * The branch to monitor.
     *
     * Default: - All branches
     */
    override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OnCommitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.OnCommitOptions):
        OnCommitOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnCommitOptions):
        software.amazon.awscdk.services.codecommit.OnCommitOptions = (wrapped as Wrapper).cdkObject
  }
}
