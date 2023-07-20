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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder =
        CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

    public fun maxBackupsToRetain(maxBackupsToRetain: Number) {
        cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnLaunchProfile.StreamConfigurationSessionBackupProperty = cdkBuilder.build()
}
