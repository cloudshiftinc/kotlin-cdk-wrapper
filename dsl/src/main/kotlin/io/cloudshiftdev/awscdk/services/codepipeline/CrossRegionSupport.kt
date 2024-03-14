package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

public interface CrossRegionSupport {
  public fun replicationBucket(): IBucket

  public fun stack(): Stack

  public interface Builder {
    public fun replicationBucket(replicationBucket: IBucket)

    public fun stack(stack: Stack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CrossRegionSupport.Builder
        = software.amazon.awscdk.services.codepipeline.CrossRegionSupport.builder()

    override fun replicationBucket(replicationBucket: IBucket) {
      cdkBuilder.replicationBucket(replicationBucket.let(IBucket::unwrap))
    }

    override fun stack(stack: Stack) {
      cdkBuilder.stack(stack.let(Stack::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CrossRegionSupport =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.CrossRegionSupport,
  ) : CrossRegionSupport {
    override fun replicationBucket(): IBucket =
        unwrap(this).getReplicationBucket().let(IBucket::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionSupport {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CrossRegionSupport):
        CrossRegionSupport = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossRegionSupport):
        software.amazon.awscdk.services.codepipeline.CrossRegionSupport = (wrapped as
        Wrapper).cdkObject
  }
}
