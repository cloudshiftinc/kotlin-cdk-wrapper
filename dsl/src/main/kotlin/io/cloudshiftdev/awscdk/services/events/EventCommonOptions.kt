package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface EventCommonOptions {
  public fun crossStackScope(): Construct? = unwrap(this).getCrossStackScope()?.let(Construct::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventPattern(): EventPattern? = unwrap(this).getEventPattern()?.let(EventPattern::wrap)

  public fun ruleName(): String? = unwrap(this).getRuleName()

  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049d7415c09e92ccc71acf1adf00a5e512d9443464a486f308048d6ca94e848e")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun ruleName(ruleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventCommonOptions.Builder =
        software.amazon.awscdk.services.events.EventCommonOptions.builder()

    override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049d7415c09e92ccc71acf1adf00a5e512d9443464a486f308048d6ca94e848e")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.EventCommonOptions,
  ) : EventCommonOptions {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventCommonOptions):
        EventCommonOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventCommonOptions):
        software.amazon.awscdk.services.events.EventCommonOptions = (wrapped as Wrapper).cdkObject
  }
}
