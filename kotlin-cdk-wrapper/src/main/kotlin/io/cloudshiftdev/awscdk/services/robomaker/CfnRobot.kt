@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
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
public open class CfnRobot(
  cdkObject: software.amazon.awscdk.services.robomaker.CfnRobot,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRobotProps,
  ) :
      this(software.amazon.awscdk.services.robomaker.CfnRobot(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRobotProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRobotProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRobotProps(props)
  )

  /**
   * The architecture of the robot.
   */
  public open fun architecture(): String = unwrap(this).getArchitecture()

  /**
   * The architecture of the robot.
   */
  public open fun architecture(`value`: String) {
    unwrap(this).setArchitecture(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the robot.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   */
  public open fun fleet(): String? = unwrap(this).getFleet()

  /**
   * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
   */
  public open fun fleet(`value`: String) {
    unwrap(this).setFleet(`value`)
  }

  /**
   * The Greengrass group associated with the robot.
   */
  public open fun greengrassGroupId(): String = unwrap(this).getGreengrassGroupId()

  /**
   * The Greengrass group associated with the robot.
   */
  public open fun greengrassGroupId(`value`: String) {
    unwrap(this).setGreengrassGroupId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the robot.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the robot.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to the robot.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A map that contains tag keys and tag values that are attached to the robot.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.robomaker.CfnRobot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The architecture of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-architecture)
     * @param architecture The architecture of the robot. 
     */
    public fun architecture(architecture: String)

    /**
     * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-fleet)
     * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be
     * registered. 
     */
    public fun fleet(fleet: String)

    /**
     * The Greengrass group associated with the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-greengrassgroupid)
     * @param greengrassGroupId The Greengrass group associated with the robot. 
     */
    public fun greengrassGroupId(greengrassGroupId: String)

    /**
     * The name of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-name)
     * @param name The name of the robot. 
     */
    public fun name(name: String)

    /**
     * A map that contains tag keys and tag values that are attached to the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the robot. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobot.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobot.Builder.create(scope, id)

    /**
     * The architecture of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-architecture)
     * @param architecture The architecture of the robot. 
     */
    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    /**
     * The Amazon Resource Name (ARN) of the fleet to which the robot will be registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-fleet)
     * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be
     * registered. 
     */
    override fun fleet(fleet: String) {
      cdkBuilder.fleet(fleet)
    }

    /**
     * The Greengrass group associated with the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-greengrassgroupid)
     * @param greengrassGroupId The Greengrass group associated with the robot. 
     */
    override fun greengrassGroupId(greengrassGroupId: String) {
      cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    /**
     * The name of the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-name)
     * @param name The name of the robot. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A map that contains tag keys and tag values that are attached to the robot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html#cfn-robomaker-robot-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the robot. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobot = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.robomaker.CfnRobot.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRobot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRobot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobot): CfnRobot =
        CfnRobot(cdkObject)

    internal fun unwrap(wrapped: CfnRobot): software.amazon.awscdk.services.robomaker.CfnRobot =
        wrapped.cdkObject as software.amazon.awscdk.services.robomaker.CfnRobot
  }
}
