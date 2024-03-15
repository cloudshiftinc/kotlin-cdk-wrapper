@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface OnImageScanCompletedOptions : OnEventOptions {
  public fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf45c2c16e38272d1b5548976659dc1c0e2c1bf198af7c1978500dedc86da8d8")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun imageTags(imageTags: List<String>)

    public fun imageTags(vararg imageTags: String)

    public fun ruleName(ruleName: String)

    public fun target(target: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.Builder
        = software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.builder()

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
    @JvmName("bf45c2c16e38272d1b5548976659dc1c0e2c1bf198af7c1978500dedc86da8d8")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun imageTags(imageTags: List<String>) {
      cdkBuilder.imageTags(imageTags)
    }

    override fun imageTags(vararg imageTags: String): Unit = imageTags(imageTags.toList())

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions,
  ) : CdkObject(cdkObject), OnImageScanCompletedOptions {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OnImageScanCompletedOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions):
        OnImageScanCompletedOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnImageScanCompletedOptions):
        software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions
  }
}
