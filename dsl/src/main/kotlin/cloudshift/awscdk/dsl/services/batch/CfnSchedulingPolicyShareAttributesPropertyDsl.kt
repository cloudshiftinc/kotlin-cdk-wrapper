@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

@CdkDslMarker
public class CfnSchedulingPolicyShareAttributesPropertyDsl {
  private val cdkBuilder: CfnSchedulingPolicy.ShareAttributesProperty.Builder =
      CfnSchedulingPolicy.ShareAttributesProperty.builder()

  /**
   * @param shareIdentifier A fair share identifier or fair share identifier prefix.
   * If the string ends with an asterisk (*), this entry specifies the weight factor to use for fair
   * share identifiers that start with that prefix. The list of fair share identifiers in a fair share
   * policy can't overlap. For example, you can't have one that specifies a `shareIdentifier` of
   * `UserA*` and another that specifies a `shareIdentifier` of `UserA-1` .
   *
   * There can be no more than 500 fair share identifiers active in a job queue.
   *
   * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
   */
  public fun shareIdentifier(shareIdentifier: String) {
    cdkBuilder.shareIdentifier(shareIdentifier)
  }

  /**
   * @param weightFactor The weight factor for the fair share identifier.
   * The default value is 1.0. A lower value has a higher priority for compute resources. For
   * example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the
   * compute resources of jobs that use a share identifier with a weight factor of 1.
   *
   * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
   */
  public fun weightFactor(weightFactor: Number) {
    cdkBuilder.weightFactor(weightFactor)
  }

  public fun build(): CfnSchedulingPolicy.ShareAttributesProperty = cdkBuilder.build()
}
