@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnRobotProps

@CdkDslMarker
public class CfnRobotPropsDsl {
  private val cdkBuilder: CfnRobotProps.Builder = CfnRobotProps.builder()

  /**
   * @param architecture The architecture of the robot. 
   */
  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   */
  public fun fleet(fleet: String) {
    cdkBuilder.fleet(fleet)
  }

  /**
   * @param greengrassGroupId The Greengrass group associated with the robot. 
   */
  public fun greengrassGroupId(greengrassGroupId: String) {
    cdkBuilder.greengrassGroupId(greengrassGroupId)
  }

  /**
   * @param name The name of the robot.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to the robot.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRobotProps = cdkBuilder.build()
}
