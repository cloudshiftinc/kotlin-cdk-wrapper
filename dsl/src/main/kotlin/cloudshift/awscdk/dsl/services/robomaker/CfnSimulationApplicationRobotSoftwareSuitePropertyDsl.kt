@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

@CdkDslMarker
public class CfnSimulationApplicationRobotSoftwareSuitePropertyDsl {
  private val cdkBuilder: CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder =
      CfnSimulationApplication.RobotSoftwareSuiteProperty.builder()

  /**
   * @param name The name of the robot software suite. 
   * `General` is the only supported value.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version of the robot software suite.
   * Not applicable for General software suite.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSimulationApplication.RobotSoftwareSuiteProperty = cdkBuilder.build()
}
