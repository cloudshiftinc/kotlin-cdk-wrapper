@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * Amazon GameLift Anywhere configuration options for your Anywhere fleets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * AnywhereConfigurationProperty anywhereConfigurationProperty =
 * AnywhereConfigurationProperty.builder()
 * .cost("cost")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-anywhereconfiguration.html)
 */
@CdkDslMarker
public class CfnFleetAnywhereConfigurationPropertyDsl {
  private val cdkBuilder: CfnFleet.AnywhereConfigurationProperty.Builder =
      CfnFleet.AnywhereConfigurationProperty.builder()

  /**
   * @param cost The cost to run your fleet per hour. 
   * Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more
   * information about queues, see [Setting up
   * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
   * *Amazon GameLift Developer Guide* .
   */
  public fun cost(cost: String) {
    cdkBuilder.cost(cost)
  }

  public fun build(): CfnFleet.AnywhereConfigurationProperty = cdkBuilder.build()
}
