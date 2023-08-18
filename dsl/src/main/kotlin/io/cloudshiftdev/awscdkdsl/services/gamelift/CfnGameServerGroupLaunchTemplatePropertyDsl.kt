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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

/**
 * *This data type is used with the GameLift FleetIQ and game server groups.*.
 *
 * An Amazon EC2 launch template that contains configuration settings and game server code to be
 * deployed to all instances in a game server group. The launch template is specified when creating
 * a new game server group with `GameServerGroup` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * LaunchTemplateProperty launchTemplateProperty = LaunchTemplateProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html)
 */
@CdkDslMarker
public class CfnGameServerGroupLaunchTemplatePropertyDsl {
    private val cdkBuilder: CfnGameServerGroup.LaunchTemplateProperty.Builder =
        CfnGameServerGroup.LaunchTemplateProperty.builder()

    /** @param launchTemplateId A unique identifier for an existing Amazon EC2 launch template. */
    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName A readable identifier for an existing Amazon EC2 launch template.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param version The version of the Amazon EC2 launch template to use. If no version is
     *   specified, the default version will be used. With Amazon EC2, you can specify a default
     *   version for a launch template. If none is set, the default is the first version created.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnGameServerGroup.LaunchTemplateProperty = cdkBuilder.build()
}
