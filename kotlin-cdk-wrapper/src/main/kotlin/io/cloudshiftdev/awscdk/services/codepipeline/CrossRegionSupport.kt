@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

/**
 * An interface representing resources generated in order to support the cross-region capabilities
 * of CodePipeline.
 *
 * You get instances of this interface from the `Pipeline#crossRegionSupport` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Stack stack;
 * CrossRegionSupport crossRegionSupport = CrossRegionSupport.builder()
 * .replicationBucket(bucket)
 * .stack(stack)
 * .build();
 * ```
 */
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
        CrossRegionSupport = CdkObjectWrappers.wrap(cdkObject) as? CrossRegionSupport ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossRegionSupport):
        software.amazon.awscdk.services.codepipeline.CrossRegionSupport = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CrossRegionSupport
  }
}
