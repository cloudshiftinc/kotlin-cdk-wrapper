package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface OnCloudTrailImagePushedOptions : OnEventOptions {
  public fun imageTag(): String? = unwrap(this).getImageTag()

  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct) {
    }

    public fun description(description: String) {
    }

    public fun eventPattern(eventPattern: EventPattern) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abcd9f7a482e45c47c6b46cc04076fedb540034e00e06120b4126d9a9d2c1c6d")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit) {
    }

    public fun imageTag(imageTag: String) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun target(target: IRuleTarget) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions.Builder =
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions.builder()

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
    @JvmName("abcd9f7a482e45c47c6b46cc04076fedb540034e00e06120b4126d9a9d2c1c6d")
    public override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    public override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions,
  ) : OnCloudTrailImagePushedOptions {
    public override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    public override fun imageTag(): String? = unwrap(this).getImageTag()

    public override fun ruleName(): String? = unwrap(this).getRuleName()

    public override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OnCloudTrailImagePushedOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions):
        OnCloudTrailImagePushedOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnCloudTrailImagePushedOptions):
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions = (wrapped as
        Wrapper).cdkObject
  }
}
