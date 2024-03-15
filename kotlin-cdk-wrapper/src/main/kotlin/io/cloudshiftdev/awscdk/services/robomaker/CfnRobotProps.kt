@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnRobot`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnRobotProps cfnRobotProps = CfnRobotProps.builder()
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
public interface CfnRobotProps {
  /**
   * The architecture of the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-architecture)
   */
  public fun architecture(): String

  /**
   * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-fleet)
   */
  public fun fleet(): String? = unwrap(this).getFleet()

  /**
   * The Greengrass group associated with the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-greengrassgroupid)
   */
  public fun greengrassGroupId(): String

  /**
   * The name of the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A map that contains tag keys and tag values that are attached to the robot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnRobotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param architecture The architecture of the robot. 
     */
    public fun architecture(architecture: String)

    /**
     * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be
     * registered.
     */
    public fun fleet(fleet: String)

    /**
     * @param greengrassGroupId The Greengrass group associated with the robot. 
     */
    public fun greengrassGroupId(greengrassGroupId: String)

    /**
     * @param name The name of the robot.
     */
    public fun name(name: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the robot.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotProps.builder()

    /**
     * @param architecture The architecture of the robot. 
     */
    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    /**
     * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be
     * registered.
     */
    override fun fleet(fleet: String) {
      cdkBuilder.fleet(fleet)
    }

    /**
     * @param greengrassGroupId The Greengrass group associated with the robot. 
     */
    override fun greengrassGroupId(greengrassGroupId: String) {
      cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    /**
     * @param name The name of the robot.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to the robot.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotProps,
  ) : CdkObject(cdkObject), CfnRobotProps {
    /**
     * The architecture of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-architecture)
     */
    override fun architecture(): String = unwrap(this).getArchitecture()

    /**
     * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-fleet)
     */
    override fun fleet(): String? = unwrap(this).getFleet()

    /**
     * The Greengrass group associated with the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-greengrassgroupid)
     */
    override fun greengrassGroupId(): String = unwrap(this).getGreengrassGroupId()

    /**
     * The name of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A map that contains tag keys and tag values that are attached to the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRobotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotProps):
        CfnRobotProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRobotProps):
        software.amazon.awscdk.services.robomaker.CfnRobotProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.robomaker.CfnRobotProps
  }
}
