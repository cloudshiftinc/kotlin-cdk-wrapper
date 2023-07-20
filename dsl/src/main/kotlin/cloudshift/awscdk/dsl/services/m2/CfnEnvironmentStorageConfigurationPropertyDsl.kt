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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentStorageConfigurationPropertyDsl {
    private val cdkBuilder: CfnEnvironment.StorageConfigurationProperty.Builder =
        CfnEnvironment.StorageConfigurationProperty.builder()

    public fun efs(efs: IResolvable) {
        cdkBuilder.efs(efs)
    }

    public fun efs(efs: CfnEnvironment.EfsStorageConfigurationProperty) {
        cdkBuilder.efs(efs)
    }

    public fun fsx(fsx: IResolvable) {
        cdkBuilder.fsx(fsx)
    }

    public fun fsx(fsx: CfnEnvironment.FsxStorageConfigurationProperty) {
        cdkBuilder.fsx(fsx)
    }

    public fun build(): CfnEnvironment.StorageConfigurationProperty = cdkBuilder.build()
}
