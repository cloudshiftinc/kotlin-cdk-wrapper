@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetServerProcessPropertyDsl {
  private val cdkBuilder: CfnFleet.ServerProcessProperty.Builder =
      CfnFleet.ServerProcessProperty.builder()

  public fun concurrentExecutions(concurrentExecutions: Number) {
    cdkBuilder.concurrentExecutions(concurrentExecutions)
  }

  public fun launchPath(launchPath: String) {
    cdkBuilder.launchPath(launchPath)
  }

  public fun parameters(parameters: String) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnFleet.ServerProcessProperty = cdkBuilder.build()
}
