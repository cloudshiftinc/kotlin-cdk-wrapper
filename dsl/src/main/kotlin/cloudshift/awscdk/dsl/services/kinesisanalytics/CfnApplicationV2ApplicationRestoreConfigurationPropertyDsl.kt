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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationRestoreConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationRestoreConfigurationProperty.builder()

    public fun applicationRestoreType(applicationRestoreType: String) {
        cdkBuilder.applicationRestoreType(applicationRestoreType)
    }

    public fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
    }

    public fun build(): CfnApplicationV2.ApplicationRestoreConfigurationProperty = cdkBuilder.build()
}
