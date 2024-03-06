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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * Information about the compute fleet of the build project.
 *
 * For more information, see
 * [Working with reserved capacity in AWS CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/fleets.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ProjectFleetProperty projectFleetProperty = ProjectFleetProperty.builder()
 * .fleetArn("fleetArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfleet.html)
 */
@CdkDslMarker
public class CfnProjectProjectFleetPropertyDsl {
    private val cdkBuilder: CfnProject.ProjectFleetProperty.Builder =
        CfnProject.ProjectFleetProperty.builder()

    /** @param fleetArn Specifies the compute fleet ARN for the build project. */
    public fun fleetArn(fleetArn: String) {
        cdkBuilder.fleetArn(fleetArn)
    }

    public fun build(): CfnProject.ProjectFleetProperty = cdkBuilder.build()
}
