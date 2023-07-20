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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnFileSystem
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFileSystemDiskIopsConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.DiskIopsConfigurationProperty.Builder =
        CfnFileSystem.DiskIopsConfigurationProperty.builder()

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnFileSystem.DiskIopsConfigurationProperty = cdkBuilder.build()
}
