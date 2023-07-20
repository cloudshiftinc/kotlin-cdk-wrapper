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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.Boolean

@CdkDslMarker
public class CfnApplicationApplicationSnapshotConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationSnapshotConfigurationProperty.Builder =
        CfnApplication.ApplicationSnapshotConfigurationProperty.builder()

    public fun snapshotsEnabled(snapshotsEnabled: Boolean) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
    }

    public fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
    }

    public fun build(): CfnApplication.ApplicationSnapshotConfigurationProperty = cdkBuilder.build()
}
