@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.m2.CfnEnvironment

/**
 * Defines the storage configuration for an Amazon FSx file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
 * FsxStorageConfigurationProperty fsxStorageConfigurationProperty =
 * FsxStorageConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .mountPoint("mountPoint")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-fsxstorageconfiguration.html)
 */
@CdkDslMarker
public class CfnEnvironmentFsxStorageConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.FsxStorageConfigurationProperty.Builder =
      CfnEnvironment.FsxStorageConfigurationProperty.builder()

  /**
   * @param fileSystemId The file system identifier. 
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param mountPoint The mount point for the file system. 
   */
  public fun mountPoint(mountPoint: String) {
    cdkBuilder.mountPoint(mountPoint)
  }

  public fun build(): CfnEnvironment.FsxStorageConfigurationProperty = cdkBuilder.build()
}
