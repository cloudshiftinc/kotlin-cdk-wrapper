package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

public interface CrossRegionSupport {
  /**
   * The replication Bucket used by CodePipeline to operate in this region.
   *
   * Belongs to `stack`.
   */
  public fun replicationBucket(): IBucket

  /**
   * The Stack that has been created to house the replication Bucket required for this  region.
   */
  public fun stack(): Stack

  /**
   * A builder for [CrossRegionSupport]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param replicationBucket The replication Bucket used by CodePipeline to operate in this
     * region. 
     * Belongs to `stack`.
     */
    public fun replicationBucket(replicationBucket: IBucket)

    /**
     * @param stack The Stack that has been created to house the replication Bucket required for
     * this  region. 
     */
    public fun stack(stack: Stack)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CrossRegionSupport.Builder
        = software.amazon.awscdk.services.codepipeline.CrossRegionSupport.builder()

    /**
     * @param replicationBucket The replication Bucket used by CodePipeline to operate in this
     * region. 
     * Belongs to `stack`.
     */
    override fun replicationBucket(replicationBucket: IBucket) {
      cdkBuilder.replicationBucket(replicationBucket.let(IBucket::unwrap))
    }

    /**
     * @param stack The Stack that has been created to house the replication Bucket required for
     * this  region. 
     */
    override fun stack(stack: Stack) {
      cdkBuilder.stack(stack.let(Stack::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CrossRegionSupport =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CrossRegionSupport,
  ) : CdkObject(cdkObject), CrossRegionSupport {
    /**
     * The replication Bucket used by CodePipeline to operate in this region.
     *
     * Belongs to `stack`.
     */
    override fun replicationBucket(): IBucket =
        unwrap(this).getReplicationBucket().let(IBucket::wrap)

    /**
     * The Stack that has been created to house the replication Bucket required for this  region.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionSupport {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CrossRegionSupport):
        CrossRegionSupport = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossRegionSupport):
        software.amazon.awscdk.services.codepipeline.CrossRegionSupport = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CrossRegionSupport
  }
}
