package io.cloudshiftdev.awscdk.services.s3

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

public interface OnCloudTrailBucketEventOptions : OnEventOptions {
  /**
   * Only watch changes to these object paths.
   *
   * Default: - Watch changes to all objects
   */
  public fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

  /**
   * A builder for [OnCloudTrailBucketEventOptions]
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c174af5d348c3b44206b50ca2e4564db118444a9b9d371618f8a7ec1f89826")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * @param paths Only watch changes to these object paths.
     */
    public fun paths(paths: List<String>)

    /**
     * @param paths Only watch changes to these object paths.
     */
    public fun paths(vararg paths: String)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions.Builder =
        software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions.builder()

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
    @JvmName("97c174af5d348c3b44206b50ca2e4564db118444a9b9d371618f8a7ec1f89826")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * @param paths Only watch changes to these object paths.
     */
    override fun paths(paths: List<String>) {
      cdkBuilder.paths(paths)
    }

    /**
     * @param paths Only watch changes to these object paths.
     */
    override fun paths(vararg paths: String): Unit = paths(paths.toList())

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

    public fun build(): software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions,
  ) : OnCloudTrailBucketEventOptions {
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
     * Only watch changes to these object paths.
     *
     * Default: - Watch changes to all objects
     */
    override fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

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

    public operator fun invoke(block: Builder.() -> Unit = {}): OnCloudTrailBucketEventOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions):
        OnCloudTrailBucketEventOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnCloudTrailBucketEventOptions):
        software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions = (wrapped as
        Wrapper).cdkObject
  }
}
