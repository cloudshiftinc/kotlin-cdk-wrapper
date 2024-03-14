package io.cloudshiftdev.awscdk.services.sqs

import kotlin.Unit
import kotlin.collections.List

public interface RedriveAllowPolicy {
  public fun redrivePermission(): RedrivePermission? =
      unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

  public fun sourceQueues(): List<IQueue> = unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?:
      emptyList()

  public interface Builder {
    public fun redrivePermission(redrivePermission: RedrivePermission) {
    }

    public fun sourceQueues(sourceQueues: List<IQueue>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.RedriveAllowPolicy.Builder =
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy.builder()

    public override fun redrivePermission(redrivePermission: RedrivePermission) {
      cdkBuilder.redrivePermission(redrivePermission.let(RedrivePermission::unwrap))
    }

    public override fun sourceQueues(sourceQueues: List<IQueue>) {
      cdkBuilder.sourceQueues(sourceQueues.map(IQueue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.RedriveAllowPolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy,
  ) : RedriveAllowPolicy {
    public override fun redrivePermission(): RedrivePermission? =
        unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

    public override fun sourceQueues(): List<IQueue> =
        unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RedriveAllowPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy):
        RedriveAllowPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedriveAllowPolicy):
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy = (wrapped as Wrapper).cdkObject
  }
}
