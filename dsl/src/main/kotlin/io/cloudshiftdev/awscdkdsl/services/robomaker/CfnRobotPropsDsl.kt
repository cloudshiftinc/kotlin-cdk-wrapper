@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.robomaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnRobotProps

/**
 * Properties for defining a `CfnRobot`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
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
@CdkDslMarker
public class CfnRobotPropsDsl {
    private val cdkBuilder: CfnRobotProps.Builder = CfnRobotProps.builder()

    /** @param architecture The architecture of the robot. */
    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    /**
     * @param fleet The Amazon Resource Name (ARN) of the fleet to which the robot will be
     *   registered.
     */
    public fun fleet(fleet: String) {
        cdkBuilder.fleet(fleet)
    }

    /** @param greengrassGroupId The Greengrass group associated with the robot. */
    public fun greengrassGroupId(greengrassGroupId: String) {
        cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    /** @param name The name of the robot. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags A map that contains tag keys and tag values that are attached to the robot. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnRobotProps = cdkBuilder.build()
}
