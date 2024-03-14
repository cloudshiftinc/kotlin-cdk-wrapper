package io.cloudshiftdev.awscdk.services.codecommit

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
  public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

  public interface Builder {
    public fun branches(branches: List<String>) {
    }

    public fun crossStackScope(crossStackScope: Construct) {
    }

    public fun description(description: String) {
    }

    public fun eventPattern(eventPattern: EventPattern) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b41071d7a82339177ac708e2f7dd2b3deda430733805e7c72d71e4125aaf1fb3")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun target(target: IRuleTarget) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.OnCommitOptions.Builder =
        software.amazon.awscdk.services.codecommit.OnCommitOptions.builder()

    public override fun branches(branches: List<String>) {
      cdkBuilder.branches(branches)
    }

    public override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b41071d7a82339177ac708e2f7dd2b3deda430733805e7c72d71e4125aaf1fb3")
    public override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codecommit.OnCommitOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.OnCommitOptions,
  ) : OnCommitOptions {
    public override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    public override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    public override fun ruleName(): String? = unwrap(this).getRuleName()

    public override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
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
