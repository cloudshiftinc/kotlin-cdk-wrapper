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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnMaintenanceWindowTaskCloudWatchOutputConfigPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder =
        CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder()

    public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
    }

    public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
    }

    public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
    }

    public fun build(): CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty = cdkBuilder.build()
}
