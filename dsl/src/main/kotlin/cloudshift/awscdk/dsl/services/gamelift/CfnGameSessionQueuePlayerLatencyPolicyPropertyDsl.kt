@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@CdkDslMarker
public class CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder =
      CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder()

  /**
   * @param maximumIndividualPlayerLatencyMilliseconds The maximum latency value that is allowed for
   * any player, in milliseconds.
   * All policies must have a value set for this property.
   */
  public
      fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number) {
    cdkBuilder.maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds)
  }

  /**
   * @param policyDurationSeconds The length of time, in seconds, that the policy is enforced while
   * placing a new game session.
   * A null value for this property means that the policy is enforced until the queue times out.
   */
  public fun policyDurationSeconds(policyDurationSeconds: Number) {
    cdkBuilder.policyDurationSeconds(policyDurationSeconds)
  }

  public fun build(): CfnGameSessionQueue.PlayerLatencyPolicyProperty = cdkBuilder.build()
}
