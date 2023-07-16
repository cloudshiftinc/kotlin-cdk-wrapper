@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@CdkDslMarker
public class CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder =
      CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder()

  public
      fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number) {
    cdkBuilder.maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds)
  }

  public fun policyDurationSeconds(policyDurationSeconds: Number) {
    cdkBuilder.policyDurationSeconds(policyDurationSeconds)
  }

  public fun build(): CfnGameSessionQueue.PlayerLatencyPolicyProperty = cdkBuilder.build()
}
