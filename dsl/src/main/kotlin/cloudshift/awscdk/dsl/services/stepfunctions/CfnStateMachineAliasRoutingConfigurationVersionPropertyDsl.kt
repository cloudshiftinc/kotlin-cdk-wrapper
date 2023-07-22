@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias

@CdkDslMarker
public class CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl {
  private val cdkBuilder: CfnStateMachineAlias.RoutingConfigurationVersionProperty.Builder =
      CfnStateMachineAlias.RoutingConfigurationVersionProperty.builder()

  /**
   * @param stateMachineVersionArn The Amazon Resource Name (ARN) that identifies one or two state
   * machine versions defined in the routing configuration. 
   * If you specify the ARN of a second version, it must belong to the same state machine as the
   * first version.
   */
  public fun stateMachineVersionArn(stateMachineVersionArn: String) {
    cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
  }

  /**
   * @param weight The percentage of traffic you want to route to the state machine version. 
   * The sum of the weights in the routing configuration must be equal to 100.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnStateMachineAlias.RoutingConfigurationVersionProperty = cdkBuilder.build()
}
