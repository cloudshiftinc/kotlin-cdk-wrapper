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

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.m2.CfnEnvironment
import kotlin.String

@CdkDslMarker
public class CfnEnvironmentEfsStorageConfigurationPropertyDsl {
    private val cdkBuilder: CfnEnvironment.EfsStorageConfigurationProperty.Builder =
        CfnEnvironment.EfsStorageConfigurationProperty.builder()

    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    public fun build(): CfnEnvironment.EfsStorageConfigurationProperty = cdkBuilder.build()
}
