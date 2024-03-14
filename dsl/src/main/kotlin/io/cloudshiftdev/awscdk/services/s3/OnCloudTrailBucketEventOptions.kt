package io.cloudshiftdev.awscdk.services.s3

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
  public fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c174af5d348c3b44206b50ca2e4564db118444a9b9d371618f8a7ec1f89826")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun paths(paths: List<String>)

    public fun ruleName(ruleName: String)

    public fun target(target: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions.Builder =
        software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions.builder()

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
    @JvmName("97c174af5d348c3b44206b50ca2e4564db118444a9b9d371618f8a7ec1f89826")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun paths(paths: List<String>) {
      cdkBuilder.paths(paths)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions,
  ) : OnCloudTrailBucketEventOptions {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

    override fun ruleName(): String? = unwrap(this).getRuleName()

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
