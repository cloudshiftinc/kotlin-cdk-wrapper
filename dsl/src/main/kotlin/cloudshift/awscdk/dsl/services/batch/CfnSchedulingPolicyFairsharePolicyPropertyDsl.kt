@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

@CdkDslMarker
public class CfnSchedulingPolicyFairsharePolicyPropertyDsl {
  private val cdkBuilder: CfnSchedulingPolicy.FairsharePolicyProperty.Builder =
      CfnSchedulingPolicy.FairsharePolicyProperty.builder()

  private val _shareDistribution: MutableList<Any> = mutableListOf()

  /**
   * @param computeReservation A value used to reserve some of the available maximum vCPU for fair
   * share identifiers that aren't already used.
   * The reserved ratio is `( *computeReservation* /100)^ *ActiveFairShares*` where
   * `*ActiveFairShares*` is the number of active fair share identifiers.
   *
   * For example, a `computeReservation` value of 50 indicates that AWS Batch reserves 50% of the
   * maximum available vCPU if there's only one fair share identifier. It reserves 25% if there are two
   * fair share identifiers. It reserves 12.5% if there are three fair share identifiers. A
   * `computeReservation` value of 25 indicates that AWS Batch should reserve 25% of the maximum
   * available vCPU if there's only one fair share identifier, 6.25% if there are two fair share
   * identifiers, and 1.56% if there are three fair share identifiers.
   *
   * The minimum value is 0 and the maximum value is 99.
   */
  public fun computeReservation(computeReservation: Number) {
    cdkBuilder.computeReservation(computeReservation)
  }

  /**
   * @param shareDecaySeconds The amount of time (in seconds) to use to calculate a fair share
   * percentage for each fair share identifier in use.
   * A value of zero (0) indicates that only current usage is measured. The decay allows for more
   * recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is
   * 604800 (1 week).
   */
  public fun shareDecaySeconds(shareDecaySeconds: Number) {
    cdkBuilder.shareDecaySeconds(shareDecaySeconds)
  }

  /**
   * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights for
   * the fair share identifiers for the fair share policy.
   * Fair share identifiers that aren't included have a default weight of `1.0` .
   */
  public fun shareDistribution(vararg shareDistribution: Any) {
    _shareDistribution.addAll(listOf(*shareDistribution))
  }

  /**
   * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights for
   * the fair share identifiers for the fair share policy.
   * Fair share identifiers that aren't included have a default weight of `1.0` .
   */
  public fun shareDistribution(shareDistribution: Collection<Any>) {
    _shareDistribution.addAll(shareDistribution)
  }

  /**
   * @param shareDistribution An array of `SharedIdentifier` objects that contain the weights for
   * the fair share identifiers for the fair share policy.
   * Fair share identifiers that aren't included have a default weight of `1.0` .
   */
  public fun shareDistribution(shareDistribution: IResolvable) {
    cdkBuilder.shareDistribution(shareDistribution)
  }

  public fun build(): CfnSchedulingPolicy.FairsharePolicyProperty {
    if(_shareDistribution.isNotEmpty()) cdkBuilder.shareDistribution(_shareDistribution)
    return cdkBuilder.build()
  }
}
