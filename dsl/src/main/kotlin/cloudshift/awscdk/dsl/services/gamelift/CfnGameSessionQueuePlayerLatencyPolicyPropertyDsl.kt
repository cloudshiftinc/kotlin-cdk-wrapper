@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

/**
 * The queue setting that determines the highest latency allowed for individual players when placing
 * a game session.
 *
 * When a latency policy is in force, a game session cannot be placed with any fleet in a Region
 * where a player reports latency higher than the cap. Latency policies are only enforced when the
 * placement request contains player latency information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * PlayerLatencyPolicyProperty playerLatencyPolicyProperty = PlayerLatencyPolicyProperty.builder()
 * .maximumIndividualPlayerLatencyMilliseconds(123)
 * .policyDurationSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html)
 */
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
