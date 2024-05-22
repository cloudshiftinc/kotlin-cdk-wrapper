@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a Fairshare Scheduling Policy. Instructs the scheduler to allocate ComputeEnvironment
 * vCPUs based on Job shareIdentifiers.
 *
 * The Faireshare Scheduling Policy ensures that each share gets a certain amount of vCPUs.
 * The scheduler does this by deciding how many Jobs of each share to schedule *relative to how many
 * jobs of
 * each share are currently being executed by the ComputeEnvironment*. The weight factors associated
 * with
 * each share determine the ratio of vCPUs allocated; see the readme for a more in-depth discussion
 * of
 * fairshare policies.
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
public open class FairshareSchedulingPolicy(
  cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy,
) : Resource(cdkObject), IFairshareSchedulingPolicy, ISchedulingPolicy {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.FairshareSchedulingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FairshareSchedulingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.batch.FairshareSchedulingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FairshareSchedulingPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FairshareSchedulingPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, FairshareSchedulingPolicyProps(props)
  )

  /**
   * Add a share this to this Fairshare SchedulingPolicy.
   *
   * @param share 
   */
  public open fun addShare(share: Share) {
    unwrap(this).addShare(share.let(Share.Companion::unwrap))
  }

  /**
   * Add a share this to this Fairshare SchedulingPolicy.
   *
   * @param share 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec6ceb5998640af21ae4c6014c8665baf5292eda659901b90444fcde927d46f6")
  public open fun addShare(share: Share.Builder.() -> Unit): Unit = addShare(Share(share))

  /**
   * Used to calculate the percentage of the maximum available vCPU to reserve for share identifiers
   * not present in the Queue.
   *
   * The percentage reserved is defined by the Scheduler as:
   * `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares` is the number of active
   * fair share identifiers.
   *
   * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
   * maximum available vCPU if there's only one fair share identifier.
   * It reserves 25% if there are two fair share identifiers.
   * It reserves 12.5% if there are three fair share identifiers.
   *
   * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the
   * maximum available vCPU if there's only one fair share identifier,
   * 6.25% if there are two fair share identifiers,
   * and 1.56% if there are three fair share identifiers.
   */
  public override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

  /**
   * The arn of this scheduling policy.
   */
  public override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

  /**
   * The name of this scheduling policy.
   */
  public override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

  /**
   * The amount of time to use to measure the usage of each job.
   *
   * The usage is used to calculate a fair share percentage for each fair share identifier currently
   * in the Queue.
   * A value of zero (0) indicates that only current usage is measured.
   * The decay is linear and gives preference to newer jobs.
   *
   * The maximum supported value is 604800 seconds (1 week).
   */
  public override fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

  /**
   * The shares that this Scheduling Policy applies to.
   *
   * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
   * are not recognized by the Scheduling Policy.
   */
  public override fun shares(): List<Share> = unwrap(this).getShares().map(Share::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.FairshareSchedulingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Used to calculate the percentage of the maximum available vCPU to reserve for share
     * identifiers not present in the Queue.
     *
     * The percentage reserved is defined by the Scheduler as:
     * `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares` is the number of active
     * fair share identifiers.
     *
     * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
     * maximum available vCPU if there's only one fair share identifier.
     * It reserves 25% if there are two fair share identifiers.
     * It reserves 12.5% if there are three fair share identifiers.
     *
     * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the
     * maximum available vCPU if there's only one fair share identifier,
     * 6.25% if there are two fair share identifiers,
     * and 1.56% if there are three fair share identifiers.
     *
     * Default: - no vCPU is reserved
     *
     * @param computeReservation Used to calculate the percentage of the maximum available vCPU to
     * reserve for share identifiers not present in the Queue. 
     */
    public fun computeReservation(computeReservation: Number)

    /**
     * The name of this SchedulingPolicy.
     *
     * Default: - generated by CloudFormation
     *
     * @param schedulingPolicyName The name of this SchedulingPolicy. 
     */
    public fun schedulingPolicyName(schedulingPolicyName: String)

    /**
     * The amount of time to use to measure the usage of each job.
     *
     * The usage is used to calculate a fair share percentage for each fair share identifier
     * currently in the Queue.
     * A value of zero (0) indicates that only current usage is measured.
     * The decay is linear and gives preference to newer jobs.
     *
     * The maximum supported value is 604800 seconds (1 week).
     *
     * Default: - 0: only the current job usage is considered
     *
     * @param shareDecay The amount of time to use to measure the usage of each job. 
     */
    public fun shareDecay(shareDecay: Duration)

    /**
     * The shares that this Scheduling Policy applies to.
     *
     * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
     * are not recognized by the Scheduling Policy.
     *
     * Default: - no shares
     *
     * @param shares The shares that this Scheduling Policy applies to. 
     */
    public fun shares(shares: List<Share>)

    /**
     * The shares that this Scheduling Policy applies to.
     *
     * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
     * are not recognized by the Scheduling Policy.
     *
     * Default: - no shares
     *
     * @param shares The shares that this Scheduling Policy applies to. 
     */
    public fun shares(vararg shares: Share)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.Builder
        = software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.Builder.create(scope, id)

    /**
     * Used to calculate the percentage of the maximum available vCPU to reserve for share
     * identifiers not present in the Queue.
     *
     * The percentage reserved is defined by the Scheduler as:
     * `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares` is the number of active
     * fair share identifiers.
     *
     * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
     * maximum available vCPU if there's only one fair share identifier.
     * It reserves 25% if there are two fair share identifiers.
     * It reserves 12.5% if there are three fair share identifiers.
     *
     * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the
     * maximum available vCPU if there's only one fair share identifier,
     * 6.25% if there are two fair share identifiers,
     * and 1.56% if there are three fair share identifiers.
     *
     * Default: - no vCPU is reserved
     *
     * @param computeReservation Used to calculate the percentage of the maximum available vCPU to
     * reserve for share identifiers not present in the Queue. 
     */
    override fun computeReservation(computeReservation: Number) {
      cdkBuilder.computeReservation(computeReservation)
    }

    /**
     * The name of this SchedulingPolicy.
     *
     * Default: - generated by CloudFormation
     *
     * @param schedulingPolicyName The name of this SchedulingPolicy. 
     */
    override fun schedulingPolicyName(schedulingPolicyName: String) {
      cdkBuilder.schedulingPolicyName(schedulingPolicyName)
    }

    /**
     * The amount of time to use to measure the usage of each job.
     *
     * The usage is used to calculate a fair share percentage for each fair share identifier
     * currently in the Queue.
     * A value of zero (0) indicates that only current usage is measured.
     * The decay is linear and gives preference to newer jobs.
     *
     * The maximum supported value is 604800 seconds (1 week).
     *
     * Default: - 0: only the current job usage is considered
     *
     * @param shareDecay The amount of time to use to measure the usage of each job. 
     */
    override fun shareDecay(shareDecay: Duration) {
      cdkBuilder.shareDecay(shareDecay.let(Duration.Companion::unwrap))
    }

    /**
     * The shares that this Scheduling Policy applies to.
     *
     * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
     * are not recognized by the Scheduling Policy.
     *
     * Default: - no shares
     *
     * @param shares The shares that this Scheduling Policy applies to. 
     */
    override fun shares(shares: List<Share>) {
      cdkBuilder.shares(shares.map(Share.Companion::unwrap))
    }

    /**
     * The shares that this Scheduling Policy applies to.
     *
     * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
     * are not recognized by the Scheduling Policy.
     *
     * Default: - no shares
     *
     * @param shares The shares that this Scheduling Policy applies to. 
     */
    override fun shares(vararg shares: Share): Unit = shares(shares.toList())

    public fun build(): software.amazon.awscdk.services.batch.FairshareSchedulingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromFairshareSchedulingPolicyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fairshareSchedulingPolicyArn: String,
    ): IFairshareSchedulingPolicy =
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicy.fromFairshareSchedulingPolicyArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, fairshareSchedulingPolicyArn).let(IFairshareSchedulingPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FairshareSchedulingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FairshareSchedulingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.FairshareSchedulingPolicy):
        FairshareSchedulingPolicy = FairshareSchedulingPolicy(cdkObject)

    internal fun unwrap(wrapped: FairshareSchedulingPolicy):
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.FairshareSchedulingPolicy
  }
}
