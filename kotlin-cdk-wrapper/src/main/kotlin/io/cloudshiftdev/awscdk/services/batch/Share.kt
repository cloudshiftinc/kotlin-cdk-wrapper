@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Represents a group of Job Definitions.
 *
 * All Job Definitions that
 * declare a share identifier will be considered members of the Share
 * defined by that share identifier.
 *
 * The Scheduler divides the maximum available vCPUs of the ComputeEnvironment
 * among Jobs in the Queue based on their shareIdentifier and the weightFactor
 * associated with that shareIdentifier.
 *
 * Example:
 *
 * ```
 * FairshareSchedulingPolicy fairsharePolicy = new FairshareSchedulingPolicy(this,
 * "myFairsharePolicy");
 * fairsharePolicy.addShare(Share.builder()
 * .shareIdentifier("A")
 * .weightFactor(1)
 * .build());
 * fairsharePolicy.addShare(Share.builder()
 * .shareIdentifier("B")
 * .weightFactor(1)
 * .build());
 * JobQueue.Builder.create(this, "JobQueue")
 * .schedulingPolicy(fairsharePolicy)
 * .build();
 * ```
 */
public interface Share {
  /**
   * The identifier of this Share.
   *
   * All jobs that specify this share identifier
   * when submitted to the queue will be considered as part of this Share.
   */
  public fun shareIdentifier(): String

  /**
   * The weight factor given to this Share.
   *
   * The Scheduler decides which jobs to put in the Compute Environment
   * such that the following ratio is equal for each job:
   *
   * `sharevCpu / weightFactor`,
   *
   * where `sharevCpu` is the total amount of vCPU given to that particular share; that is,
   * the sum of the vCPU of each job currently in the Compute Environment for that share.
   *
   * See the readme of this module for a detailed example that shows how these are used,
   * how it relates to `computeReservation`, and how `shareDecay` affects these calculations.
   */
  public fun weightFactor(): Number

  /**
   * A builder for [Share]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param shareIdentifier The identifier of this Share. 
     * All jobs that specify this share identifier
     * when submitted to the queue will be considered as part of this Share.
     */
    public fun shareIdentifier(shareIdentifier: String)

    /**
     * @param weightFactor The weight factor given to this Share. 
     * The Scheduler decides which jobs to put in the Compute Environment
     * such that the following ratio is equal for each job:
     *
     * `sharevCpu / weightFactor`,
     *
     * where `sharevCpu` is the total amount of vCPU given to that particular share; that is,
     * the sum of the vCPU of each job currently in the Compute Environment for that share.
     *
     * See the readme of this module for a detailed example that shows how these are used,
     * how it relates to `computeReservation`, and how `shareDecay` affects these calculations.
     */
    public fun weightFactor(weightFactor: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Share.Builder =
        software.amazon.awscdk.services.batch.Share.builder()

    /**
     * @param shareIdentifier The identifier of this Share. 
     * All jobs that specify this share identifier
     * when submitted to the queue will be considered as part of this Share.
     */
    override fun shareIdentifier(shareIdentifier: String) {
      cdkBuilder.shareIdentifier(shareIdentifier)
    }

    /**
     * @param weightFactor The weight factor given to this Share. 
     * The Scheduler decides which jobs to put in the Compute Environment
     * such that the following ratio is equal for each job:
     *
     * `sharevCpu / weightFactor`,
     *
     * where `sharevCpu` is the total amount of vCPU given to that particular share; that is,
     * the sum of the vCPU of each job currently in the Compute Environment for that share.
     *
     * See the readme of this module for a detailed example that shows how these are used,
     * how it relates to `computeReservation`, and how `shareDecay` affects these calculations.
     */
    override fun weightFactor(weightFactor: Number) {
      cdkBuilder.weightFactor(weightFactor)
    }

    public fun build(): software.amazon.awscdk.services.batch.Share = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.Share,
  ) : CdkObject(cdkObject), Share {
    /**
     * The identifier of this Share.
     *
     * All jobs that specify this share identifier
     * when submitted to the queue will be considered as part of this Share.
     */
    override fun shareIdentifier(): String = unwrap(this).getShareIdentifier()

    /**
     * The weight factor given to this Share.
     *
     * The Scheduler decides which jobs to put in the Compute Environment
     * such that the following ratio is equal for each job:
     *
     * `sharevCpu / weightFactor`,
     *
     * where `sharevCpu` is the total amount of vCPU given to that particular share; that is,
     * the sum of the vCPU of each job currently in the Compute Environment for that share.
     *
     * See the readme of this module for a detailed example that shows how these are used,
     * how it relates to `computeReservation`, and how `shareDecay` affects these calculations.
     */
    override fun weightFactor(): Number = unwrap(this).getWeightFactor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Share {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Share): Share =
        CdkObjectWrappers.wrap(cdkObject) as? Share ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Share): software.amazon.awscdk.services.batch.Share = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.Share
  }
}
