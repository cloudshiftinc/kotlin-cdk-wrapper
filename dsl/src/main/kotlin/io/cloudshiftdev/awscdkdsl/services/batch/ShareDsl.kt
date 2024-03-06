@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.Share

/**
 * Represents a group of Job Definitions.
 *
 * All Job Definitions that declare a share identifier will be considered members of the Share
 * defined by that share identifier.
 *
 * The Scheduler divides the maximum available vCPUs of the ComputeEnvironment among Jobs in the
 * Queue based on their shareIdentifier and the weightFactor associated with that shareIdentifier.
 *
 * Example:
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
@CdkDslMarker
public class ShareDsl {
    private val cdkBuilder: Share.Builder = Share.builder()

    /**
     * @param shareIdentifier The identifier of this Share. All jobs that specify this share
     *   identifier when submitted to the queue will be considered as part of this Share.
     */
    public fun shareIdentifier(shareIdentifier: String) {
        cdkBuilder.shareIdentifier(shareIdentifier)
    }

    /**
     * @param weightFactor The weight factor given to this Share. The Scheduler decides which jobs
     *   to put in the Compute Environment such that the following ratio is equal for each job:
     *
     * `sharevCpu / weightFactor`,
     *
     * where `sharevCpu` is the total amount of vCPU given to that particular share; that is, the
     * sum of the vCPU of each job currently in the Compute Environment for that share.
     *
     * See the readme of this module for a detailed example that shows how these are used, how it
     * relates to `computeReservation`, and how `shareDecay` affects these calculations.
     */
    public fun weightFactor(weightFactor: Number) {
        cdkBuilder.weightFactor(weightFactor)
    }

    public fun build(): Share = cdkBuilder.build()
}
