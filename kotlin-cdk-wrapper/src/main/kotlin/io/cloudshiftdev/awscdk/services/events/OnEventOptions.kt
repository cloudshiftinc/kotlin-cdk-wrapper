@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface OnEventOptions : EventCommonOptions {
  public fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465bca2fc0cbd4bfa50c0bf58a6fec3b52545c857393b56d54a1b8762965529c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun ruleName(ruleName: String)

    public fun target(target: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.OnEventOptions.Builder =
        software.amazon.awscdk.services.events.OnEventOptions.builder()

    override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("465bca2fc0cbd4bfa50c0bf58a6fec3b52545c857393b56d54a1b8762965529c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.OnEventOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.OnEventOptions,
  ) : CdkObject(cdkObject), OnEventOptions {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OnEventOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.OnEventOptions):
        OnEventOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnEventOptions):
        software.amazon.awscdk.services.events.OnEventOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.OnEventOptions
  }
}
