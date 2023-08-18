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
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.constructs.Construct

/**
 * The `AWS::RoboMaker::RobotApplicationVersion` resource creates an AWS RoboMaker robot version.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnRobotApplicationVersion cfnRobotApplicationVersion =
 * CfnRobotApplicationVersion.Builder.create(this, "MyCfnRobotApplicationVersion")
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
 */
@CdkDslMarker
public class CfnRobotApplicationVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRobotApplicationVersion.Builder =
        CfnRobotApplicationVersion.Builder.create(scope, id)

    /**
     * The application information for the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
     *
     * @param application The application information for the robot application.
     */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * The current revision id for the robot application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
     *
     * @param currentRevisionId The current revision id for the robot application.
     */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): CfnRobotApplicationVersion = cdkBuilder.build()
}
