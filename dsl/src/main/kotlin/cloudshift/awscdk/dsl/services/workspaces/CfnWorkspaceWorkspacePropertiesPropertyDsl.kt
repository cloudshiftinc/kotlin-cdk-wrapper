@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWorkspaceWorkspacePropertiesPropertyDsl {
    private val cdkBuilder: CfnWorkspace.WorkspacePropertiesProperty.Builder =
        CfnWorkspace.WorkspacePropertiesProperty.builder()

    public fun computeTypeName(computeTypeName: String) {
        cdkBuilder.computeTypeName(computeTypeName)
    }

    public fun rootVolumeSizeGib(rootVolumeSizeGib: Number) {
        cdkBuilder.rootVolumeSizeGib(rootVolumeSizeGib)
    }

    public fun runningMode(runningMode: String) {
        cdkBuilder.runningMode(runningMode)
    }

    public fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number) {
        cdkBuilder.runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes)
    }

    public fun userVolumeSizeGib(userVolumeSizeGib: Number) {
        cdkBuilder.userVolumeSizeGib(userVolumeSizeGib)
    }

    public fun build(): CfnWorkspace.WorkspacePropertiesProperty = cdkBuilder.build()
}
