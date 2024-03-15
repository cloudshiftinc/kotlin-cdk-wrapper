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
import kotlin.jvm.JvmName

public interface OnCloudTrailImagePushedOptions : OnEventOptions {
  public fun imageTag(): String? = unwrap(this).getImageTag()

  @CdkDslMarker
  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abcd9f7a482e45c47c6b46cc04076fedb540034e00e06120b4126d9a9d2c1c6d")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun imageTag(imageTag: String)

    public fun ruleName(ruleName: String)

    public fun target(target: IRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions.Builder =
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions.builder()

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
    @JvmName("abcd9f7a482e45c47c6b46cc04076fedb540034e00e06120b4126d9a9d2c1c6d")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions,
  ) : CdkObject(cdkObject), OnCloudTrailImagePushedOptions {
    override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    override fun imageTag(): String? = unwrap(this).getImageTag()

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OnCloudTrailImagePushedOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions):
        OnCloudTrailImagePushedOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnCloudTrailImagePushedOptions):
        software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions
  }
}
