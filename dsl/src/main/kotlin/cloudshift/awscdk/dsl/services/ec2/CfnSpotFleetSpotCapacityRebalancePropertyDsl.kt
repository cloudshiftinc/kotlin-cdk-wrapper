@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetSpotCapacityRebalancePropertyDsl {
  private val cdkBuilder: CfnSpotFleet.SpotCapacityRebalanceProperty.Builder =
      CfnSpotFleet.SpotCapacityRebalanceProperty.builder()

  /**
   * @param replacementStrategy The replacement strategy to use. Only available for fleets of type
   * `maintain` .
   * `launch` - Spot Fleet launches a new replacement Spot Instance when a rebalance notification is
   * emitted for an existing Spot Instance in the fleet. Spot Fleet does not terminate the instances
   * that receive a rebalance notification. You can terminate the old instances, or you can leave them
   * running. You are charged for all instances while they are running.
   *
   * `launch-before-terminate` - Spot Fleet launches a new replacement Spot Instance when a
   * rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after a
   * delay that you specify (in `TerminationDelay` ), terminates the instances that received a
   * rebalance notification.
   */
  public fun replacementStrategy(replacementStrategy: String) {
    cdkBuilder.replacementStrategy(replacementStrategy)
  }

  /**
   * @param terminationDelay The amount of time (in seconds) that Amazon EC2 waits before
   * terminating the old Spot Instance after launching a new replacement Spot Instance.
   * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
   *
   * Not valid when `ReplacementStrategy` is set to `launch` .
   *
   * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
   */
  public fun terminationDelay(terminationDelay: Number) {
    cdkBuilder.terminationDelay(terminationDelay)
  }

  public fun build(): CfnSpotFleet.SpotCapacityRebalanceProperty = cdkBuilder.build()
}
