@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.m2.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentEfsStorageConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.EfsStorageConfigurationProperty.Builder =
      CfnEnvironment.EfsStorageConfigurationProperty.builder()

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

  public fun build(): CfnEnvironment.EfsStorageConfigurationProperty = cdkBuilder.build()
}
