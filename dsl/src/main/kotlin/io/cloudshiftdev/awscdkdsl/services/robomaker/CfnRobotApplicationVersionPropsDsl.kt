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
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps

/**
 * Properties for defining a `CfnRobotApplicationVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnRobotApplicationVersionProps cfnRobotApplicationVersionProps =
 * CfnRobotApplicationVersionProps.builder()
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
 */
@CdkDslMarker
public class CfnRobotApplicationVersionPropsDsl {
    private val cdkBuilder: CfnRobotApplicationVersionProps.Builder =
        CfnRobotApplicationVersionProps.builder()

    /** @param application The application information for the robot application. */
    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    /**
     * @param currentRevisionId The current revision id for the robot application. If you provide a
     *   value and it matches the latest revision ID, a new version will be created.
     */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): CfnRobotApplicationVersionProps = cdkBuilder.build()
}
