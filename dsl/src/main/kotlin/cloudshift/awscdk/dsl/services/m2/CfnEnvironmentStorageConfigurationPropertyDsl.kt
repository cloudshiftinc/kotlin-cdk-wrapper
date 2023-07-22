@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentStorageConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.StorageConfigurationProperty.Builder =
      CfnEnvironment.StorageConfigurationProperty.builder()

  /**
   * @param efs Defines the storage configuration for an Amazon EFS file system.
   */
  public fun efs(efs: IResolvable) {
    cdkBuilder.efs(efs)
  }

  /**
   * @param efs Defines the storage configuration for an Amazon EFS file system.
   */
  public fun efs(efs: CfnEnvironment.EfsStorageConfigurationProperty) {
    cdkBuilder.efs(efs)
  }

  /**
   * @param fsx Defines the storage configuration for an Amazon FSx file system.
   */
  public fun fsx(fsx: IResolvable) {
    cdkBuilder.fsx(fsx)
  }

  /**
   * @param fsx Defines the storage configuration for an Amazon FSx file system.
   */
  public fun fsx(fsx: CfnEnvironment.FsxStorageConfigurationProperty) {
    cdkBuilder.fsx(fsx)
  }

  public fun build(): CfnEnvironment.StorageConfigurationProperty = cdkBuilder.build()
}
