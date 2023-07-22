@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupTargetTrackingConfigurationPropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder =
      CfnGameServerGroup.TargetTrackingConfigurationProperty.builder()

  /**
   * @param targetValue Desired value to use with a game server group target-based scaling policy. 
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnGameServerGroup.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
