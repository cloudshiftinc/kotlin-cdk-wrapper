@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.constructs.Construct

/**
 * The following resource is now deprecated.
 *
 * This resource can no longer be provisioned via stack create or update operations, and should not
 * be included in your stack templates.
 *
 *
 * We recommend migrating to AWS IoT Greengrass Version 2. For more information, see [Support
 * Changes: May 2,
 * 2022](https://docs.aws.amazon.com/robomaker/latest/dg/chapter-support-policy.html#software-support-policy-may2022)
 * in the *AWS RoboMaker Developer Guide* .
 *
 *
 * The `AWS::RoboMaker::RobotApplication` resource creates an AWS RoboMaker robot.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnRobot cfnRobot = CfnRobot.Builder.create(this, "MyCfnRobot")
 * .architecture("architecture")
 * .greengrassGroupId("greengrassGroupId")
 * // the properties below are optional
 * .fleet("fleet")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html)
 */
@CdkDslMarker
public class CfnRobotDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRobot.Builder = CfnRobot.Builder.create(scope, id)

  /**
   * The architecture of the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-architecture)
   * @param architecture The architecture of the robot. 
   */
  public fun architecture(architecture: String) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-fleet)
   * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   * 
   */
  public fun fleet(fleet: String) {
    cdkBuilder.fleet(fleet)
  }

  /**
   * The Greengrass group associated with the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-greengrassgroupid)
   * @param greengrassGroupId The Greengrass group associated with the robot. 
   */
  public fun greengrassGroupId(greengrassGroupId: String) {
    cdkBuilder.greengrassGroupId(greengrassGroupId)
  }

  /**
   * The name of the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-name)
   * @param name The name of the robot. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A map that contains tag keys and tag values that are attached to the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-tags)
   * @param tags A map that contains tag keys and tag values that are attached to the robot. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRobot = cdkBuilder.build()
}
