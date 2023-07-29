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

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.workspaces.CfnWorkspace

/**
 * Information about a WorkSpace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspaces.*;
 * WorkspacePropertiesProperty workspacePropertiesProperty = WorkspacePropertiesProperty.builder()
 * .computeTypeName("computeTypeName")
 * .rootVolumeSizeGib(123)
 * .runningMode("runningMode")
 * .runningModeAutoStopTimeoutInMinutes(123)
 * .userVolumeSizeGib(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html)
 */
@CdkDslMarker
public class CfnWorkspaceWorkspacePropertiesPropertyDsl {
    private val cdkBuilder: CfnWorkspace.WorkspacePropertiesProperty.Builder =
        CfnWorkspace.WorkspacePropertiesProperty.builder()

    /**
     * @param computeTypeName The compute type. For more information, see
     *   [Amazon WorkSpaces Bundles](https://docs.aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles)
     *   .
     */
    public fun computeTypeName(computeTypeName: String) {
        cdkBuilder.computeTypeName(computeTypeName)
    }

    /**
     * @param rootVolumeSizeGib The size of the root volume. For important information about how to
     *   modify the size of the root and user volumes, see
     *   [Modify a WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html)
     *   .
     */
    public fun rootVolumeSizeGib(rootVolumeSizeGib: Number) {
        cdkBuilder.rootVolumeSizeGib(rootVolumeSizeGib)
    }

    /**
     * @param runningMode The running mode. For more information, see
     *   [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html)
     *   .
     *
     * The `MANUAL` value is only supported by Amazon WorkSpaces Core. Contact your account team to
     * be allow-listed to use this value. For more information, see
     * [Amazon WorkSpaces Core](https://docs.aws.amazon.com/workspaces/core/) .
     */
    public fun runningMode(runningMode: String) {
        cdkBuilder.runningMode(runningMode)
    }

    /**
     * @param runningModeAutoStopTimeoutInMinutes The time after a user logs off when WorkSpaces are
     *   automatically stopped. Configured in 60-minute intervals.
     */
    public fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number) {
        cdkBuilder.runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes)
    }

    /**
     * @param userVolumeSizeGib The size of the user storage. For important information about how to
     *   modify the size of the root and user volumes, see
     *   [Modify a WorkSpace](https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html)
     *   .
     */
    public fun userVolumeSizeGib(userVolumeSizeGib: Number) {
        cdkBuilder.userVolumeSizeGib(userVolumeSizeGib)
    }

    public fun build(): CfnWorkspace.WorkspacePropertiesProperty = cdkBuilder.build()
}
