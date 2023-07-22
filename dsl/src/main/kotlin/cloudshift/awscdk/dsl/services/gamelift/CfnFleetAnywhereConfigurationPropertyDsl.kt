@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

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
