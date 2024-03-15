@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface RedriveAllowPolicy {
  public fun redrivePermission(): RedrivePermission? =
      unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

  public fun sourceQueues(): List<IQueue> = unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun redrivePermission(redrivePermission: RedrivePermission)

    public fun sourceQueues(sourceQueues: List<IQueue>)

    public fun sourceQueues(vararg sourceQueues: IQueue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.RedriveAllowPolicy.Builder =
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy.builder()

    override fun redrivePermission(redrivePermission: RedrivePermission) {
      cdkBuilder.redrivePermission(redrivePermission.let(RedrivePermission::unwrap))
    }

    override fun sourceQueues(sourceQueues: List<IQueue>) {
      cdkBuilder.sourceQueues(sourceQueues.map(IQueue::unwrap))
    }

    override fun sourceQueues(vararg sourceQueues: IQueue): Unit =
        sourceQueues(sourceQueues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.RedriveAllowPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy,
  ) : CdkObject(cdkObject), RedriveAllowPolicy {
    override fun redrivePermission(): RedrivePermission? =
        unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

    override fun sourceQueues(): List<IQueue> = unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RedriveAllowPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy):
        RedriveAllowPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedriveAllowPolicy):
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy
  }
}
