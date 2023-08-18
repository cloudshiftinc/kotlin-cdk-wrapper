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

package io.cloudshiftdev.awscdkdsl.services.m2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnEnvironment

/**
 * Defines the storage configuration for a runtime environment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
 * StorageConfigurationProperty storageConfigurationProperty =
 * StorageConfigurationProperty.builder()
 * .efs(EfsStorageConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .mountPoint("mountPoint")
 * .build())
 * .fsx(FsxStorageConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .mountPoint("mountPoint")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-storageconfiguration.html)
 */
@CdkDslMarker
public class CfnEnvironmentStorageConfigurationPropertyDsl {
    private val cdkBuilder: CfnEnvironment.StorageConfigurationProperty.Builder =
        CfnEnvironment.StorageConfigurationProperty.builder()

    /** @param efs Defines the storage configuration for an Amazon EFS file system. */
    public fun efs(efs: IResolvable) {
        cdkBuilder.efs(efs)
    }

    /** @param efs Defines the storage configuration for an Amazon EFS file system. */
    public fun efs(efs: CfnEnvironment.EfsStorageConfigurationProperty) {
        cdkBuilder.efs(efs)
    }

    /** @param fsx Defines the storage configuration for an Amazon FSx file system. */
    public fun fsx(fsx: IResolvable) {
        cdkBuilder.fsx(fsx)
    }

    /** @param fsx Defines the storage configuration for an Amazon FSx file system. */
    public fun fsx(fsx: CfnEnvironment.FsxStorageConfigurationProperty) {
        cdkBuilder.fsx(fsx)
    }

    public fun build(): CfnEnvironment.StorageConfigurationProperty = cdkBuilder.build()
}
